package top.xia.boot.config.service;

import enums.ResultStatus;
import top.xia.boot.config.model.Mail;

/**
 * @Author: 夏企博
 * @Date: 2025/9/13
 * @Version: 1.0
 */
public interface MailService {
    /**
     * 发送简单邮件
     *
     * @param mail 邮件信息
     */
    ResultStatus sendSimpleMail(Mail mail);
}