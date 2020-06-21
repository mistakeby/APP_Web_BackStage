package server.controller.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.UserData;
import server.pojo.DataSelect;
import server.pojo.TableResult;
import server.service.DataManagement.DataManagementService;

import java.util.List;

@Controller
@RequestMapping("data/selectbyid")
public class DMControllerById {
    @Autowired
    private DataManagementService dataManagementService;
    @GetMapping
    @ResponseBody
    public ResponseEntity<DataSelect> selectById(@RequestParam ("id") String id) {
         return ResponseEntity.ok(this.dataManagementService.selectById(id));
    }
}
