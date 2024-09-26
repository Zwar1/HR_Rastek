package HR_rastek.demo.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PersonalInfoEntity", referencedColumnName = "id")
    private PersonalInfoEntity personalInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BasicInfoEntity", referencedColumnName = "id")
    private BasicInfoEntity basicInfo;


    //Getter and Setter

    public PersonalInfoEntity getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfoEntity personalInfo) {
        this.personalInfo = personalInfo;
    }

    public BasicInfoEntity getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfoEntity basicInfo) {
        this.basicInfo = basicInfo;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
