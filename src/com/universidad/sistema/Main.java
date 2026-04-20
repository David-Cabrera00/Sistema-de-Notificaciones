package com.universidad.sistema;

import com.universidad.canales.*;
import com.universidad.modelo.Destinatario;
import com.universidad.modelo.Notificacion;
import com.universidad.notificaciones.*;
import com.universidad.servicio.ServicioNotificacion;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos el servicio
        ServicioNotificacion servicio = new ServicioNotificacion();

        // 2. Instanciamos los canales disponibles
        CanalNotificacion email = new CanalCorreo();
        CanalNotificacion sms = new CanalSms();
        CanalNotificacion app = new CanalAppMovil();

        // 3. Creamos algunos usuarios (Destinatarios)
        Destinatario alumno1 = new Destinatario("U001", "David Cabrera", "david@universidad.edu", "310-555-1234", "TOKEN_A1B2");
        Destinatario alumno2 = new Destinatario("U002", "Ana Lopez", "ana@universidad.edu", "320-555-9876", "TOKEN_X9Y8");

        System.out.println("=== SISTEMA DE NOTIFICACIONES UNIVERSITARIAS ===\n");

        // --- PRUEBA 1: Nota Publicada por Email ---
        Notificacion nota = new NotificacionNotaPublicada("N001", alumno1, "Matemáticas Discretas", 4.8);
        servicio.procesarEnvio(nota, email);

        // --- PRUEBA 2: Recordatorio de Matrícula por SMS ---
        Notificacion matricula = new NotificacionMatricula("N002", alumno2, 1500.50, "30/11/2026");
        servicio.procesarEnvio(matricula, sms);

        // --- PRUEBA 3: Cancelación de Clase por App Móvil ---
        Notificacion cancelacion = new NotificacionCancelacionClase("N003", alumno1, "Programación Java", "Enfermedad del profesor");
        servicio.procesarEnvio(cancelacion, app);

        // --- PRUEBA 4: Evento por Email ---
        Notificacion evento = new NotificacionEvento("N004", alumno2, "Seminario de Inteligencia Artificial", "15/12/2026");
        servicio.procesarEnvio(evento, email);
    }
}