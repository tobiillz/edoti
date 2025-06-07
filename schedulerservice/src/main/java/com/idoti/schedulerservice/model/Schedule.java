package com.idoti.schedulerservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "Schedule")
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    private ScheduleRecurrence recurrence = ScheduleRecurrence.NONE;

    @Enumerated(EnumType.STRING)
    private ScheduleStatus status = ScheduleStatus.ACTIVE;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @CreationTimestamp
    private String createdBy;
    @UpdateTimestamp
    private String modifiedBy;
}