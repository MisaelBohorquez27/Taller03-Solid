package Procesos;

import src.Postres.Aderezo;
import src.Postres.ArrayList;
import src.Postres.String;

public class ManejadorDePrecio {
	
	
	
	public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
	
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
}