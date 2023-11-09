package com.example.warthunder;

public class Aviones {
    private int Id;
    private int Motores;

    private int VelocidadMaxima;

    private int AlturaMaxima;

    private int AñoFabricacion;

    private String Url_imagen;

    public Aviones(){}

    public Aviones(int id, int motores, int velocidadMaxima, int alturaMaxima, int añoFabricacion, String url_imagen) {

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

    public String getUrl_imagen() {
        return Url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        Url_imagen = url_imagen;
    }

    @Override
    public String toString() {
        return "Aviones{" +
                "Id=" + Id +
                ", Motores=" + Motores +
                ", VelocidadMaxima=" + VelocidadMaxima +
                ", AlturaMaxima=" + AlturaMaxima +
                ", AñoFabricacion=" + AñoFabricacion +
                ", Url_imagen=" + Url_imagen +
                '}';
    }

}
