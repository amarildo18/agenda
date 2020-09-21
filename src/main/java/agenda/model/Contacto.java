/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author amarildo.ferreira
 */
@Entity
@Table(name="contacto")
public class Contacto implements Serializable{
    
    @Id
    @Column(name="id_contacto", nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="nome_contacto", nullable=false, length = 45)
    private String nome;
    @Column(name="sobrenome_contacto")
    private String sobrenome;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private String email;
    private String telefone;
    
    public Contacto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
