package com.clinlabtec.model;

import java.util.Objects;

public class Medico {
    private final int id;
    private final int cedula;
    private String nombre;
    private String apellido;
    private String especialidad;
    private final String numeroLicencia;
    private String correo;
    private String telefono;
    private boolean activo;

    public Medico(int id, int cedula, String nombre, String apellido, String especialidad, String numeroLicencia,
            String correo, String telefono, boolean activo) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.numeroLicencia = numeroLicencia;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Medico(int cedula, String nombre, String apellido, String especialidad, String numeroLicencia, String correo,
            String telefono) {
        this.id = 0;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.numeroLicencia = numeroLicencia;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = true;
    }

    public int getId() {
        return id;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isActivo() {
        return activo;
    }
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setActivo(boolean activo){
        this.activo= activo;
    }

    

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad=" + especialidad +
                ", numeroLicencia=" + numeroLicencia +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", activo=" + activo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Medico))
            return false;
        Medico otro = (Medico) obj;
        return Objects.equals(cedula, otro.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }
}
