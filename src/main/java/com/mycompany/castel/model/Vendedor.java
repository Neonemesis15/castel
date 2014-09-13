/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.castel.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author SABADO-MANHANA
 */
@Entity
@Table(name="vendedor")
public class Vendedor implements Serializable{
    @Id 
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name="estado")
    private String estado;
    
    @OneToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
