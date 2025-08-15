package com.example.abc_poc.controllers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import com.example.abc_poc.data.ComputadorData;

class TesteControllerTest {

    @org.junit.jupiter.api.AfterEach
    void limparComputadores() {
        // Limpa a lista para garantir isolamento dos testes
        List<Map<String, Object>> lista = getComputadoresInterno();
        lista.clear();
        // Reinsere os padrões
        ComputadorData.addComputador(1, "Computador A", "Intel Core i5", "8GB", "256GB SSD");
        ComputadorData.addComputador(2, "Computador B", "AMD Ryzen 5", "16GB", "512GB SSD");
        ComputadorData.addComputador(3, "Computador C", "Intel Core i7", "32GB", "1TB SSD");
    }

    // Hack para acessar a lista interna (apenas para teste)
    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> getComputadoresInterno() {
        try {
            java.lang.reflect.Field field = ComputadorData.class.getDeclaredField("computadores");
            field.setAccessible(true);
            return (List<Map<String, Object>>) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void teste_deveRetornarListaCompletaDeComputadores() {
        TesteController controller = new TesteController();
        Object result = controller.teste();
        assertNotNull(result, "O resultado não deve ser nulo");
        assertTrue(result instanceof Map, "O resultado deve ser um Map");
        Map<?, ?> response = (Map<?, ?>) result;
        assertTrue(response.containsKey("computadores"), "Deve conter a chave 'computadores'");
        Object computadoresObj = response.get("computadores");
        assertTrue(computadoresObj instanceof List, "'computadores' deve ser uma lista");
        List<?> computadores = (List<?>) computadoresObj;
        assertEquals(3, computadores.size(), "Deve conter 3 computadores");

        assertComputador(
            computadores.get(0),
            1, "Computador A", "Intel Core i5", "8GB", "256GB SSD"
        );
        assertComputador(
            computadores.get(1),
            2, "Computador B", "AMD Ryzen 5", "16GB", "512GB SSD"
        );
        assertComputador(
            computadores.get(2),
            3, "Computador C", "Intel Core i7", "32GB", "1TB SSD"
        );
    }

    @Test
    void teste_deveAdicionarNovoComputador() {
        ComputadorData.addComputador(4, "Computador D", "Apple M1", "8GB", "256GB SSD");
        TesteController controller = new TesteController();
        Object result = controller.teste();
        Map<?, ?> response = (Map<?, ?>) result;
        List<?> computadores = (List<?>) response.get("computadores");
        assertEquals(4, computadores.size(), "Deve conter 4 computadores após adição");
        assertComputador(
            computadores.get(3),
            4, "Computador D", "Apple M1", "8GB", "256GB SSD"
        );
    }

    private void assertComputador(Object obj, int id, String nome, String processador, String memoria, String armazenamento) {
        assertTrue(obj instanceof Map, "Cada computador deve ser um Map");
        Map<?, ?> comp = (Map<?, ?>) obj;
        assertEquals(id, comp.get("id"), "Id incorreto");
        assertEquals(nome, comp.get("nome"), "Nome incorreto");
        assertEquals(processador, comp.get("processador"), "Processador incorreto");
        assertEquals(memoria, comp.get("memoria"), "Memória incorreta");
        assertEquals(armazenamento, comp.get("armazenamento"), "Armazenamento incorreto");
    }
}
