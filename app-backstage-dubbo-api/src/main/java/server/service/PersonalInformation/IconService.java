package server.service.PersonalInformation;

import api.PersonalInformationUpdate;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
public class IconService {
    @Reference(version = "1.0.0")
    private PersonalInformationUpdate personalInformationUpdate;
    public void iconUpdateService(@RequestParam("file") MultipartFile uploadFile)
    {
        this.personalInformationUpdate.iconUpload(uploadFile);
    }
    public void testDubbo()
    {
        this.personalInformationUpdate.testDubbo();
    }
}
