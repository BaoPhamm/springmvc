package com.pamb.springmvc.repository;

import com.pamb.springmvc.entity.Spittle;

import java.util.List;
import java.util.Optional;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(Long id);
}
