package server.service.dailylog;

import api.DailylogUpload;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import pojo.DailyLogSubmit;

@Service
public class DailylogSubmitService {
    @Reference(version = "1.0.0")
    private DailylogUpload dailylogUpload;
    public boolean save(DailyLogSubmit dailyLogSubmit) {
        int result = this.dailylogUpload.dailylogsubmit(dailyLogSubmit);//upload_common(dailyLog_common);
        return result == 1;
    }
}
