package service;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PersonalInformationProvider {
    public static void main(String[] args) {
        new SpringApplicationBuilder(PersonalInformationProvider.class)
                .web(WebApplicationType.NONE) // 非 Web 应用
                .run(args);
    }
}
