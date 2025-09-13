package top.xia.boot.config.model;

import enums.ResultStatus;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.xia.boot.config.service.MailService;

/**
 * @Author: 夏企博
 * @Date: 2025/9/13
 * @Version: 1.0
 */
@SpringBootTest
class MailServiceTest {
    @Resource
    private MailService mailService;

    @Test
    void sendSimpleMail() {
        Mail mail = new Mail();
        mail.setTo("1650512469@qq.com");
        mail.setSubject("测试简单邮件");
        mail.setContent("简单邮件内容");
        ResultStatus resultStatus = mailService.sendSimpleMail(mail);
        assert resultStatus == ResultStatus.SUCCESS;
    }
}