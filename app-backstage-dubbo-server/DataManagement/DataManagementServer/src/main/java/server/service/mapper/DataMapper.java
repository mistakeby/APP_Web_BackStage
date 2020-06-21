package server.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.UserData;


public interface DataMapper extends BaseMapper<UserData> {
}
