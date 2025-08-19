package com.example.abc_poc.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BeneficiarioTest {
    @Test
    void testSetAndGet() {
        Beneficiario b = new Beneficiario();
        b.setTipoDocumento("CNPJ");
        b.setDocumento("12.345.678/0001-90");
        b.setNome("Empresa X");
        assertEquals("CNPJ", b.getTipoDocumento());
        assertEquals("12.345.678/0001-90", b.getDocumento());
        assertEquals("Empresa X", b.getNome());
    }
}