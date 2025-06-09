package com.idoti.schedulerservice.service;

import com.idoti.schedulerservice.dto.ScheduleResponse;
import com.idoti.schedulerservice.dto.createScheduleRequest;
import com.idoti.schedulerservice.model.Schedule;
import com.idoti.schedulerservice.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {


    @Autowired
    private ScheduleRepository scheduleRepository;
    public ScheduleResponse createSchedule(createScheduleRequest request) {

        //Logic to ensure Only one schedule exists for a set address
        if(scheduleRepository.existsByAddress(request.getAddress())){
            throw new RuntimeException("A Schedule for this Address already exists!!!");
        }

        Schedule schedule = new Schedule();
        schedule.setDescription(request.getDescription());
        schedule.setTitle(request.getTitle());
        schedule.setStartTime(request.getStartTime());
        schedule.setEndTime(request.getEndTime());
        schedule.setStatus(request.getStatus());
        schedule.setRecurrence(request.getRecurrence());
        schedule.setAddress(request.getAddress());

        Schedule savedSchedule = scheduleRepository.save(schedule);

        ScheduleResponse scheduleResponse = new ScheduleResponse();
        scheduleResponse.setScheduleId(savedSchedule.getScheduleId());
        scheduleResponse.setDescription(savedSchedule.getDescription());
        scheduleResponse.setTitle(savedSchedule.getTitle());
        scheduleResponse.setStartTime(savedSchedule.getStartTime());
        scheduleResponse.setEndTime(savedSchedule.getEndTime());
        scheduleResponse.setStatus(savedSchedule.getStatus());
        scheduleResponse.setRecurrence(savedSchedule.getRecurrence());
        scheduleResponse.setCreatedBy(savedSchedule.getCreatedBy());
        scheduleResponse.setModifiedBy(savedSchedule.getModifiedBy());
        scheduleResponse.setAddress(savedSchedule.getAddress());

        return scheduleResponse;
    }

    public ScheduleResponse getScheduleDetails(String scheduleId) {
        Schedule schedule = scheduleRepository.findById(String.valueOf(scheduleId))
                .orElseThrow(()-> new RuntimeException("Schedule Not Found"));

        ScheduleResponse scheduleResponse = new ScheduleResponse();
        scheduleResponse.setScheduleId(schedule.getScheduleId());
        scheduleResponse.setDescription(schedule.getDescription());
        scheduleResponse.setTitle(schedule.getTitle());
        scheduleResponse.setStartTime(schedule.getStartTime());
        scheduleResponse.setEndTime(schedule.getEndTime());
        scheduleResponse.setStatus(schedule.getStatus());
        scheduleResponse.setRecurrence(schedule.getRecurrence());
        scheduleResponse.setCreatedBy(schedule.getCreatedBy());
        scheduleResponse.setModifiedBy(schedule.getModifiedBy());
        scheduleResponse.setAddress(schedule.getAddress());

        return scheduleResponse;
    }
}

