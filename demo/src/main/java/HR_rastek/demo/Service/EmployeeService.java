package HR_rastek.demo.Service;

import HR_rastek.demo.DTO.EmployeeDTO;
import HR_rastek.demo.Entity.BasicInfoEntity;
import HR_rastek.demo.Entity.PersonalInfoEntity;
import HR_rastek.demo.Repository.BasicInfoRepository;
import HR_rastek.demo.Repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private BasicInfoRepository basicInfoRepository;

    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    public PersonalInfoEntity addEmployee(BasicInfoEntity basicInfo, PersonalInfoEntity personalInfo) {
        // Set up bi-directional relationship
        basicInfo.setPersonalInfo(personalInfo);

        // Save BasicInfo which will also save PersonalInfo due to cascade
        return personalInfoRepository.save(personalInfo);
    }

}
