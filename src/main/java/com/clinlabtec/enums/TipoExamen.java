package com.clinlabtec.enums;

public enum TipoExamen {
    SANGRE("Examen de sangre"),
    ORINA("Examen de orina"),
    IMAGEN("Examen imagen diagnostica");

    private final String descripcion;

    TipoExamen(String descripcion){
        this.descripcion = descripcion;    
    }

    @Override 
    public String toString(){
        return descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
