package api;

import pojo.DailyLog_Common;

import java.util.List;

public interface DailylogUpload {
    int upload_common(DailyLog_Common dailyLog_common);
    List<DailyLog_Common> select_daily();
}
