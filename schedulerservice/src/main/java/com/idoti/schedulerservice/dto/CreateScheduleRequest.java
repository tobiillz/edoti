package com.idoti.schedulerservice.dto;

import com.idoti.schedulerservice.model.ScheduleRecurrence;
import com.idoti.schedulerservice.model.ScheduleStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateScheduleRequest {

    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ScheduleRecurrence recurrence = ScheduleRecurrence.NONE;
    private ScheduleStatus status = ScheduleStatus.ACTIVE;
    @NotBlank(message = "Address is required")
    private String address;

}
