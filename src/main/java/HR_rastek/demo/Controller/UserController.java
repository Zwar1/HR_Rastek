package HR_rastek.demo.Controller;

import HR_rastek.demo.DTO.CreateUserReq;
import HR_rastek.demo.DTO.RegisterReq;
import HR_rastek.demo.DTO.UserRes;
import HR_rastek.demo.DTO.WebResponse;
import HR_rastek.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public WebResponse<UserRes> Create(@RequestBody CreateUserReq request){
        UserRes registerUserResponse = userService.Create_User(request);
        return WebResponse.<UserRes>builder().data(registerUserResponse).message("Success").build();
    }
}
