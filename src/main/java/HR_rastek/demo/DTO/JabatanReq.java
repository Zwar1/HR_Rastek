package HR_rastek.demo.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class JabatanReq {

    //Struktural Fields
    private String kode_jabatan;

    private String nama_struktural;

    //Fungsional Fields
    private String nama_fungsional;

}
