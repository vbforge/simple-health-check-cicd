package com.vbforge.demo.controller;

import com.vbforge.demo.dto.AppInfoResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfoControllerTest {

    @Test
    void returnsConfiguredAppNameAndVersion() {
        // JUNIOR NOTE: no @SpringBootTest, no context startup — just plain object construction.
        // This runs in milliseconds and tests exactly what it needs to: the controller's logic.
        InfoController controller = new InfoController("simple-health-check-cicd", "0.1.0");

        AppInfoResponse response = controller.info();

        assertEquals("simple-health-check-cicd", response.name());
        assertEquals("0.1.0", response.version());
    }
}