package HR_rastek.demo.DTO;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterReq {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String name;
}
