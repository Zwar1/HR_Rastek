package HR_rastek.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "departement")

public class DepartementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departement")
    private Long id;

    private String departement_name;

    private String departement_head;

    @OneToMany(mappedBy = "departementEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BasicInfoEntity> basicInfos = new HashSet<>();

    @OneToMany(mappedBy = "departementEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DivisionEntity> divisionEntities = new HashSet<>();
}
