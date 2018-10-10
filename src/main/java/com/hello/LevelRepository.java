package com.hello;

import org.springframework.data.repository.CrudRepository;
import com.hello.Level;

// This will be AUTO IMPLEMENTED by Spring into a Bean called levelRepository
// CRUD refers Create, Read, Update, Delete

    public interface LevelRepository  extends CrudRepository<Level, Integer> {

    }