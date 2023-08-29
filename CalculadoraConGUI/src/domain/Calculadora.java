package domain;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPantalla;
	
	JButton btnLimpiar,btnDividir,btnMultiplicar,btnRestar,btnSumar,
			btnIgual, btnDecimal;
	
	JButton btnNumNueve, btnNumOcho, btnNumSiete, btnNumSeis, 
			btnNumCinco, btnNumCuatro, btnNumTres, btnNumDos, 	
			btnNumUno, btnCero;

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		
		iniciarCalculadora();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");         //Insertamos Titulo a nuestra ventana
		setLocationRelativeTo(null);    //Permite que nuestra ventana aparesca en el centro de la pantalla
		setResizable(false);           //Impide que se pueda modificar el tamaño de la vetana
	
		//Cremaos una instancia de la Clase EventoBotones para agregar los eventos de los botones
		EventoBotones manejadorEventos = new EventoBotones(txtPantalla);
		
		btnLimpiar.addActionListener(manejadorEventos);
		btnIgual.addActionListener(manejadorEventos);
		btnDecimal.addActionListener(manejadorEventos);
		
		btnCero.addActionListener(manejadorEventos);
		btnNumUno.addActionListener(manejadorEventos);
		btnNumDos.addActionListener(manejadorEventos);
		btnNumTres.addActionListener(manejadorEventos);
		btnNumCuatro.addActionListener(manejadorEventos);
		btnNumCinco.addActionListener(manejadorEventos);
		btnNumSeis.addActionListener(manejadorEventos);
		btnNumSiete.addActionListener(manejadorEventos);
		btnNumOcho.addActionListener(manejadorEventos);
		btnNumNueve.addActionListener(manejadorEventos);
		
		btnDividir.addActionListener(manejadorEventos);
		btnMultiplicar.addActionListener(manejadorEventos);
		btnSumar.addActionListener(manejadorEventos);
		btnRestar.addActionListener(manejadorEventos);
		
	}
	
	
	private void iniciarCalculadora() {
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(100, 100, 253, 364);				
		getContentPane().setLayout(null);
	
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(SystemColor.activeCaption);
		panelPrincipal.setBounds(10, 11, 219, 307);
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		btnLimpiar = new JButton("C");
		btnLimpiar.setFont(new Font("Arial", Font.BOLD, 11));
		btnLimpiar.setBounds(10, 54, 42, 42);
		panelPrincipal.add(btnLimpiar);
		
		btnDividir = new JButton("/");
		btnDividir.setFont(new Font("Arial", Font.BOLD, 20));
		btnDividir.setBounds(62, 54, 42, 42);
		panelPrincipal.add(btnDividir);
		
		btnMultiplicar = new JButton("*");
		btnMultiplicar.setFont(new Font("Arial", Font.BOLD, 20));
		btnMultiplicar.setBounds(114, 54, 42, 42);
		panelPrincipal.add(btnMultiplicar);
		
		btnRestar = new JButton("-");
		btnRestar.setFont(new Font("Arial", Font.BOLD, 20));
		btnRestar.setBounds(166, 54, 42, 42);
		panelPrincipal.add(btnRestar);
		
		btnSumar = new JButton("+");
		btnSumar.setFont(new Font("Arial", Font.BOLD, 14));
		btnSumar.setBounds(166, 103, 42, 91);
		panelPrincipal.add(btnSumar);
		
		btnNumNueve = new JButton("9");
		btnNumNueve.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumNueve.setBounds(114, 103, 42, 42);
		panelPrincipal.add(btnNumNueve);
	
		
		btnNumOcho = new JButton("8");
		btnNumOcho.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumOcho.setBounds(62, 103, 42, 42);
		panelPrincipal.add(btnNumOcho);
		
	
		
		btnNumSiete = new JButton("7");
		btnNumSiete.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumSiete.setBounds(10, 103, 42, 42);
		panelPrincipal.add(btnNumSiete);
		
		btnNumSeis = new JButton("6");
		btnNumSeis.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumSeis.setBounds(114, 152, 42, 42);
		panelPrincipal.add(btnNumSeis);
		
		btnNumCinco = new JButton("5");
		btnNumCinco.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumCinco.setBounds(62, 152, 42, 42);
		panelPrincipal.add(btnNumCinco);
	
		btnNumCuatro = new JButton("4");
		btnNumCuatro.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumCuatro.setBounds(10, 152, 42, 42);
		panelPrincipal.add(btnNumCuatro);
	
		btnNumTres = new JButton("3");
		btnNumTres.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumTres.setBounds(114, 200, 42, 42);
		panelPrincipal.add(btnNumTres);
	
		btnNumDos = new JButton("2");
		btnNumDos.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumDos.setBounds(62, 200, 42, 42);
		panelPrincipal.add(btnNumDos);
	
		btnNumUno = new JButton("1");
		btnNumUno.setFont(new Font("Arial", Font.BOLD, 14));
		btnNumUno.setBounds(10, 200, 42, 42);
		panelPrincipal.add(btnNumUno);
	
		btnCero = new JButton("0");
		btnCero.setFont(new Font("Arial", Font.BOLD, 14));
		btnCero.setBounds(10, 253, 94, 42);
		panelPrincipal.add(btnCero);
		
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Arial", Font.BOLD, 14));
		btnIgual.setBounds(166, 200, 42, 96);
		panelPrincipal.add(btnIgual);
		
		btnDecimal = new JButton(".");
		btnDecimal.setFont(new Font("Arial", Font.BOLD, 16));
		btnDecimal.setBounds(114, 254, 42, 42);
		panelPrincipal.add(btnDecimal);
		
		
		txtPantalla = new JTextField();
		txtPantalla.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setBounds(10, 11, 198, 32);
		panelPrincipal.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		

		
	
	 }
		
}
