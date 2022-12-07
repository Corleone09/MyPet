package com.example.mypet;

public class Mascotas {

    private String nombre, edad, raza, telefono;
    private int idImagen;

    public Mascotas(String nombre, String edad, String raza, String telefono, int idImagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.telefono = telefono;
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", raza='" + raza + '\'' +
                ", telefono='" + telefono + '\'' +
                ", idImagen=" + idImagen +
                '}';
    }
}

