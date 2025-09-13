package top.xia.boot.config.service.impl;

import enums.ResultStatus;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import top.xia.boot.config.model.Mail;
import top.xia.boot.config.service.MailService;

/**
 * @Author: 夏企博
 * @Date: 2025/9/13
 * @Version: 1.0
 */
@Service
public class MailServiceImpl implements MailService {
    // 读取配置的发件人
    @Value("${spring.mail.username}")
    private String from;

    @Resource
    private JavaMailSender javaMailSender;

    @Override
    public ResultStatus sendSimpleMail(Mail mail) {
        // 发送简单邮件，根据发送情况返回不同信息
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(mail.getTo());
        message.setSubject(mail.getSubject());
        message.setText(mail.getContent());
        try {
            javaMailSender.send(message);
            return ResultStatus.SUCCESS;
        } catch (Exception e) {
            return ResultStatus.FAIL;
        }
    }
}