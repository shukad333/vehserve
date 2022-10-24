package com.logic.job.sabrez.repo;

import com.logic.job.sabrez.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends CrudRepository<Test,Integer> {
}
