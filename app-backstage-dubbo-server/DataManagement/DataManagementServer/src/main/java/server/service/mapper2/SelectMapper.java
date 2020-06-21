package server.service.mapper2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pojo.UserData;

import java.util.List;
@Mapper
public interface SelectMapper {
    @Select("select * from data_management where userid=#{id}")
    List<UserData> selectById(String id);
}
