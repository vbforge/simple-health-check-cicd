package com.vbforge.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    // JUNIOR NOTE: this exists purely so we have a non-actuator endpoint to smoke-test manually.
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
