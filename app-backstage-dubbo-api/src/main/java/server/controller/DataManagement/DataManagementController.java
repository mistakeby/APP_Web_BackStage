package server.controller.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pojo.DailyLogSubmit;
import pojo.UserData;
import server.pojo.TableResult;
import server.pojo.TableResultData;
import server.service.DataManagement.DataManagementService;

import java.util.List;

@Controller
@RequestMapping("data/dataManagement")
public class DataManagementController {
    @Autowired
    private DataManagementService dataManagementService;
    @GetMapping
    @ResponseBody
    public ResponseEntity<TableResultData> selectBypaging(UserData userData, @RequestParam(name = "currentPage",
            defaultValue = "1") Integer currentPage, @RequestParam(name = "pageSize", defaultValue = "3")
                                                        Integer pageSize) {
        return ResponseEntity.ok(this.dataManagementService.selectBypaging(userData, currentPage, pageSize));
    }
}
