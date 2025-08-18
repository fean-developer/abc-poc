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
    public Object computadores() {
        java.util.Map<String, Object> response = new java.util.HashMap<>();
        response.put("computadores", ComputadorData.getComputadores());
        return response;
    }


    private void createComputador(Map<String, Object> computer) {
        ComputadorData.addComputador(
            (Integer) computer.get("id"),
            (String) computer.get("nome"),
            (String) computer.get("processador"),
            (String) computer.get("memoria"),
            (String) computer.get("armazenamento")
        );
    }


    @PostMapping("/computadores")

    public void createComputadores(@RequestBody Map<String, Object> computer) {
        createComputador(computer);
    }

    public Object updateComputador(@RequestBody Map<String, Object> computer) {
        Integer id = (Integer) computer.get("id");
        if (id == null) {
            return Map.of("error", "ID do computador é obrigatório");
        }
        boolean updated = ComputadorData.updateComputador(
            id,
            (String) computer.get("nome"),
            (String) computer.get("processador"),
            (String) computer.get("memoria"),
            (String) computer.get("armazenamento")
        );
        if (updated) {
            return Map.of("message", "Computador atualizado com sucesso");
        } else {
            return Map.of("error", "Computador não encontrado");
        }
    }
}
