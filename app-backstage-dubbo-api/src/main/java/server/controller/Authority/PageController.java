package server.controller.Authority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.UserData;
import pojo.UserData_Authority;
import server.pojo.TableResult;
import server.service.Authority.AuthorityService;
import server.service.DataManagement.DataManagementService;

@Controller
@RequestMapping("Authority/Page")
public class PageController {
    @Autowired
    private AuthorityService authorityService;
    @GetMapping
    @ResponseBody
    public ResponseEntity<TableResult> selectBypaging(UserData_Authority userData, @RequestParam(name = "currentPage",
            defaultValue = "1") Integer currentPage, @RequestParam(name = "pageSize", defaultValue = "3")
                                                              Integer pageSize) {
        return ResponseEntity.ok(this.authorityService.selectBypaging(userData, currentPage, pageSize));
    }
}
