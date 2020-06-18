package server.service.api;

import pojo.DailyLogSubmit;
import pojo.DailyLog_Common;

import java.util.List;

/******将dailylog-common的信息提交到数据库中的接口*******/
public interface CommonSpringApi {
    int upload_common(DailyLog_Common dailyLog_common);
    List<DailyLog_Common> select_daily();
}
