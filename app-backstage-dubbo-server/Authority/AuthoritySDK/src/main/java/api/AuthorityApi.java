package api;

import org.apache.ibatis.annotations.Param;
import pojo.PageInfo_Authority;
import pojo.UserData_Authority;

import java.util.List;

public interface AuthorityApi {
    PageInfo_Authority<UserData_Authority> selectBypaging(int page, int pageSize, UserData_Authority queryCondition);
    List<UserData_Authority> selectById(@Param("id") String id);
}
