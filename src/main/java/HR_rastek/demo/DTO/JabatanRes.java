package HR_rastek.demo.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class JabatanRes {

    //Struktural Fields
    private Long id;

    private String kode_struktural;

    private String nama_struktural;

    //Fungsional Fields

    private String kode_fungsional;

    private String nama_fungsional;
}
