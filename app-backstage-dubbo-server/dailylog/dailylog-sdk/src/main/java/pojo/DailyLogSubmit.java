package pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("dailylog_submit")
public class DailyLogSubmit extends BasePojo {
    private static final long serialVersionUID = -1130731057199962292L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String userid;
    private String username;
    private String date;
    private String content;
    private String level;
    private String open;
}
