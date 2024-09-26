package HR_rastek.demo.Service;

import HR_rastek.demo.DTO.BasicInfoRequest;
import HR_rastek.demo.DTO.BasicInfoResponse;
import HR_rastek.demo.Entity.BasicInfoEntity;
import HR_rastek.demo.Repository.BasicInfoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BasicInfoService {

    @Autowired
    private BasicInfoRepository basicInfoRepository;

    @Autowired
    private ValidationService validationService;

    @Transactional
    public BasicInfoResponse create(BasicInfoRequest request){
        validationService.validate(request);

        BasicInfoEntity basicInfo = new BasicInfoEntity();
        basicInfo.setId(UUID.randomUUID().toString());
        basicInfo.setJabatan(request.getJabatan());
        basicInfo.setDivisi(request.getDivisi());
        basicInfo.setDepartement(request.getDepartement());
        basicInfo.setStatusKontrak(request.getStatusKontrak());
        basicInfo.setTanggalMulaiKontrak(request.getTanggalMulaiKontrak());
        basicInfo.setKontrakKedua(request.getKontrakKedua());
        basicInfo.setSalary(request.getSalary());
        basicInfo.setAttachment(request.getAttachment());

        basicInfoRepository.save(basicInfo);

        return BasicInfoResponse.builder()
                .ID(basicInfo.getId())
                .jabatan(basicInfo.getJabatan())
                .divisi(basicInfo.getDivisi())
                .departement(basicInfo.getDepartement())
                .statusKontrak(basicInfo.getStatusKontrak())
                .tanggalMulaiKontrak(basicInfo.getTanggalMulaiKontrak())
                .kontrakKedua(basicInfo.getKontrakKedua())
                .salary(basicInfo.getSalary())
                .attachment(basicInfo.getAttachment())
                .build();
    }
}
