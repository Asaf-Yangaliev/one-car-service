package com.onecar.onecarservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OneCarController {

    @PostMapping("/register-user")
    public void registerUser(@RequestBody CreateUserDto createUser) {
        // регистрация пользователя
    }

    @PostMapping("/record-user")
    public void recordUser(@RequestBody RecordUser recordUser) {
        // запись на техническое обслуживание и ремонт
    }

    @GetMapping("/record-info/{recordId}")
    public RecordStatusDto getRecordStatus(@PathVariable long recordId) {
        // получение информации об статусе записи
        return null;
    }

    @GetMapping("/record-info/{recordId}/details")
    public List<PriceDetailsInfo> getRecordInfoDetailsStatus(@PathVariable long recordId) {
        // получение информации об оплате записи
        return null;
    }
}
