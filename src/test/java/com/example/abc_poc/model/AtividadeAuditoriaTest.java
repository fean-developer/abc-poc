package com.example.abc_poc.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtividadeAuditoriaTest {
    @Test
    void testSetAndGet() {
        AtividadeAuditoria a = new AtividadeAuditoria();
        a.setNome("ValidarEntrada");
        a.setInicio("2025-08-18T14:58:08.100-03:00");
        a.setFim("2025-08-18T14:58:08.220-03:00");
        a.setDuracaoMs(120);
        assertEquals("ValidarEntrada", a.getNome());
        assertEquals("2025-08-18T14:58:08.100-03:00", a.getInicio());
        assertEquals("2025-08-18T14:58:08.220-03:00", a.getFim());
        assertEquals(120, a.getDuracaoMs());
    }
}
