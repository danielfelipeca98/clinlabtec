package com.clinlabtec.model.examen;

import com.clinlabtec.enums.TipoExamen;

public class ExamenImagen extends Examen{
    private boolean requiereContraste;

    public ExamenImagen(boolean requiereContraste, int id, String codigo, String nombre, double precio, int tiempoEstimado, boolean activo){
        super(id, codigo, nombre, precio, tiempoEstimado, activo);
        this.requiereContraste = requiereContraste;
    }
    public ExamenImagen(boolean requiereContraste, String codigo, String nombre, double precio, int tiempoEstimado){
        super(codigo, nombre, precio, tiempoEstimado);
        this.requiereContraste = requiereContraste;
    }

    public boolean isRequiereContraste() {
        return requiereContraste;
    }

    public void setRequiereContraste(boolean requiereContraste) {
        this.requiereContraste = requiereContraste;
    }
    
    @Override 
    public TipoExamen getTipo(){
        return TipoExamen.IMAGEN;
    }
    @Override 
    public String getUnidad(){
        return "N/A";
    }

    @Override
        public String getInstrucciones() {
            if (requiereContraste) {
                return "Requiere contraste";
            } else {
                return "No requiere contraste";
            }
        }

    @Override
    public String toString() {
        return "ExamenImagen{" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", requiereContraste=" + requiereContraste +
                '}';
    }
}
