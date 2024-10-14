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
    @JoinColumn(name = "id_personal", referencedColumnName = "id_personal")
    private PersonalInfoEntity personalInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_basicInfo", referencedColumnName = "id_basic")
    private BasicInfoEntity basicInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id_user",nullable = true)
    private UserEntity userEntity;
}
