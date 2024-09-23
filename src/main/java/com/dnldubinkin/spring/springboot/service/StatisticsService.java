package com.dnldubinkin.spring.springboot.service;

import com.dnldubinkin.spring.springboot.dto.StatisticsDto;
import com.dnldubinkin.spring.springboot.repository.StatisticsRepository;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    private final StatisticsRepository statisticsRepository;

    public StatisticsService(StatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }

    public StatisticsDto getStatistics() {

        return new StatisticsDto("Эспрессо", 150);
    }
}