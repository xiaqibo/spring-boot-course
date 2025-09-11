package top.xia.boot.config.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: 夏企博
 * @Date: 2025/9/11
 * @Version: 1.0
 */
public interface OssService {
    /**
     * 文件上传
     *
     * @param file 文件
     */
    String upload(MultipartFile file);
}