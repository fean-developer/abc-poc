package com.example.abc_poc.data;

import java.util.*;

public class ComputadorData {
    private static final List<Map<String, Object>> computadores = new ArrayList<>();
    // Exemplo de GitHub Webhook Secret
    private static final String GITHUB_WEBHOOK_SECRET = "whsec_1234567890abcdef1234567890abcdef";
    
    static {
        computadores.add(createComputador(1, "Computador A", "Intel Core i5", "8GB", "256GB SSD"));
        computadores.add(createComputador(2, "Computador B", "AMD Ryzen 5", "16GB", "512GB SSD"));
        computadores.add(createComputador(3, "Computador C", "Intel Core i7", "32GB", "1TB SSD"));
        computadores.add(createComputador(4, "Computador D", "AMD Ryzen 7", "64GB", "2TB SSD"));
    }

    public static List<Map<String, Object>> getComputadores() {
        return new ArrayList<>(computadores);
    }

    public static void addComputador(int id, String nome, String processador, String memoria, String armazenamento) {
        computadores.add(createComputador(id, nome, processador, memoria, armazenamento));
    }

    public static boolean updateComputador(Integer id, String nome, String processador, String memoria, String armazenamento) {
        for (Map<String, Object> computador : computadores) {
            if (computador.get("id").equals(id)) {
                computador.put("nome", nome);
                computador.put("processador", processador);
                computador.put("memoria", memoria);
                computador.put("armazenamento", armazenamento);
                return true;
            }
        }
        return false;
    }

    private static Map<String, Object> createComputador(int id, String nome, String processador, String memoria, String armazenamento) {
        Map<String, Object> computador = new HashMap<>();
        computador.put("id", id);
        computador.put("nome", nome);
        computador.put("processador", processador);
        computador.put("memoria", memoria);
        computador.put("armazenamento", armazenamento);
        return computador;
    }


    
}
