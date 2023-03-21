package appConfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(ignoreInvalidFields = true)
@Data
@PropertySources(@PropertySource(value = "classpath:properties/application-spring-test-ui.properties", ignoreResourceNotFound = true))
public class PropertiesConf {
    private Web web;

    @Data
    public static class Web {
        private String baseUrl;
        private Auth user;
    }

    @Data
    public static class Auth {
        private String username;
        private String password;
    }
}

