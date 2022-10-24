package com.logic.job.sabrez.service;

import com.logic.job.sabrez.entity.Test;
import com.logic.job.sabrez.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired private TestRepo testRepo;

    public Test save(Test test) {
        return testRepo.save(test);
    }

    public Iterable<Test> getAll() {

        return testRepo.findAll();
    }

}
