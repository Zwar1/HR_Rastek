package HR_rastek.demo.Controller;

import HR_rastek.demo.DTO.RegisterReq;
import HR_rastek.demo.DTO.WebResponse;
import HR_rastek.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(
            path = "/api/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> register(@RequestBody RegisterReq request){
        userService.register(request);
        return WebResponse.<String>builder().data("OK").build();
    }
}
