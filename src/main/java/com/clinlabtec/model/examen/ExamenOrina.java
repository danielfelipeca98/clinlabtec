package com.clinlabtec.model.examen;

import com.clinlabtec.enums.TipoExamen;

public class ExamenOrina extends Examen{
    private boolean requierePrimeraOrina;

    public ExamenOrina(boolean requierePrimeraOrina, int id, String codigo, String nombre, double precio, int tiempoEstimado, boolean activo){
        super(id, codigo, nombre, precio, tiempoEstimado, activo);
        this.requierePrimeraOrina = requierePrimeraOrina;
    }
    public ExamenOrina(boolean requierePrimeraOrina, String codigo, String nombre, double precio, int tiempoEstimado){
        super(codigo, nombre, precio, tiempoEstimado);
        this.requierePrimeraOrina = requierePrimeraOrina;
    }

    public boolean isRequierePrimeraOrina() {
        return requierePrimeraOrina;
    }

    public void setRequierePrimeraOrina(boolean requierePrimeraOrina) {
        this.requierePrimeraOrina = requierePrimeraOrina;
    }
    
    @Override 
    public TipoExamen getTipo(){
        return TipoExamen.ORINA;
    }
    @Override 
    public String getUnidad(){
        return "mg/dL";
    }

    @Override
        public String getInstrucciones() {
            if (requierePrimeraOrina) {
                return "Requiere la primera orina del dia";
            } else {
                return "No requiere la primera orina del dia";
            }
        }

    @Override
    public String toString() {
        return "ExamenOrina{" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", requierePrimeraOrina=" + requierePrimeraOrina +
                '}';
    }
}
