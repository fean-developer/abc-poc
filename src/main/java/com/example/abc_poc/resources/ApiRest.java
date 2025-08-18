package com.example.abc_poc.resources;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface ApiRest {

    @GetMapping("/computadores")
    Object computadores();

    @PostMapping("/computadores")
    void createComputadores(@RequestBody Map<String, Object> computer);

}
