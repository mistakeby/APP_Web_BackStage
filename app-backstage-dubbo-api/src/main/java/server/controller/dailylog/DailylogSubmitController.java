package server.controller.dailylog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.DailyLogSubmit;
import server.service.dailylog.DailylogCommonService;
import server.service.dailylog.DailylogSubmitService;

@Controller
@RequestMapping("dailylog/dailylogsubmit")
public class DailylogSubmitController {
    @Autowired
    private DailylogSubmitService dailylogSubmitService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<Void> save(@RequestBody DailyLogSubmit dailyLogSubmit) {
        try {
            boolean bool = this.dailylogSubmitService.save(dailyLogSubmit);
            if (bool) {
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
