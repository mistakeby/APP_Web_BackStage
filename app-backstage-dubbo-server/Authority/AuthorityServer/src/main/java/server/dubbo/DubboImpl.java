package server.dubbo;

import api.AuthorityApi;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.PageInfo_Authority;
import pojo.UserData_Authority;
import server.api.AuthoritySpringApi;

import java.util.List;

@Service(version = "1.0.0")
public class DubboImpl implements AuthorityApi {
    @Autowired
    private AuthoritySpringApi authoritySpringApi;

    @Override
    public PageInfo_Authority<UserData_Authority> selectBypaging(int page, int pageSize, UserData_Authority queryCondition) {
        System.out.println("执行了吗---------------3");
        return authoritySpringApi.selectBypaging(page,pageSize,queryCondition);
    }

    @Override
    public List<UserData_Authority> selectById(String id) {
        return this.authoritySpringApi.selectById(id);
    }
}
