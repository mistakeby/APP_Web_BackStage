package server.service.dubbo;

import api.SelectDataByUserId;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.PageInfo;
import pojo.UserData;
import server.service.api.SelectDataByIdApi;

import java.sql.SQLOutput;
import java.util.List;

@Service(version = "1.0.0")
public class DubboImpl implements SelectDataByUserId {
    @Autowired
    private  SelectDataByIdApi selectDataByIdApi;

    @Override
    public PageInfo<UserData> selectBypaging(int page, int pageSize,UserData queryCondition) {
        return selectDataByIdApi.selectBypaging(page,pageSize,queryCondition);
    }

    @Override
    public List<UserData> selectById(String id) {
        return this.selectDataByIdApi.selectById(id);
    }
}
