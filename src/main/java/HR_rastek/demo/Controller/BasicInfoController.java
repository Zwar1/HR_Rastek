//package HR_rastek.demo.Controller;
//
//
//import HR_rastek.demo.DTO.BasicInfoRequest;
//import HR_rastek.demo.DTO.BasicInfoResponse;
//import HR_rastek.demo.DTO.WebResponse;
//import HR_rastek.demo.Service.BasicInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class BasicInfoController {
//
//    @Autowired
//    private BasicInfoService basicInfoService;
//
//    @PostMapping(
//            path = "/api/basicInfo",
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public WebResponse<BasicInfoResponse> create(@RequestBody BasicInfoRequest request){
//        BasicInfoResponse basicInfoResponse = basicInfoService.create(request);
//        return WebResponse.<BasicInfoResponse>builder().data(basicInfoResponse).build();
//    }
//}
