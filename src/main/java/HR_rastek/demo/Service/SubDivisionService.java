package HR_rastek.demo.Service;

import HR_rastek.demo.DTO.*;
import HR_rastek.demo.Entity.SubDivisionEntity;
import HR_rastek.demo.Repository.SubDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
public class SubDivisionService {

    @Autowired
    SubDivisionRepository subDivisionRepository;

    @Autowired
    ValidationService validationService;

    @Transactional
    public SubDivisionRes create(SubDivisionReq request) {
        validationService.validate(request);

        SubDivisionEntity subDivision = new SubDivisionEntity();

        subDivision.setSubDivision_name(request.getSubDivision_name());

        subDivisionRepository.save(subDivision);

        return SubDivisionRes.builder()
                .id(subDivision.getId())
                .subDivision_name(subDivision.getSubDivision_name())
                .build();
    }

    @Transactional(readOnly = true)
    public SubDivisionRes get(Long id){
        SubDivisionEntity subDivision = subDivisionRepository.findFirstById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "SubDivision Not Found"));

        return SubDivisionRes.builder()
                .id(subDivision.getId())
                .subDivision_name(subDivision.getSubDivision_name())
                .build();
    }

    @Transactional
    public  SubDivisionRes update(UpdateSubDivisionReq request) {

        validationService.validate(request);


        SubDivisionEntity subDivision = subDivisionRepository.findFirstById(request.getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SubDivision Not Found"));

        subDivision.setSubDivision_name(request.getSubDivision_name());

        subDivisionRepository.save(subDivision);

        return SubDivisionRes.builder()
                .id(subDivision.getId())
                .subDivision_name(subDivision.getSubDivision_name())
                .build();
    }
}
