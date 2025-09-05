package top.xia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 夏企博
 * @Date: 2025/9/5
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {return "hello world";}

    @GetMapping("/list")
    public List<String> getList() {
        return List.of("aaa","bbb", "ccc");
    }
}