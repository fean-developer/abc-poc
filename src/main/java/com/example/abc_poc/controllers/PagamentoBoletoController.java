package com.example.abc_poc.controllers;

import com.example.abc_poc.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;

@RestController
@RequestMapping("/api/pagamento-boleto")
public class PagamentoBoletoController {
    @GetMapping("/resposta")
    public PagamentoBoletoResposta getPagamentoBoletoResposta() {
        // Monta objeto de resposta com dados de exemplo
        PagamentoBoletoResposta resposta = new PagamentoBoletoResposta();

        Cabecalho cabecalho = new Cabecalho();
        // ...setters para cabecalho...
        resposta.setCabecalho(cabecalho);

        Transacao transacao = new Transacao();
        // ...setters para transacao...
        resposta.setTransacao(transacao);

        AtividadeAuditoria aud1 = new AtividadeAuditoria();
        // ...setters para aud1...
        resposta.setAuditoria(Arrays.asList(aud1));

        return resposta;
    }
}
