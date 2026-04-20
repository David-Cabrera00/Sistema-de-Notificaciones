package com.universidad.modelo;
import java.time.LocalDateTime;

public abstract class Notificacion {
    protected String codigo;
    protected String mensaje;
    protected LocalDateTime fechaEnvio;
    protected EstadoNotificacion estado;
    protected Destinatario destinatario;

    public Notificacion(String codigo, String mensaje, Destinatario destinatario) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.estado = EstadoNotificacion.PENDIENTE;
        this.fechaEnvio = LocalDateTime.now();
    }

    public abstract String obtenerTipo();
    
    public Destinatario getDestinatario() { return destinatario; }
    public String getMensaje() { return mensaje; }
    public void setEstado(EstadoNotificacion estado) { this.estado = estado; }
}