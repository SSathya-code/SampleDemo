package com.example.sampledemo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger log =
            LoggerFactory.getLogger(TestController.class);

    @GetMapping
    public String test() {
        log.info("Test endpoint called");
        return "SampleDemo is working";
    }
}
