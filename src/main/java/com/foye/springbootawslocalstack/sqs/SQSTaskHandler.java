package com.foye.springbootawslocalstack.sqs;

import com.foye.springbootawslocalstack.domain.EventMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationMessage;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SQSTaskHandler {

//    @SqsListener("${sqs.queue.sns.fanout}")
//    public void subscribeToSNSFanout(@NotificationMessage final EventMessage msg) {
//        log.error("Received message from SNS topic: " + msg);
//    }

    @SqsListener("${sqs.queue}")
    public void testQueue(final String msg) {
        log.info("Received message: " + msg);
    }
}
