package server;


import api.AuthorityApi;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AuthorityProvider {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AuthorityProvider.class)
                .web(WebApplicationType.NONE) // 非 Web 应用
                .run(args);
    }
}
