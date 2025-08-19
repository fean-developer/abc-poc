package com.example.abc_poc.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CabecalhoTest {
    @Test
    void testSetAndGet() {
        Cabecalho c = new Cabecalho();
        c.setMessageId("id");
        c.setCorrelationId("corr");
        c.setProcessInstanceId("proc");
        c.setDataGeracao("2025-08-18");
        c.setAmbiente("HML");
        c.setOrigemSistema("BW");
        c.setDuracaoMs(100);
        c.setHost("host");
        c.setEngine("BW6");
        c.setVersaoProcesso("v1.0");
        assertEquals("id", c.getMessageId());
        assertEquals("corr", c.getCorrelationId());
        assertEquals("proc", c.getProcessInstanceId());
        assertEquals("2025-08-18", c.getDataGeracao());
        assertEquals("HML", c.getAmbiente());
        assertEquals("BW", c.getOrigemSistema());
        assertEquals(100, c.getDuracaoMs());
        assertEquals("host", c.getHost());
        assertEquals("BW6", c.getEngine());
        assertEquals("v1.0", c.getVersaoProcesso());
    }
}
