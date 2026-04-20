package com.universidad.canales;
import com.universidad.modelo.EstadoNotificacion;
import com.universidad.modelo.Notificacion;

public class CanalCorreo implements CanalNotificacion {
    @Override
    public void enviar(Notificacion n) {
        System.out.println("📧 [Enviando EMAIL a " + n.getDestinatario().getCorreoElectronico() + "]");
        System.out.println("   Asunto: " + n.obtenerTipo());
        System.out.println("   Cuerpo: Hola " + n.getDestinatario().getNombre() + ", " + n.getMensaje());
        n.setEstado(EstadoNotificacion.ENVIADO);
    }

    @Override
    public String obtenerNombreCanal() { return "Correo Electrónico"; }
}