package com.example.janitri.controller;

import com.example.janitri.model.HeartRate;
import com.example.janitri.service.HeartRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heart-rate")
public class HeartRateController {
    @Autowired
    private HeartRateService heartRateService;

    @PostMapping
    public HeartRate recordHeartRate(@RequestBody HeartRate heartRate) {
        return heartRateService.recordHeartRate(heartRate);
    }

    @GetMapping("/{patientId}")
    public List<HeartRate> getHeartRatesByPatientId(@PathVariable Long patientId) {
        return heartRateService.getHeartRatesByPatientId(patientId);
    }
}