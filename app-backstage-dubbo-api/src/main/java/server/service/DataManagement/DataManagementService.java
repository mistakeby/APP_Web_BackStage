package server.service.DataManagement;

import api.SelectDataByUserId;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.PageInfo;
import pojo.UserData;
import server.pojo.DataSelect;
import server.pojo.Pagination;
import server.pojo.TableResult;
import server.pojo.TableResultData;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public class DataManagementService {
    @Reference(version = "1.0.0")
    private SelectDataByUserId selectDataByUserId;

    public TableResultData selectBypaging(UserData userData, @RequestParam(name = "currentPage",
                    defaultValue = "1") Integer currentPage, @RequestParam(name = "pageSize", defaultValue = "3")
            Integer pageSize)
    {
        PageInfo<UserData> pageInfo = this.selectDataByUserId.selectBypaging(currentPage, pageSize, userData);
       // Pagination pagination=new Pagination(currentPage, pageSize, pageInfo.getTotal());
        return new TableResultData(pageInfo.getRecords());
    }
    public DataSelect selectById(@RequestParam ("id") String id)
    {
        return  new DataSelect( this.selectDataByUserId.selectById(id));
    }
}
