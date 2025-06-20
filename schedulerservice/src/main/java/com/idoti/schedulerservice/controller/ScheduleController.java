package com.idoti.schedulerservice.controller;


import com.idoti.schedulerservice.dto.ScheduleResponse;
import com.idoti.schedulerservice.dto.CreateScheduleRequest;
import com.idoti.schedulerservice.service.ScheduleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/schedule")
@AllArgsConstructor
public class ScheduleController {

    private ScheduleService scheduleService;

    @GetMapping("/id/{scheduleId}")
    public ResponseEntity<ScheduleResponse> getScheduleDetails(@PathVariable String scheduleId){
        return ResponseEntity.ok(scheduleService.getScheduleDetails(scheduleId));
    }

    @PostMapping("/create")
    public ResponseEntity<ScheduleResponse> createSchedule(@RequestBody CreateScheduleRequest request){
        return ResponseEntity.ok(scheduleService.createSchedule(request));
    }
    @GetMapping("/all")
    public ResponseEntity<List<ScheduleResponse>> getScheduleDetails(){
        return ResponseEntity.ok(scheduleService.getAllScheduleDetails());
    }

}
