package com.example.abc_poc.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.abc_poc.resources.ApiRest;
import com.example.abc_poc.data.ComputadorData;

@RestController
public class TesteController implements ApiRest {

    @Override
    public Object teste() {
        java.util.Map<String, Object> response = new java.util.HashMap<>();
        response.put("computadores", ComputadorData.getComputadores());
        return response;
    }

    private void createComputador(Map<String, Object> computador) {
        ComputadorData.addComputador(
            (Integer) computador.get("id"),
            (String) computador.get("nome"),
            (String) computador.get("processador"),
            (String) computador.get("memoria"),
            (String) computador.get("armazenamento")
        );
    }

    @PostMapping("/computadores")
    public void createComputadores(@RequestBody Map<String, Object> computador) {
        createComputador(computador);
    }

}
