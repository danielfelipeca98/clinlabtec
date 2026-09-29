package com.clinlabtec.enums;

public enum Prioridad {
    NORMAL("Prioridad normal", 1),
    URGENTE("Prioridad urgente",2),
    CRITICA("Prioridad critica",3);

    private final String descripcion;
    private final int nivel;

    Prioridad(String descripcion, int nivel){
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    @Override 
    public String toString(){
        return descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean esAlta(){
        return this == URGENTE || this == CRITICA;
    }    
}
