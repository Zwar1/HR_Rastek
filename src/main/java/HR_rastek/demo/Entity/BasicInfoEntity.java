package HR_rastek.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "basic_info")
public class BasicInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_basic")
    private Long id;

    private String statusKontrak;
    private String tanggalMulaiKontrak;
    private String kontrakKedua;
    private BigDecimal salary;
    private String attachment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_departement", referencedColumnName = "id_departement",nullable = false)
    private DepartementEntity departementEntity;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_division", referencedColumnName = "id_division", nullable = true)
    private DivisionEntity divisionEntity;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_sub", referencedColumnName = "id_sub", nullable = true)
    private SubDivisionEntity subDivisionEntity;

    @ManyToMany
    @JoinTable(
            name = "basic_info_jabatan",
            joinColumns = @JoinColumn(name = "basic_info_id"),
            inverseJoinColumns = @JoinColumn(name = "jabatan_id")
    )
    private List<JabatanEntity> jabatanEntities;
}
