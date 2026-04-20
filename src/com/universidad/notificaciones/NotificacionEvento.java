package com.universidad.notificaciones;
import com.universidad.modelo.Destinatario;
import com.universidad.modelo.Notificacion;

public class NotificacionEvento extends Notificacion {
    private String nombreEvento;
    private String fechaEvento;

    public NotificacionEvento(String codigo, Destinatario d, String evento, String fecha) {
        super(codigo, "Inscripción confirmada para el evento: " + evento + " el día " + fecha, d);
        this.nombreEvento = evento;
        this.fechaEvento = fecha;
    }

    @Override
    public String obtenerTipo() { return "REGISTRO A EVENTO"; }
}