/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author Invitado
 */
public class Salida {
    private GregorianCalendar fechaHora;
    private Barco barco;
    private Destino destino;

    public Salida(GregorianCalendar fechaHora, Barco barco, Destino destino) {
        this.fechaHora = fechaHora;
        this.barco = barco;
        this.destino = destino;
    }

    public GregorianCalendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(GregorianCalendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.fechaHora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Salida other = (Salida) obj;
        if (!Objects.equals(this.fechaHora, other.fechaHora)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Salida{" + "fechaHora=" + fechaHora + ", barco=" + barco + ", destino=" + destino + '}';
    }
}
