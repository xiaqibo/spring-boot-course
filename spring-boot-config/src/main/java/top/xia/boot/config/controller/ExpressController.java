package top.xia.boot.config.controller;

import enums.ExpressStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 夏企博
 * @Date: 2025/9/12
 * @Version: 1.0
 */
@RestController
@RequestMapping("/express")
public class ExpressController {

    /**
     * 获取快递状态
     *
     * @param status 快递状态
     * @return String
     */
    @GetMapping("/{status}")
    public String checkExpressStatus(@PathVariable ExpressStatus status) {
        return "快递状态: " + status.getLabel();
    }

    /**
     * 获取所有快递状态
     *
     * @return List<Map < String, String>>
     */
    @GetMapping("/express/statuses")
    public List<Map<String, String>> getAllStatuses() {
        List<Map<String, String>> list = new ArrayList<>();
        for (ExpressStatus status : ExpressStatus.values()) {
            Map<String, String> item = new HashMap<>();
            item.put("value", status.name());
            item.put("label", status.getLabel());
            list.add(item);
        }
        return list;
    }

    /**
     * 更新快递状态
     *
     * @param orderNo 快递单号
     * @param status  快递状态
     * @return String
     */
    @PostMapping("/express/update")
    public String updateExpress(@RequestParam String orderNo, @RequestParam ExpressStatus status) {
        // 实际应用会更新数据库
        return "快递单号 " + orderNo + " 状态已更新为: " + status.getLabel();
    }
}