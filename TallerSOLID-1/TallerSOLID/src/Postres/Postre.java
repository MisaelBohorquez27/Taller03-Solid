/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Procesos.ManejadorDePrecio;
import src.Procesos.Aderezo;
import src.Procesos.String;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Postre {
	
	private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public ManejadorDePrecio (double precioParcial, ArrayList<Aderezo> aderezos) {
    	this.precioParcial = preParcial;
    	this.aderezos = aderezos;
    }
	
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
		
	
	@Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
	
}