package com.clinlabtec.enums;

public enum EstadoOrden {
    PENDIENTE("Orden pendiente de pago"),
    EN_PROCESO("Orden en proceso"),
    COMPLETADA("Orden completada"),
    CANCELADA("Orden cancelada");

    private final String descripcion;

    EstadoOrden(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override 
    public String toString(){
        return descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean esFinal() {
        return this == COMPLETADA || this == CANCELADA;
    }

    public boolean esCancelable() {
        return this == PENDIENTE || this == EN_PROCESO;
        
    }

    public boolean puedeTransicionarA(EstadoOrden nuevo){
        return switch(this){
            case PENDIENTE -> nuevo == EN_PROCESO || nuevo == CANCELADA;
            case EN_PROCESO -> nuevo == COMPLETADA || nuevo == CANCELADA;
            case COMPLETADA,CANCELADA -> false;

        };
    }
}