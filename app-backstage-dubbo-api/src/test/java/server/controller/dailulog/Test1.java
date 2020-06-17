package server.controller.dailulog;

import api.DailylogUpload;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pojo.DailyLog_Common;


import java.util.List;

@SpringBootTest
public class Test1 {

    @Reference(version = "1.0.0")
    private DailylogUpload dailylogUpload ;
    @Test
    public  void testQueryAll(){
       System.out.println("consumer端开始执行");
        List<DailyLog_Common> userList = this.dailylogUpload.select_daily();
        for (DailyLog_Common user : userList) {
            System.out.println(user);
        }
    }
}
