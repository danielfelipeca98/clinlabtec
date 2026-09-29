package com.clinlabtec.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Resultado {
    private final int id;
    private final int detalleOrdenId;
    private String valor;
    private String unidad;
    private final LocalDateTime fechaRegistro;
    private String registradoPor;
    private boolean activo;

    public Resultado(int id, int detalleOrdenId, String valor, String unidad, LocalDateTime fechaRegistro, String registradoPor, boolean activo){
        this.id = id;
        this.detalleOrdenId = detalleOrdenId;
        this.valor = valor;
        this.unidad = unidad;
        this.fechaRegistro = fechaRegistro;
        this.registradoPor = registradoPor;
        this.activo = activo;
    }
    public Resultado(int detalleOrdenId, String valor, String unidad, String registradoPor){
        this.id = 0;
        this.detalleOrdenId = detalleOrdenId;
        this.valor = valor;
        this.unidad = unidad;
        this.fechaRegistro = LocalDateTime.now();
        this.registradoPor = registradoPor;
        this.activo = true;
    }

    public int getId() {
        return id;
    }

    public int getDetalleOrdenId() {
        return detalleOrdenId;
    }

    public String getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    public String getRegistradoPor() {
        return  registradoPor;
    }
    public boolean isActivo() {
        return activo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "id=" + id +
                ", detalleOrdenId=" + detalleOrdenId +
                ", valor='" + valor + '\'' +
                ", unidad='" + unidad + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", registradoPor='" + registradoPor + '\'' +
                ", activo=" + activo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Resultado)) return false;
        Resultado otro = (Resultado) obj;
        return Objects.equals(id, otro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
