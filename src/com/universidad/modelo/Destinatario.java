package com.universidad.modelo;

public class Destinatario {
    private String id;
    private String nombre;
    private String correoElectronico;
    private String numeroTelefono;
    private String tokenDispositivo;

    public Destinatario(String id, String nombre, String correo, String tel, String token) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correo;
        this.numeroTelefono = tel;
        this.tokenDispositivo = token;
    }

    public String getNombre() { return nombre; }
    public String getCorreoElectronico() { return correoElectronico; }
    public String getNumeroTelefono() { return numeroTelefono; }
    public String getTokenDispositivo() { return tokenDispositivo; }
}