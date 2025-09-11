package top.xia.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xia.service.SmsService;

/**
 * @Author: 夏企博
 * @Date: 2025/9/6
 * @Version: 1.0
 */
@RestController
public class SmsController {
    @Resource
    private SmsService smsService;

    @GetMapping("/sms")
    public void sendSms(String phone) {
        smsService.sendSms(phone);
    }
}