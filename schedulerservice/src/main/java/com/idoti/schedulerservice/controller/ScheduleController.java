package com.idoti.schedulerservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/schedules")
public class ScheduleController {

    @GetMapping("/{scheduleId}")
    public ResponseEntity<ScheduleResponse> getScheduleDetails(@PathVariable String scheduleId){
        return ResponseEntity.ok()
    }

    @GetMapping("/{scheduleId}")
    public ResponseEntity<> getScheduleDetails(){
        return "";
    }




}
