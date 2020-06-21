package server.service.Authority;

import api.AuthorityApi;
import api.SelectDataByUserId;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.PageInfo;
import pojo.PageInfo_Authority;
import pojo.UserData;
import pojo.UserData_Authority;
import server.pojo.AuthoritySelect;
import server.pojo.Pagination;
import server.pojo.TableResult;
import java.util.List;
@Service
public class AuthorityService {
    @Reference(version = "1.0.0")
    private AuthorityApi authorityApi;

    public TableResult selectBypaging(UserData_Authority userData, @RequestParam(name = "currentPage",
            defaultValue = "1") Integer currentPage, @RequestParam(name = "pageSize", defaultValue = "3")
                                              Integer pageSize)
    {
        PageInfo_Authority<UserData_Authority> pageInfo = this.authorityApi.selectBypaging(currentPage, pageSize, userData);
        Pagination pagination=new Pagination(currentPage, pageSize, pageInfo.getTotal());
        return new TableResult(pageInfo.getRecords(),pagination);
    }
    public AuthoritySelect selectById(@RequestParam ("id") String id)
    {
        return  new AuthoritySelect(this.authorityApi.selectById(id));//this.authorityApi.selectById(id);
    }
}
