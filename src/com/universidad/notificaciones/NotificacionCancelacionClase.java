package com.universidad.notificaciones;
import com.universidad.modelo.Destinatario;
import com.universidad.modelo.Notificacion;

public class NotificacionCancelacionClase extends Notificacion {
    private String nombreClase;
    private String motivo;

    public NotificacionCancelacionClase(String codigo, Destinatario d, String clase, String motivo) {
        super(codigo, "La clase " + clase + " ha sido cancelada. Motivo: " + motivo, d);
        this.nombreClase = clase;
        this.motivo = motivo;
    }

    @Override
    public String obtenerTipo() { return "CANCELACIÓN DE CLASE"; }
}