package server.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageInfo;
import pojo.UserData;
import server.service.api.SelectDataByIdApi;
import server.service.mapper.DataMapper;
import server.service.mapper2.SelectMapper;


import java.util.List;

@Service
@Transactional
public class SelectDataImpl extends BaseMapperImpl implements SelectDataByIdApi {

    @Autowired
    private SelectMapper selectMapper;
    @Override
    public PageInfo<UserData> selectBypaging(int page, int pageSize, UserData queryCondition) {
        QueryWrapper<Object> queryWrapper = new QueryWrapper<>(queryCondition);
        queryWrapper.orderByAsc("userid");
        IPage iPage = super.queryPageList(queryWrapper , page, pageSize);
        return new PageInfo<UserData>(Long.valueOf(iPage.getTotal()).intValue() , page, pageSize, iPage.getRecords());
    }

    @Override
    public List<UserData> selectById(String id) {
        List<UserData> list=this.selectMapper.selectById(id);
        for(UserData user : list) {
            System.out.println(user);
        }
        return list;
    }

}
