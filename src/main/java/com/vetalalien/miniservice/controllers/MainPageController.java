package com.vetalalien.miniservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MainPageController {
    public ResponseEntity internalServerError(String msg) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
    }
    @GetMapping("/")
    ResponseEntity checkHealth(){

        LocalDateTime dt = LocalDateTime.now();
        int seconds = dt.getSecond();

        ResponseEntity result;

        if (seconds >= 1 & seconds <= 15)
        {
            result = internalServerError(Integer.toString(seconds));
        } else
            result = ResponseEntity.ok("All is Ready: " + Integer.toString(seconds));

        return result;
        //return ResponseEntity.ok("Hello, otus world!");
    }
}
