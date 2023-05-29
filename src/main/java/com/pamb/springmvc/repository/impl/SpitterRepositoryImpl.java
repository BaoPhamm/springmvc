package com.pamb.springmvc.repository.impl;

import com.pamb.springmvc.entity.Spitter;
import com.pamb.springmvc.repository.SpitterRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository {

    @Override
    public Spitter findByUsername(String username) {
        return new Spitter(username, "password", "firstname of " + username, "lastname of " + username);
    }

    @Override
    public Spitter save(Spitter spitter) {
        return new Spitter(spitter.getUsername(), "", spitter.getFirstName(), spitter.getLastName());
    }
}
