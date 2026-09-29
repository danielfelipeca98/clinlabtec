package com.clinlabtec.model.examen;

import com.clinlabtec.enums.TipoExamen;

public class ExamenSangre extends Examen{
    private boolean requiereAyuno;

    
    public ExamenSangre(boolean requiereAyuno, int id, String codigo, String nombre, double precio, int tiempoEstimado, boolean activo){
        super(id, codigo, nombre, precio, tiempoEstimado, activo);
        this.requiereAyuno = requiereAyuno;
    }

    public ExamenSangre(boolean requiereAyuno, String codigo, String nombre, double precio, int tiempoEstimado){
        super(codigo, nombre, precio, tiempoEstimado);
        this.requiereAyuno = requiereAyuno;
    }

    public boolean isRequiereAyuno() {
        return requiereAyuno;
    }

    public void setRequiereAyuno(boolean requiereAyuno) {
        this.requiereAyuno = requiereAyuno;
    }

    @Override
    public TipoExamen getTipo() {
        return TipoExamen.SANGRE;   
    }

    @Override 
    public String getUnidad(){
        return "mg/dL";
    }

    @Override
    public String getInstrucciones() {
        if (requiereAyuno) {
            return "Requiere ayuno de 8 horas";
        } else {
            return "No requiere ayuno";
        }
    }

    @Override
    public String toString() {
        return "ExamenSangre{" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", requiereAyuno=" + requiereAyuno +
                '}';
    }

}
