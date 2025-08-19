package com.example.abc_poc.model;

public class AtividadeAuditoria {
    private String nome;
    private String inicio;
    private String fim;
    private int duracaoMs;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getInicio() { return inicio; }
    public void setInicio(String inicio) { this.inicio = inicio; }
    public String getFim() { return fim; }
    public void setFim(String fim) { this.fim = fim; }
    public int getDuracaoMs() { return duracaoMs; }
    public void setDuracaoMs(int duracaoMs) { this.duracaoMs = duracaoMs; }
}
