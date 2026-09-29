package com.clinlabtec.model;

import com.clinlabtec.enums.EstadoOrden;
import com.clinlabtec.enums.Prioridad;
import java.time.LocalDateTime;
import java.util.Objects;

public class Orden {
        private final int id;
        private final String codigo;
        private final int pacienteId;
        private final int medicoId;
        private final LocalDateTime fechaCreacion;
        private EstadoOrden estado;
        private Prioridad  prioridad;
        private String creadoPor;
        private String observaciones;
        private boolean activo;

        public Orden(int id, String codigo, int pacienteId, int medicoId, LocalDateTime fechaCreacion,EstadoOrden estado, Prioridad  prioridad, String creadoPor, String observaciones, boolean activo){
            this.id = id;
            this.codigo = codigo;
            this.pacienteId = pacienteId;
            this.medicoId = medicoId;
            this.fechaCreacion = fechaCreacion;
            this.estado = estado;
            this.prioridad = prioridad;
            this.creadoPor = creadoPor;
            this.observaciones = observaciones;
            this.activo = activo;
        }

        public Orden(String codigo, int pacienteId, int medicoId, LocalDateTime fechaCreacion,EstadoOrden estado, Prioridad  prioridad, String creadoPor, String observaciones){
            this.id = 0;
            this.codigo = codigo;
            this.pacienteId = pacienteId;
            this.medicoId = medicoId;
            this.fechaCreacion = fechaCreacion;
            this.estado = estado;
            this.prioridad = prioridad;
            this.creadoPor = creadoPor;
            this.observaciones = observaciones;
            this.activo = true;
        }

        public int getId() {
            return id;
        }
        public String getCodigo() {
            return codigo;
        }
        public int getPacienteId() {
            return pacienteId;
        }
        public int getMedicoId(){
            return medicoId;
        }
        public LocalDateTime getFechaCreacion(){
            return fechaCreacion;
        }
        public EstadoOrden getEstado(){
            return estado;
        }
        public Prioridad getPrioridad(){
            return prioridad;
        }
        public String getCreadoPor(){
            return creadoPor;
        }
        public String getObservaciones(){
            return observaciones;
        }
        public boolean isActivo(){
            return activo;
        }

        public void setEstado(EstadoOrden estado){
            this.estado = estado;
        }
        public void setPrioridad(Prioridad prioridad){
            this.prioridad = prioridad;
        }
        public void setCreadoPor(String creadoPor){
            this.creadoPor = creadoPor;
        }
        public void setObservaciones(String observaciones){
            this.observaciones = observaciones;
        }
        public void setActivo(boolean activo){
            this.activo = activo;
        }

        @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", codigo='" + codigo +'\'' +
                ", pacienteId=" + pacienteId + 
                ", medicoId=" + medicoId +
                ", fechaCreacion=" + fechaCreacion +
                ", estado=" + estado +
                ", prioridad=" + prioridad  +
                ", creadoPor='" + creadoPor + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", activo=" + activo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Orden))
            return false;
        Orden otro = (Orden) obj;
        return Objects.equals(codigo, otro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    
}
