package HR_rastek.demo.DTO;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterReq {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String profile;
}
