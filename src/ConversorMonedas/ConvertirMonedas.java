package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosArgentinosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 188.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar+ " Dolares");
	}
		
	public void ConvertirPesosArgentinosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 203.67;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro+ " Euros");
	}
	
	public void ConvertirPesosArgentinosALibras(double valorRecibido) {
		double monedaLibras = valorRecibido / 226.58;
		monedaLibras = (double) Math.round(monedaLibras *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibras+ " Libras");
	}
	
	public void ConvertirPesosArgentinosAYen(double valorRecibido) {
		double monedaYen = valorRecibido / 1.43;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen+ " Yenes");
	}
	
	public void ConvertirPesosArgentinosAWonCoreano(double valorRecibido) {
		double monedaWonCoreano = valorRecibido / 0.15;
		monedaWonCoreano = (double) Math.round(monedaWonCoreano *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonCoreano+ " Wones Coreanos");
	}
	
}
