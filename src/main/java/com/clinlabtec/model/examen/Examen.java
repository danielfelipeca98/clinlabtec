package com.clinlabtec.model.examen;

import java.util.Objects;

import com.clinlabtec.enums.TipoExamen;

public abstract class Examen {
    private final int id;
    private final String codigo;
    private String nombre;
    private double precio;
    private int tiempoEstimado;
    private boolean activo;

    public Examen(int id, String codigo, String nombre, double precio, int tiempoEstimado, boolean activo){
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoEstimado = tiempoEstimado;
        this.activo = activo;
    }
    public Examen(String codigo, String nombre, double precio, int tiempoEstimado){
        this.id = 0;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoEstimado = tiempoEstimado;
        this.activo = true;
    }

    public abstract TipoExamen getTipo();
    public abstract String getUnidad();
    public  abstract String getInstrucciones();
    
    public int getId(){
        return id;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getTiempoEstimado(){
        return tiempoEstimado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setTiempoEstimado(int tiempoEstimado){
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setActivo(boolean activo) {
    this.activo = activo;
}

    @Override
    public String toString() {
        return "Examen{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", unidad='" + getUnidad() + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tiempoEstimado=" + tiempoEstimado +
                ", activo=" + activo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Examen))
            return false;
        Examen otro = (Examen) obj;
        return Objects.equals(codigo, otro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }


}
