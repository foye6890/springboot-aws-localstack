package com.foye.springbootawslocalstack.rest;

import com.foye.springbootawslocalstack.domain.EventMessage;
import com.foye.springbootawslocalstack.sqs.SqsPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SqsPublisher sqsPublisher;

    @GetMapping("/sqs")
    public void sqs(@RequestParam String foo) {

        sqsPublisher.send(EventMessage.builder()
                .foo(foo)
                .build());

    }
}
