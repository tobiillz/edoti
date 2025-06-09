package com.idoti.schedulerservice.repository;

import com.idoti.schedulerservice.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, String> {
    boolean existsByAddress(String address);
}
