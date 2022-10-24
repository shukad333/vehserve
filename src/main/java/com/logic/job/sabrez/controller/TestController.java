package com.logic.job.sabrez.controller;

import com.logic.job.sabrez.entity.Test;
import com.logic.job.sabrez.repo.TestRepo;
import com.logic.job.sabrez.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired private TestService testService;

    @PostMapping("/test")
    public ResponseEntity<Test> save(@RequestBody Test test) {
        return new ResponseEntity<>(testService.save(test), HttpStatus.CREATED);
    }

    @GetMapping("/test")
    public ResponseEntity<Iterable<Test>> getAll(@RequestBody Test test) {
        return new ResponseEntity<>(testService.getAll(), HttpStatus.CREATED);
    }
}
