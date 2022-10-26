package Procesos;

import Postres.Postre;

public class ManejadorDePrecio extends Postre{
	
    public static double calcularPrecioFinal(Postre postre){
        double precioFinal;
        precioFinal=(postre.getprecioParcial()+(postre.getprecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;
    }
	
    public static String showPrecioFinal(Postre postre){
        return "Precio Final: $ " + calcularPrecioFinal(postre);
    }
    
}