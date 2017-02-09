package com.example.oscar.master_details.dummy;

import java.io.Serializable;

/**
 * Created by oscar on 27/01/2017.
 */

public class Telefonos implements Serializable{
    int id;
    String marca;
    String modelo;
    String urlImagen;

    public Telefonos(int id, String marca, String modelo, String urlImagen) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.urlImagen=urlImagen;
    }

    public Telefonos() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUrlImagen(){return urlImagen;}

    public void getUrlImagen(String urlFoto){this.urlImagen = urlFoto;}

}
