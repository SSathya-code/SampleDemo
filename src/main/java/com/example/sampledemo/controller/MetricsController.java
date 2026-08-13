package com.example.sampledemo.controller;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metrics")
public class MetricsController {

  @Autowired MeterRegistry meterRegistry;

  @GetMapping
  public Map<String, Object> metrics() {
    Map<String, Object> map = new HashMap<>();

    Gauge cpu = meterRegistry.find("process.cpu.usage").gauge();
    Gauge memory = meterRegistry.find("jvm.memory.used").tag("area", "heap").gauge();

    map.put("cpuUsage", cpu != null ? cpu.value() : null);
    map.put("heapMemory", memory != null ? memory.value() : null);

    return map;
  }
}
