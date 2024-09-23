package com.dnldubinkin.spring.springboot.repository;

import com.dnldubinkin.spring.springboot.entity.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
}