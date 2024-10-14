package HR_rastek.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jabatan")

public class JabatanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jabatan")
    private Long id;

    private String kode_struktural;

    private String nama_struktural;

    private String kode_fungsional;

    private String nama_fungsional;

    @ManyToMany(mappedBy = "jabatanEntities")
    private Set<BasicInfoEntity> basicInfoEntities;

}
