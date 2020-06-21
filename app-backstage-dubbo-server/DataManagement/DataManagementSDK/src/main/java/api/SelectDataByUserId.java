package api;

import org.apache.ibatis.annotations.Param;
import pojo.PageInfo;
import pojo.UserData;

import java.util.List;

public interface SelectDataByUserId {
    PageInfo<UserData> selectBypaging(int page, int pageSize,UserData queryCondition);
    List<UserData>  selectById(@Param("id") String id);
}
