package com.example.warthunder;

public class Aviones {
    private int Id;
    private int Motores;

    private int VelocidadMaxima;

    private int AlturaMaxima;

    private int AñoFabricacion;

    private int Url_imagen;

    public Aviones(){}

    public Aviones(int id, int motores, int velocidadMaxima, int alturaMaxima, int añoFabricacion, int url_imagen) {

        Id = id;
        Motores = motores;
        VelocidadMaxima = velocidadMaxima;
        AlturaMaxima = alturaMaxima;
        AñoFabricacion = añoFabricacion;
        Url_imagen = url_imagen;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getMotores() {
        return Motores;
    }

    public void setMotores(int motores) {
        Motores = motores;
    }

    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        VelocidadMaxima = velocidadMaxima;
    }

    public int getAlturaMaxima() {
        return AlturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        AlturaMaxima = alturaMaxima;
    }

    public int getAñoFabricacion() {
        return AñoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        AñoFabricacion = añoFabricacion;
    }

    public int getUrl_imagen() {
        return Url_imagen;
    }

    public void setUrl_imagen(int url_imagen) {
        Url_imagen = url_imagen;
    }
}
