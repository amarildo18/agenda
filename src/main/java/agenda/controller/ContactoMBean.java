/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.model.Contacto;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author amarildo.ferreira
 */
@Named(value = "contactoMBean")
@RequestScoped
public class ContactoMBean {

    /**
     * Creates a new instance of ContactoMBean
     */
    Contacto contacto = new Contacto();
    
    @PostConstruct
    public void init(){
    
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    public String salvar(){
        
        return "resultado";
    }
    
    public String inicio(){
    
        return "index";
    }
    
}
