package com.example.jaime.vuelos;

import java.util.Date;

/**
 * Created by jaime on 15/02/2018.
 */

public class Vuelo {
    private int plazas;
    private String salida;
    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String urlImageCompany;

    public Vuelo() {
    }

    public Vuelo(int plazas, String salida, String destino, Date fechaSalida, Date fechaLlegada, String urlImageCompany) {
        this.plazas = plazas;
        this.salida = salida;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.urlImageCompany = urlImageCompany;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getUrlImageCompany() {
        return urlImageCompany;
    }

    public void setUrlImageCompany(String urlImageCompany) {
        this.urlImageCompany = urlImageCompany;
    }
}
