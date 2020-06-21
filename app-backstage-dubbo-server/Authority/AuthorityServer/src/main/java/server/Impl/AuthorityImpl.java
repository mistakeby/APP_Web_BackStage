package server.Impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.PageInfo_Authority;
import pojo.UserData_Authority;
import server.SelectMapper.SelectMapper;
import server.api.AuthoritySpringApi;
import java.util.List;
@Service
@Transactional
public class AuthorityImpl extends BaseMapperImpl implements AuthoritySpringApi {
    @Autowired
    private SelectMapper selectMapper;
    @Override
    public PageInfo_Authority<UserData_Authority> selectBypaging(int page, int pageSize, UserData_Authority queryCondition) {
        QueryWrapper<Object> queryWrapper = new QueryWrapper<>(queryCondition);
        queryWrapper.orderByAsc("userid");
        IPage iPage = super.queryPageList(queryWrapper , page, pageSize);
        return new PageInfo_Authority<>(Long.valueOf(iPage.getTotal()).intValue() , page, pageSize, iPage.getRecords());

    }

    @Override
    public List<UserData_Authority> selectById(String id) {
        List<UserData_Authority> list=this.selectMapper.selectById(id);
        for(UserData_Authority user : list) {
            System.out.println(user);
        }
        return list;
    }
}
