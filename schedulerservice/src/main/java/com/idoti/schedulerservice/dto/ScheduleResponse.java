package com.idoti.schedulerservice.dto;

import com.idoti.schedulerservice.model.ScheduleRecurrence;
import com.idoti.schedulerservice.model.ScheduleStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScheduleResponse {

    private Long scheduleId;
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ScheduleRecurrence recurrence = ScheduleRecurrence.NONE;
    private ScheduleStatus status = ScheduleStatus.ACTIVE;
    private String createdBy;
    private String modifiedBy;
    private String address;

}
