/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author salaboy
 */
@XmlRootElement
public class Ancestro {
    
    private String ancestro;
    private String descendiente;

    public Ancestro() {
    }

    public String getAncestro() {
        return ancestro;
    }

    public void setAncestro(String name) {
        this.ancestro = name;
    }

    public String getDescendiente() {
        return descendiente;
    }

    public void setDescendiente(String name) {
        this.descendiente = name;
    }
   
    @Override
    public String toString() {
        return "Ancestro{" + ancestro + " es ancestro de =" + descendiente + "}";
    }

    public Ancestro(String ancestro, String descendiente) {
	this.ancestro = ancestro;
	this.descendiente = descendiente;
    }
    
}
