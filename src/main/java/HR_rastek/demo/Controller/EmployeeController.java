package HR_rastek.demo.Controller;


import HR_rastek.demo.DTO.*;
import HR_rastek.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(
            path = "/api/addEmployee"
    )
    public WebResponse<EmployeeRes> create(@RequestBody EmployeeReq request){
        EmployeeRes employeeRes = employeeService.create(request);
        return WebResponse.<EmployeeRes>builder().data(employeeRes).build();
    }
}
