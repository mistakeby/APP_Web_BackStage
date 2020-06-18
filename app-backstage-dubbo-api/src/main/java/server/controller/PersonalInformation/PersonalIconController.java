package server.controller.PersonalInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pojo.DailyLogSubmit;
import pojo.DailyLog_Common;
import server.service.PersonalInformation.IconService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("personalinformation/icon")
public class PersonalIconController {
    @Autowired
    private IconService iconService;
    @ResponseBody
    @PostMapping
    public ResponseEntity<Void> update(@RequestParam("file") MultipartFile uploadFile) {
        System.out.println("文件传输端的Controller层");
        String newPath = "F:\\APPMaData\\icon\\zzn";
        createDerectory(newPath);
        String fileName = "icon.jpg";
        File newFile = new File(newPath,fileName);
        try {
            uploadFile.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
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
    @GetMapping
    public void get(){
        this.iconService.testDubbo();
    }
}
