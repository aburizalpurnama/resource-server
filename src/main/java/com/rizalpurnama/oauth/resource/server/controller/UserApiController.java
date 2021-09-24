package com.rizalpurnama.oauth.resource.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserApiController {

    @GetMapping("/userinfo")
    public Map<String, Object> userInfo(){
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("waktu sekrang", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        return hasil;
    }

}
