package com.vbforge.demo.controller;

import com.vbforge.demo.dto.AppInfoResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private final String appName;
    private final String appVersion;

    // JUNIOR NOTE: constructor injection, no field injection — makes the class trivially
    // unit-testable with `new InfoController(...)`, no Spring context required.
    public InfoController(@Value("${app.name}") String appName,
                           @Value("${app.version}") String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }

    @GetMapping("/info")
    public AppInfoResponse info() {
        return new AppInfoResponse(appName, appVersion);
    }
}