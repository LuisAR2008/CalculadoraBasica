package domain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class EventoBotones implements ActionListener{
	
	private JTextField txtPantalla;
	private double numeroAnterior;
	private String operacionPendiente;

	public EventoBotones(JTextField txtPantalla) {
		this.txtPantalla = txtPantalla;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 // Obtener el botón que generó el evento
		JButton botonPresionado = (JButton) e.getSource();
		String textoBoton = botonPresionado.getText();
		
		 // Realizar la acción según el botón presionado
		
		switch (textoBoton) {
		
		case "C":
					txtPantalla.setText(" ");	
			break;
			
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case ".":
			
			String numeroIngresado = txtPantalla.getText() + textoBoton;
			txtPantalla.setText(numeroIngresado);
			break;
			
		case "+":
		case "-":
		case "*":
		case "/":
			
			if (!txtPantalla.getText().isEmpty()) {
				
				operacionPendiente = textoBoton;
				numeroAnterior = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
			}
			
			
		case "=":
			
			if (!txtPantalla.getText().isEmpty()) {
				
				double numeroActual = Double.parseDouble(txtPantalla.getText());
				double resultado = realizaOperacion(numeroAnterior, numeroActual, operacionPendiente);
				txtPantalla.setText(String.valueOf(resultado));
			}
			break;
			
	
		}
	}
	
	public double realizaOperacion (double num1, double num2, String operacion) {
		
		switch (operacion) {
		
		case "+":
			return new OperacionesMatematicas().sumar(num1, num2);
			
		case "-": 
			return new OperacionesMatematicas().restar(num1, num2);
			
		case "*": 
			return new OperacionesMatematicas().multiplicar(num1, num2);
			
		case "/": 
			return new OperacionesMatematicas().dividir(num1, num2);
			
		default:
			throw new IllegalArgumentException("Operación Invalida");
		}
	}

}
