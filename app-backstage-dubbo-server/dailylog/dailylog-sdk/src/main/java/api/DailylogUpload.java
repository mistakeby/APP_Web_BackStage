package api;

import pojo.DailyLogSubmit;
import pojo.DailyLog_Common;

import java.util.List;

public interface DailylogUpload {
    int upload_common(DailyLog_Common dailyLog_common);
    int dailylogsubmit(DailyLogSubmit dailyLogSubmit);
    List<DailyLog_Common> select_daily();
}
