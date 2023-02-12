package ConversorMonedas;

import javax.swing.*;

public class Funcion {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
	public void ConvertirMonedas(double ValorRecibido) {
		String opcion =(JOptionPane.showInputDialog(null, 
				"Elige la moneda a la que deseas covertir tu dinero ", "Monedas ", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreanos a Pesos"}, 
				"Seleccion")).toString();
		switch (opcion) {
		case "De Pesos a Dólar": 
			monedas.ConvertirPesosArgentinosADolar(ValorRecibido);
			break;
		case "De Pesos a Euro":
			monedas.ConvertirPesosArgentinosAEuro(ValorRecibido);
			break;
		case "De Pesos a Libras":
			monedas.ConvertirPesosArgentinosALibras(ValorRecibido);
			break;
		case "De Pesos a Yen":
			monedas.ConvertirPesosArgentinosAYen(ValorRecibido);
			break;
		case "De Pesos a Won Coreano":
			monedas.ConvertirPesosArgentinosAWonCoreano(ValorRecibido);
			break;
		case "De Dólar a Pesos":
			pesos.ConvertirDolarAPesosArgentinos(ValorRecibido);
			break;
		case "De Euro a Pesos":
			pesos.ConvertirEuroAPesosArgentinos(ValorRecibido);
			break;
		case "De Libras a Pesos":
			pesos.ConvertirLibrasAPesosArgentinos(ValorRecibido);
			break;
		case "De Libras a Yen":
			pesos.ConvertirLibrasAPesosArgentinos(ValorRecibido);
			break;
		case "De Libras a Won Coreano":
			pesos.ConvertirLibrasAPesosArgentinos(ValorRecibido);
			break;
		}
		
		
	}
}
