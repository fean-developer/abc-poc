package com.example.abc_poc.model;

public class Identificadores {
    private String tid;
    private String idempotencyKey;
    private boolean duplicado;

    public String getTid() { return tid; }
    public void setTid(String tid) { this.tid = tid; }
    public String getIdempotencyKey() { return idempotencyKey; }
    public void setIdempotencyKey(String idempotencyKey) { this.idempotencyKey = idempotencyKey; }
    public boolean isDuplicado() { return duplicado; }
    public void setDuplicado(boolean duplicado) { this.duplicado = duplicado; }
}
