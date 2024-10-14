package HR_rastek.demo.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class UpdateJabatanReq {

    @JsonIgnore
    @NotBlank
    private Long id;

    //Struktural Fields
    private String kode_struktural;

    private String nama_struktural;

    //Fungsional Fields

    private String kode_fungsional;

    private String nama_fungsional;

}