package top.xia.boot.config.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.xia.boot.config.service.OssService;

/**
 * @Author: 夏企博
 * @Date: 2025/9/11
 * @Version: 1.0
 */
@RestController
@RequestMapping("/oss")
public class OssController {
    @Resource
    private OssService ossService;

    @PostMapping("upload")
    public String upload(MultipartFile file) {
        return ossService.upload(file);
    }
}