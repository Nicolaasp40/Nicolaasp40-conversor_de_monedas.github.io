package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {

	public void ConvertirDolarAPesosArgentinos(double valorRecibido) {
		double monedaPesosArgentinos = valorRecibido / 0.0053;
		monedaPesosArgentinos = (double) Math.round(monedaPesosArgentinos *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArgentinos+ " Pesos");
	}
	
	public void ConvertirEuroAPesosArgentinos(double valorRecibido) {
		double monedaPesosArgentinos = valorRecibido / 0.0049;
		monedaPesosArgentinos = (double) Math.round(monedaPesosArgentinos *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArgentinos+ " Pesos");
	}
	
	public void ConvertirLibrasAPesosArgentinos(double valorRecibido) {
		double monedaPesosArgentinos = valorRecibido / 0.0044;
		monedaPesosArgentinos = (double) Math.round(monedaPesosArgentinos *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArgentinos+ " Pesos");
	}
	
	public void ConvertirYenAPesosArgentinos(double valorRecibido) {
		double monedaPesosArgentinos = valorRecibido / 6.64;
		monedaPesosArgentinos = (double) Math.round(monedaPesosArgentinos *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArgentinos+ " Pesos");
	}
}
