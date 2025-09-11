package top.xia.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 夏企博
 * @Date: 2025/9/6
 * @Version: 1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "xia.sms.ccp")
public class CloopenConfig {
    private String serverIp;
    private String port;
    private String accountSId;
    private String accountToken;
    private String appId;
    private String templateId;
}