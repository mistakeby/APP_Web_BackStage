package api;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface PersonalInformationUpdate {
    void iconUpload(@RequestParam("file") MultipartFile uploadFile);
    void testDubbo();
}
