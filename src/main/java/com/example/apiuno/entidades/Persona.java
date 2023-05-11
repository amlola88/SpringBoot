package com.example.apiuno.entidades;

public class Persona {

    private Integer identificacion;
    private String nombre;
    private String url;

    public Persona() {
    }

    public Persona(Integer identificacion, String nombre, String url) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.url = url;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
