package server.service.dubbo;

import api.DailylogUpload;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.DailyLogSubmit;
import pojo.DailyLog_Common;
import server.service.api.CommonSpringApi;
import server.service.api.DailylogSubmitApi;

import java.util.List;

/*******dubbo端api的实现类*******/
@Service(version="1.0.0")
public class CommonDubboImpl implements DailylogUpload {
    @Autowired
    private CommonSpringApi commonSpringApi;
    @Autowired
    private DailylogSubmitApi dailylogSubmitApi;
    @Override
    public int upload_common(DailyLog_Common dailyLog_common) {
        return this.commonSpringApi.upload_common(dailyLog_common);
    }

    @Override
    public int dailylogsubmit(DailyLogSubmit dailyLogSubmit) {
        return this.dailylogSubmitApi.dailylogsubmit(dailyLogSubmit);
    }

    @Override
    public List<DailyLog_Common> select_daily() {
        return this.commonSpringApi.select_daily();
    }
}
