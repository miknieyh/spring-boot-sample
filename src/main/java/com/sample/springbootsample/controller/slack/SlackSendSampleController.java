package com.sample.springbootsample.controller.slack;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/slack")
@RestController
public class SlackSendSampleController {

    @GetMapping("")
    public void sendLogToSlack(){
        log.info("this log is info");
        log.warn("this log is warn");
        log.error("this log is error");
    }
}
