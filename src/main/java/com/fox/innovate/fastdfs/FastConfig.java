package com.fox.innovate.fastdfs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myprops")
public class FastConfig {

    private String fastUrl;

    public String getFastUrl() {
        return fastUrl;
    }

    public void setFastUrl(String fastUrl) {
        this.fastUrl = fastUrl;
    }
}
