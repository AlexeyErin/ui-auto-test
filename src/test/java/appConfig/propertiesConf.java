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
@PropertySources(@PropertySource(value = "classpath:resource/properties"))
public class propertiesConf {
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

