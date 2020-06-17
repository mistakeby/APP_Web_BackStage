package server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.DailyLog_Common;
import server.mapper.CommonMapper;
import server.service.BaseServiceImpl;
import server.service.api.CommonSpringApi;

import java.util.List;

@Transactional
@Service
/*******实现CommonSpringApi 接口，调用BaseServiceImpl的save方法********/
    public class CommonSpringImpl  extends BaseServiceImpl<DailyLog_Common> implements CommonSpringApi {

        @Autowired
    private CommonMapper commonMapper;
        @Override
    public int upload_common(DailyLog_Common dailyLog_common) {
        return super.save(dailyLog_common);
    }

    @Override
    public List<DailyLog_Common> select_daily() {
        System.out.println(("----- selectAll method test ------"));
        List<DailyLog_Common> userList = commonMapper.selectList(null);
        /*for (DailyLog_Common user : userList) {
            System.out.println(user);
        }*/
        return userList;
    }
}
