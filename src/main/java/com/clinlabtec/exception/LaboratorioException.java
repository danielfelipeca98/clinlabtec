package com.clinlabtec.exception;

public class LaboratorioException extends RuntimeException {

    public LaboratorioException(String mensaje) {
        super(mensaje);
    }

    public LaboratorioException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}