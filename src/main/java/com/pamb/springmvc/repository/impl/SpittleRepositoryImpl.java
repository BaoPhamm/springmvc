package com.pamb.springmvc.repository.impl;

import com.pamb.springmvc.entity.Spittle;
import com.pamb.springmvc.repository.SpittleRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        final LocalDate time = LocalDate.now();
        Double longitude = 0.001;
        Double latitude = 1.001;
        return List.of(new Spittle(1L, "message1", time, longitude++, latitude++),
                new Spittle(2L, "message2", time.plusDays(1), longitude++, latitude++),
                new Spittle(3L, "message3", time.plusMonths(1), longitude++, latitude++),
                new Spittle(4L, "message4", time.plusYears(1), longitude, latitude));
    }

    @Override
    public Spittle findOne(Long id) {
        final LocalDate time = LocalDate.now();
        final Double longitude = 0.001;
        final Double latitude = 1.001;
        return new Spittle(id, "message", time, longitude, latitude);
    }
}
