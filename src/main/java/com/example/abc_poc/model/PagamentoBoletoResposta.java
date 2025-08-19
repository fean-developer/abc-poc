package com.example.abc_poc.model;

import java.util.List;

public class PagamentoBoletoResposta {
    private Cabecalho cabecalho;
    private Transacao transacao;
    private List<AtividadeAuditoria> auditoria;

    // Getters and setters
    public Cabecalho getCabecalho() { return cabecalho; }
    public void setCabecalho(Cabecalho cabecalho) { this.cabecalho = cabecalho; }
    public Transacao getTransacao() { return transacao; }
    public void setTransacao(Transacao transacao) { this.transacao = transacao; }
    public List<AtividadeAuditoria> getAuditoria() { return auditoria; }
    public void setAuditoria(List<AtividadeAuditoria> auditoria) { this.auditoria = auditoria; }
}
