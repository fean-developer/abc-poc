package com.example.abc_poc.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IdentificadoresTest {
    @Test
    void testSetAndGet() {
        Identificadores i = new Identificadores();
        i.setTid("tid");
        i.setIdempotencyKey("key");
        i.setDuplicado(true);
        assertEquals("tid", i.getTid());
        assertEquals("key", i.getIdempotencyKey());
        assertTrue(i.isDuplicado());
    }
}
