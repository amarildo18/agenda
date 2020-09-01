/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author amarildo.ferreira
 */
public class Recado {
    private String emitente;
    private String municipio;
    private String conteudo;
    private String destinatario;
    private Date data;

    public Recado(){
    }
    
    public Recado(String emitente, String municipio, String conteudo, String destinatario, Date data) {
        this.emitente = emitente;
        this.municipio = municipio;
        this.conteudo = conteudo;
        this.destinatario = destinatario;
        this.data = data;
    }

    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.emitente);
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
        final Recado other = (Recado) obj;
        if (!Objects.equals(this.emitente, other.emitente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Recado{" + "emitente=" + emitente + '}';
    }
    
    
}
