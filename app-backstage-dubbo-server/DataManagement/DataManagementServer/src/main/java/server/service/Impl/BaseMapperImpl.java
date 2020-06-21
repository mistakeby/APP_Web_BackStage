package server.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.UserData;
import server.service.mapper.DataMapper;

public abstract class BaseMapperImpl <T> {
    @Autowired
    private BaseMapper<T> baseMapper;
    public IPage<T> queryPageList(QueryWrapper<T> queryWrapper, Integer page,
                                       Integer rows) {
        return this.baseMapper.selectPage(new Page<T>(page, rows), queryWrapper);
    }
}
