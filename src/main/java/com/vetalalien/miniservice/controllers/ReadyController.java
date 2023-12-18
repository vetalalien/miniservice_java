package com.vetalalien.miniservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


//@RestController
public class ReadyController {
  /*  public ResponseEntity internalServerError(String msg) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
    }

    @GetMapping("/ready")
    ResponseEntity checkHealth(){

//        return ResponseEntity.ok("All is Ready");
//        Date d = new Date();
//        Calendar calendar = GregorianCalendar.getInstance();
//        calendar.setTime(d);
//        int seconds = calendar.get(Calendar.SECOND);

        LocalDateTime dt = LocalDateTime.now();
        int seconds = dt.getSecond();

        ResponseEntity result;

        if (seconds >= 1 & seconds <= 15)
        {
            result = internalServerError(Integer.toString(seconds));
        } else
            result = ResponseEntity.ok("All is Ready: " + Integer.toString(seconds));

        return result;
    }

   */
}
