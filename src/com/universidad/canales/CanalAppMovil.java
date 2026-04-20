package com.universidad.canales;
import com.universidad.modelo.EstadoNotificacion;
import com.universidad.modelo.Notificacion;

public class CanalAppMovil implements CanalNotificacion {
    @Override
    public void enviar(Notificacion n) {
        System.out.println("🔔 [Enviando PUSH a la App, Token: " + n.getDestinatario().getTokenDispositivo() + "]");
        System.out.println("   Notificación: " + n.obtenerTipo() + " - " + n.getMensaje());
        n.setEstado(EstadoNotificacion.ENVIADO);
    }

    @Override
    public String obtenerNombreCanal() { return "App Móvil"; }
}