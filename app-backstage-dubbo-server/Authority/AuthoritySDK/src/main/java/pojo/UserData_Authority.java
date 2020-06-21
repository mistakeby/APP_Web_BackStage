package pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("authority_management")
public class UserData_Authority implements java.io.Serializable {

    private static final long serialVersionUID = -8002947543274761965L;
    private String userid;
    private String authority;
    private String status;
    private String last;
}
