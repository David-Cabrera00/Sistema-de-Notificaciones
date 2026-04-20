package com.universidad.notificaciones;
import com.universidad.modelo.Destinatario;
import com.universidad.modelo.Notificacion;

public class NotificacionMatricula extends Notificacion {
    private double monto;
    private String fechaVencimiento;

    public NotificacionMatricula(String codigo, Destinatario d, double monto, String fecha) {
        super(codigo, "Recordatorio: Tienes un pago de matrícula pendiente por $" + monto + " con vencimiento el " + fecha, d);
        this.monto = monto;
        this.fechaVencimiento = fecha;
    }

    @Override
    public String obtenerTipo() { return "RECORDATORIO MATRÍCULA"; }
}