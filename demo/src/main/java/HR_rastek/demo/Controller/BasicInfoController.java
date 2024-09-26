package HR_rastek.demo.Controller;


import HR_rastek.demo.Service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicInfoController {

    @Autowired
    private BasicInfoService basicInfoService;

}
