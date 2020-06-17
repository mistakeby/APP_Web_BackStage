package server.service.dailylog;

import api.DailylogUpload;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import pojo.DailyLog_Common;

import java.util.List;

@Service
/*******前端对外服务，通过dubbo调用后端服务*******/
public class DailylogCommonService {
    @Reference(version = "1.0.0")
    private DailylogUpload dailylogUpload;

    public boolean save(DailyLog_Common dailyLog_common) {
        int result = this.dailylogUpload.upload_common(dailyLog_common);
        return result == 1;
    }
    public List<DailyLog_Common> select_1()
    {
        System.out.println("consumer端开始执行");
        List<DailyLog_Common> userList = this.dailylogUpload.select_daily();
       /* for (DailyLog_Common user : userList) {
            System.out.println(user);
        }*/
       return userList;
    }
}
