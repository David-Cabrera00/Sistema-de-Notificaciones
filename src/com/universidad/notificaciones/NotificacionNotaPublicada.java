package com.universidad.notificaciones;
import com.universidad.modelo.Destinatario;
import com.universidad.modelo.Notificacion;

public class NotificacionNotaPublicada extends Notificacion {
    private String nombreCurso;
    private double nota;

    public NotificacionNotaPublicada(String codigo, Destinatario d, String curso, double nota) {
        super(codigo, "Tu nota en el curso " + curso + " ha sido publicada. Calificación: " + nota, d);
        this.nombreCurso = curso;
        this.nota = nota;
    }

    @Override
    public String obtenerTipo() { return "CALIFICACIÓN PUBLICADA"; }
}