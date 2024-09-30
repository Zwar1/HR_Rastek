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
    private Long id_e;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PersonalInfoEntity", referencedColumnName = "ID")
    private PersonalInfoEntity personalInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BasicInfoEntity", referencedColumnName = "id")
    private BasicInfoEntity basicInfo;

}
