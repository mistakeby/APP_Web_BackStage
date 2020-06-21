package server.SelectMapper;

import org.apache.ibatis.annotations.Select;
import pojo.UserData_Authority;

import java.util.List;

public interface SelectMapper {
    @Select("select * from authority_management  where userid=#{id}")
    List<UserData_Authority> selectById(String id);
}
