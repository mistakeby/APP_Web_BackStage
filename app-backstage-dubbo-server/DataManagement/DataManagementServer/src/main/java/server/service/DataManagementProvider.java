package server.service;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DataManagementProvider {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DataManagementProvider.class)
                .web(WebApplicationType.NONE) // 非 Web 应用
                .run(args);
    }
}
