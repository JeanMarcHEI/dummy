package org.example.study.repository.conf;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties("database")
public class ConnectionProperties {
    private String url;
    private String username;
    private String password;
}