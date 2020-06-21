package server.controller.Authority;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.UserData;
import pojo.UserData_Authority;
import server.pojo.AuthoritySelect;
import server.service.Authority.AuthorityService;
import server.service.DataManagement.DataManagementService;

import javax.print.DocFlavor;
import java.util.List;
@Controller
@RequestMapping("Authority/selectbyid")
public class SelectController {
    @Autowired
    private AuthorityService authorityService;
    @GetMapping
    @ResponseBody
    public ResponseEntity<AuthoritySelect> selectById(@RequestParam("id") String id) {

        return ResponseEntity.ok(this.authorityService.selectById(id));
    }
}
