package com.example.demo;

public class UserModel {
    private String nombre;
    private String telefono;
    private String mail;

    private String comentarios;

    public UserModel(String nombre, String telefono, String mail, String comentarios) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.comentarios = comentarios;
    }

    public UserModel (){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mail='" + mail + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}