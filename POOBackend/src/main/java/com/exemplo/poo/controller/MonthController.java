package com.exemplo.poo.controller;

import com.exemplo.poo.model.Month;
import com.exemplo.poo.service.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/api/months")
public class MonthController {

    @Autowired
    private MonthService monthService;

    @GetMapping("/user/{userId}")
    public List<Month> getMonthsByUser(@PathVariable Long userId) {
        return monthService.getMonthsByUser(userId);
    }

    @PostMapping
    public ResponseEntity<Month> createMonth(@RequestBody Month month) {
        Month createdMonth = monthService.addMonth(month);
        return ResponseEntity.ok(createdMonth);
    }
}
