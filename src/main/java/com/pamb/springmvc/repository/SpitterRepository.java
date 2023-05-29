package com.pamb.springmvc.repository;

import com.pamb.springmvc.entity.Spitter;

public interface SpitterRepository {
    Spitter findByUsername(String username);
    Spitter save(Spitter spitter);
}
