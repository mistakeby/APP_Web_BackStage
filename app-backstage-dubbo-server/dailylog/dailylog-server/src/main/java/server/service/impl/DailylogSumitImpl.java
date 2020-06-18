package server.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.DailyLogSubmit;
import server.service.api.DailylogSubmitApi;

@Transactional
@Service
public class DailylogSumitImpl  implements DailylogSubmitApi {
   @Autowired
    private BaseMapper<DailyLogSubmit> mapper;
    @Override
    public int dailylogsubmit(DailyLogSubmit dailyLogSubmit) {
        this.mapper.insert(dailyLogSubmit);
        return  1;
    }
}
