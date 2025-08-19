package com.example.abc_poc.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagadorTest {
    @Test
    void testSetAndGet() {
        Pagador p = new Pagador();
        p.setTipoDocumento("CPF");
        p.setDocumento("12345678909");
        p.setNome("João");
        assertEquals("CPF", p.getTipoDocumento());
        assertEquals("12345678909", p.getDocumento());
        assertEquals("João", p.getNome());
    }
}
