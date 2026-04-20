package com.universidad.servicio;
import com.universidad.canales.CanalNotificacion;
import com.universidad.modelo.EstadoNotificacion;
import com.universidad.modelo.Notificacion;

public class ServicioNotificacion {
    public void procesarEnvio(Notificacion notificacion, CanalNotificacion canal) {
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando envío de notificación...");
        System.out.println("Canal seleccionado: " + canal.obtenerNombreCanal());
        
        canal.enviar(notificacion);
        
        System.out.println("Estado final: " + EstadoNotificacion.ENVIADO);
        System.out.println("--------------------------------------------------\n");
    }
}