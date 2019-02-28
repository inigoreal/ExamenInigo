package com.example.cf17inigoreal.appexameniigoreal;

public class Reserva {

    private String fechaReserva;
    private String comensalesReserva;
    private String nombreReserva;
    private String telefReserva;
    private String comentarioReserva;

    public Reserva() {
    }

    public Reserva(String fechaReserva, String comensalesReserva, String nombreReserva, String telefReserva, String comentarioReserva) {
        this.fechaReserva = fechaReserva;
        this.comensalesReserva = comensalesReserva;
        this.nombreReserva = nombreReserva;
        this.telefReserva = telefReserva;
        this.comentarioReserva = comentarioReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getComensalesReserva() {
        return comensalesReserva;
    }

    public void setComensalesReserva(String comensalesReserva) {
        this.comensalesReserva = comensalesReserva;
    }

    public String getNombreReserva() {
        return nombreReserva;
    }

    public void setNombreReserva(String nombreReserva) {
        this.nombreReserva = nombreReserva;
    }

    public String getTelefReserva() {
        return telefReserva;
    }

    public void setTelefReserva(String telefReserva) {
        this.telefReserva = telefReserva;
    }

    public String getComentarioReserva() {
        return comentarioReserva;
    }

    public void setComentarioReserva(String comentarioReserva) {
        this.comentarioReserva = comentarioReserva;
    }
}
