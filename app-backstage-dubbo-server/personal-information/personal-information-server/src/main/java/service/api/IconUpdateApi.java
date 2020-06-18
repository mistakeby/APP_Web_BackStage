package service.api;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface IconUpdateApi {
    public void ApiIconUpload(@RequestParam("file") MultipartFile uploadFile);
    void testDubbo();
}
