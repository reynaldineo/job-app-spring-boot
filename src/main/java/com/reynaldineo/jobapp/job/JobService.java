package com.reynaldineo.jobapp.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(long id);

    boolean putJobById(Long id, Job job);

}
