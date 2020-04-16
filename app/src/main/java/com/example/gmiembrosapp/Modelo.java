package com.example.gmiembrosapp;

public class Modelo {

    private int imgFoto;
    private String nombre;
    private String ciudad;
    private String matricula;
    private String expresion;

    public Modelo(int imgFoto, String nombre, String ciudad, String matricula, String expresion) {
        this.imgFoto = imgFoto;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.matricula = matricula;
        this.expresion = expresion;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getciudad() {
        return ciudad;
    }

    public void setciudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
}
