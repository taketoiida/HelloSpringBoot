package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime; // 追加
import java.time.format.DateTimeFormatter; // 追加

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloSpringBootController {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot??";
    }
    
    @GetMapping("now")
    public String dispTime() {
        String now = LocalDateTime.now().format( DateTimeFormatter.ofPattern("HH:mm:ss") );

        return "現在時刻：" + now;
    
    }
    
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }
}
