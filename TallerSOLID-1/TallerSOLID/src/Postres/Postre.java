/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public void setaderezos(){
    	this.aderezos = aderezos;
    }
    
    public double getprecioParcial() {
    	return precioParcial;
    }
    
    public void setprecioParcial(double precioParcial) {
    	this.precioParcial = precioParcial;
    }
    
    
}