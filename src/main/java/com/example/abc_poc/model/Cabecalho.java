package com.example.abc_poc.model;

public class Cabecalho {
    private String messageId;
    private String correlationId;
    private String processInstanceId;
    private String dataGeracao;
    private String ambiente;
    private String origemSistema;
    private int duracaoMs;
    private String host;
    private String engine;
    private String versaoProcesso;

    public String getMessageId() { return messageId; }
    public void setMessageId(String messageId) { this.messageId = messageId; }
    public String getCorrelationId() { return correlationId; }
    public void setCorrelationId(String correlationId) { this.correlationId = correlationId; }
    public String getProcessInstanceId() { return processInstanceId; }
    public void setProcessInstanceId(String processInstanceId) { this.processInstanceId = processInstanceId; }
    public String getDataGeracao() { return dataGeracao; }
    public void setDataGeracao(String dataGeracao) { this.dataGeracao = dataGeracao; }
    public String getAmbiente() { return ambiente; }
    public void setAmbiente(String ambiente) { this.ambiente = ambiente; }
    public String getOrigemSistema() { return origemSistema; }
    public void setOrigemSistema(String origemSistema) { this.origemSistema = origemSistema; }
    public int getDuracaoMs() { return duracaoMs; }
    public void setDuracaoMs(int duracaoMs) { this.duracaoMs = duracaoMs; }
    public String getHost() { return host; }
    public void setHost(String host) { this.host = host; }
    public String getEngine() { return engine; }
    public void setEngine(String engine) { this.engine = engine; }
    public String getVersaoProcesso() { return versaoProcesso; }
    public void setVersaoProcesso(String versaoProcesso) { this.versaoProcesso = versaoProcesso; }
}
