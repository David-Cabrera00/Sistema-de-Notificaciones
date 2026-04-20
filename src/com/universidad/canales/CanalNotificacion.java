package com.universidad.canales;
import com.universidad.modelo.Notificacion;

public interface CanalNotificacion {
    void enviar(Notificacion notificacion);
    String obtenerNombreCanal();
}