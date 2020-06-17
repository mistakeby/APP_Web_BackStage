package pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("dailylog_common")
public class DailyLog_Common extends BasePojo{

    private static final long serialVersionUID = 4855876462193403642L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private String content;
}
