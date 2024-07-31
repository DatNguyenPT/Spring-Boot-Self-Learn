package com.Danny.SpringBootLearning.Day3_MoreAnnotations.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Getter
@Setter
@PropertySource("MyAppConfig.yml")
@ConfigurationProperties(prefix = "datnguyen")
public class MyAppProperties {
    private String name;
    private String email;
    List<String> list;
    Map<String, String>map;
}
