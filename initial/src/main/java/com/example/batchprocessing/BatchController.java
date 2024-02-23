package com.example.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BatchController {


  private final Job importUserJob;

  private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

  private final JobLauncher jobLauncher;

  public BatchController(JobLauncher jobLauncher, Job importUserJob) {
    this.jobLauncher = jobLauncher;
    this.importUserJob = importUserJob;
  }

  @GetMapping("/trigger")
  String trigger(String param1 ) throws Exception {


    JobParameters jobParameters =
            new JobParametersBuilder()
                    .addString("param1",param1).toJobParameters();
    jobLauncher.run(importUserJob, jobParameters);
    return "DONE";

  }

}