package com.universidad.canales;
import com.universidad.modelo.EstadoNotificacion;
import com.universidad.modelo.Notificacion;

public class CanalSms implements CanalNotificacion {
    @Override
    public void enviar(Notificacion n) {
        System.out.println("📱 [Enviando SMS al número " + n.getDestinatario().getNumeroTelefono() + "]");
        System.out.println("   Mensaje: UnivNotifica - " + n.getMensaje());
        n.setEstado(EstadoNotificacion.ENVIADO);
    }

    @Override
    public String obtenerNombreCanal() { return "SMS"; }
}