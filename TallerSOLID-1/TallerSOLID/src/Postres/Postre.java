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
    
    public void ManejadorDePrecio (double precioParcial, ArrayList<Aderezo> aderezos) {
    	this.precioParcial = precioParcial;
    	this.aderezos = aderezos;
    }
	
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public void setaderezos(ArrayList<Aderezo> ad){
    	this.aderezos = ad;
    }
    
    public double getprecioParcial() {
    	return precioParcial;
    }
    
    public void setprecioParcial(double precioParcial) {
    	this.precioParcial = precioParcial;
    }
    
    public void addAderezos(Aderezo ade){
        aderezos.add(ade);
    }
		
	
	@Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
	
}