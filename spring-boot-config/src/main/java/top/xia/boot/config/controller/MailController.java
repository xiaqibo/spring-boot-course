package top.xia.boot.config.controller;

import enums.ResultStatus;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xia.boot.config.ApiResponse;
import top.xia.boot.config.model.Mail;
import top.xia.boot.config.service.MailService;

/**
 * @Author: 夏企博
 * @Date: 2025/9/13
 * @Version: 1.0
 */
@RestController
@RequestMapping("/mail")
public class MailController {
    @Resource
    private MailService mailService;

    /**
     * 发送简单邮件
     *
     * @param mail 邮件信息
     * @return 发送结果
     */
    @PostMapping("/simple")
    public ResponseEntity<ApiResponse<ResultStatus>> sendSimpleMail(@Valid @RequestBody Mail mail) {
        ResultStatus rs = mailService.sendSimpleMail(mail);
        if (rs == ResultStatus.SUCCESS) {
            return ResponseEntity.ok(ApiResponse.success("发送成功", rs));
        }
        // 业务失败建议返回 400（参数/业务错误），而不是 200
        return ResponseEntity.badRequest().body(ApiResponse.error("发送失败"));
    }
}