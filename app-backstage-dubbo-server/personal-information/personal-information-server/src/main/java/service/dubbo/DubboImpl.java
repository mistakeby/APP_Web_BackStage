package service.dubbo;
import api.PersonalInformationUpdate;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import service.api.IconUpdateApi;

@Service(version="1.0.0")
public class DubboImpl implements PersonalInformationUpdate {
    @Autowired
    private IconUpdateApi iconUpdateApi;
    @Override
    public void iconUpload(@RequestParam("file") MultipartFile uploadFile) {
     this.iconUpdateApi.ApiIconUpload(uploadFile);
    }

    @Override
    public void testDubbo() {
        this.iconUpdateApi.testDubbo();
    }
}
