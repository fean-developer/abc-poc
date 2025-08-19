package com.example.abc_poc.controllers;

import com.example.abc_poc.model.PagamentoBoletoResposta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class PagamentoBoletoControllerTest {

    @Test
    void testGetPagamentoBoletoResposta() {
        PagamentoBoletoController controller = new PagamentoBoletoController();
        PagamentoBoletoResposta resposta = controller.getPagamentoBoletoResposta();
        assertNotNull(resposta, "Resposta não deve ser nula");
        assertNotNull(resposta.getCabecalho(), "Cabecalho não deve ser nulo");
        assertNotNull(resposta.getTransacao(), "Transacao não deve ser nula");
        assertNotNull(resposta.getAuditoria(), "Auditoria não deve ser nula");
        assertFalse(resposta.getAuditoria().isEmpty(), "Auditoria não deve estar vazia");
    }
}
