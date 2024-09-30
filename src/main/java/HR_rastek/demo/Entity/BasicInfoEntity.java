package HR_rastek.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "basic_info")
public class BasicInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jabatan;
    private String divisi;
    private String departement;
    private String statusKontrak;
    private String tanggalMulaiKontrak;
    private String kontrakKedua;
    private BigDecimal salary;
    private String attachment;

}
