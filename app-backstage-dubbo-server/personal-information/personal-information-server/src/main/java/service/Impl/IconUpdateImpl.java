package service.Impl;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import service.api.IconUpdateApi;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Transactional
@Service
public class IconUpdateImpl implements IconUpdateApi {
    @Override
    public void ApiIconUpload(@RequestParam("file") MultipartFile uploadFile) {
        String newPath = "F:\\APPMaData\\icon\\zzn";
        createDerectory(newPath);
        String fileName = "icon.jpg";
        File newFile = new File(newPath,fileName);
        try {
            uploadFile.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void testDubbo() {
        System.out.println("测试Dubbo是否连通");
    }

    private void createDerectory(String newPath)
    {
        File file=new File(newPath);
        if(!file.exists()){
            file.mkdirs();
        }
        else
        {
        }
    }
}
