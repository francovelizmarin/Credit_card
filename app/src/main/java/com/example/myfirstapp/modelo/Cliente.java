package com.example.myfirstapp.modelo;

public class Cliente {
    private String Nombre ;
    private String Apellido;
    private int NT;
    private int mes;
    private int año;
    private int codigo;
    private String calle;
    private String Ciudad;
    private int codpost;
    private int numeroDeTarjeta;

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    private String Estado;


    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }


    public int getNT() {
        return NT;
    }

    public void setNT(int NT) {
        this.NT = NT;
    }


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }


    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) { Ciudad = ciudad; }


    public int getCodpost() {
        return codpost;
    }

    public void setCodpost(int codpost) {
        this.codpost = codpost;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getnumeroDeTarjeta() {return numeroDeTarjeta;}

    public void setNumeroDeTarjeta(int numeroDeTarjeta) { this.numeroDeTarjeta = numeroDeTarjeta;}
}
