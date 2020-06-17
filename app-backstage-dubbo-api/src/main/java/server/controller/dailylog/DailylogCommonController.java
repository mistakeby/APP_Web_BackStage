package server.controller.dailylog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pojo.DailyLog_Common;
import server.service.dailylog.DailylogCommonService;

import java.util.List;

@Controller
@RequestMapping("dailylog/dailylogcommon")
public class DailylogCommonController {
    @Autowired
    private DailylogCommonService dailylogCommonService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<Void> save(@RequestBody DailyLog_Common dailyLog_common) {
        System.out.println("post------------------");
        try {
            boolean bool = this.dailylogCommonService.save(dailyLog_common);
            if (bool) {
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    @GetMapping
    @ResponseBody
    public ResponseEntity<String> get(){
        System.out.println("get----------------");
        List<DailyLog_Common> userList = this.dailylogCommonService.select_1();
        //return ResponseEntity.ok("ok");
        return ResponseEntity.ok(userList.toString());

    }
}
