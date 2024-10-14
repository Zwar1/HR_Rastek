package HR_rastek.demo.Service;


import HR_rastek.demo.DTO.*;
import HR_rastek.demo.Entity.DivisionEntity;
import HR_rastek.demo.Repository.DivisionRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DivisionService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    DivisionRepository divisionRepository;

    @Autowired
    ValidationService validationService;

    @Transactional
    public DivisionRes create(DivisionReq request) {
        validationService.validate(request);

        DivisionEntity division = new DivisionEntity();

        division.setDivision_name(request.getDivision_name());

        divisionRepository.save(division);

        return DivisionRes.builder()
                .id(division.getId())
                .division_name(division.getDivision_name())
                .build();
    }

    @Transactional(readOnly = true)
    public DivisionRes get(Long id){
        DivisionEntity division = divisionRepository.findFirstById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Division Not Found"));

        return DivisionRes.builder()
                .id(division.getId())
                .division_name(division.getDivision_name())
                .build();
    }

    @Transactional
    public DivisionRes update(UpdateDivisionReq request) {
        validationService.validate(request);

        // First, attempt to find the entity. If it's not found, it will throw.
        DivisionEntity division = divisionRepository.findById(request.getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Division Not Found"));

        // Update fields
        division.setDivision_name(request.getDivision_name());

        // Merge and save the updated entity
        DivisionEntity managedDivision = entityManager.merge(division);
        divisionRepository.save(managedDivision); // This might be redundant if you are using merge correctly.

        return DivisionRes.builder()
                .id(managedDivision.getId())
                .division_name(managedDivision.getDivision_name())
                .build();
    }

}
