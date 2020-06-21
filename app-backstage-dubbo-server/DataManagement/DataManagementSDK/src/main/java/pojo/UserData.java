package pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("data_management")
public class UserData implements java.io.Serializable {
    private static final long serialVersionUID = 6626749004254447345L;
    private String userid;
    private String topic;
    private String city;
    private String district;
    private String street;
    private String description;
    private String type;
    private String path;
}
