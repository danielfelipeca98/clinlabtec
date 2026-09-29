package com.clinlabtec.enums;

public enum EstadoDetalle {
    PENDIENTE("Estado pendiente"),
    COMPLETADO("Estado completado");

    private final String descripcion;

    EstadoDetalle(String descripcion){
        this.descripcion = descripcion;
    }

    @Override 
    public String toString(){
        return descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public boolean esFinal(){
        return  this == COMPLETADO;
    }

    public boolean puedeTransicionarA(EstadoDetalle nuevo){
        return this == PENDIENTE && nuevo == COMPLETADO;
    }

}

