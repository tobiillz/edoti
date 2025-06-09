package com.idoti.schedulerservice.controller;


import com.idoti.schedulerservice.dto.ScheduleResponse;
import com.idoti.schedulerservice.dto.createScheduleRequest;
import com.idoti.schedulerservice.service.ScheduleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/schedules")
@AllArgsConstructor
public class ScheduleController {

    private ScheduleService scheduleService;

    @GetMapping("/{scheduleId}")
    public ResponseEntity<ScheduleResponse> getScheduleDetails(@PathVariable String scheduleId){
        return ResponseEntity.ok(scheduleService.getScheduleDetails(scheduleId));
    }

    @GetMapping("/create")
    public ResponseEntity<ScheduleResponse> createSchedule(@RequestBody createScheduleRequest request){
        return ResponseEntity.ok(scheduleService.createSchedule(request));
    }

}
