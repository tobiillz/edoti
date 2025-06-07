package com.idoti.schedulerservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Schedule")
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String recurrence;
    private ScheduleStatus status = ScheduleStatus.ACTIVE;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String modifiedBy;
}