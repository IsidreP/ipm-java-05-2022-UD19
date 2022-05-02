package act04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//------------------------------------------------------
		
		numero1 = new JTextField();
		numero1.setBounds(10, 25, 86, 20);
		contentPane.add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setBounds(10, 73, 86, 20);
		contentPane.add(numero2);
		numero2.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(10, 141, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		//----------------------------------------------------
		
		JButton BSuma = new JButton("Suma");
		BSuma.setBounds(106, 24, 68, 23);
		contentPane.add(BSuma);
		BSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double suma= Double.parseDouble(numero1.getText())+ Double.parseDouble(numero2.getText());
				resultado.setText(Double.toString(suma));
			}
		});
		
		JButton BResta = new JButton("Resta");
		BResta.setBounds(184, 24, 68, 23);
		contentPane.add(BResta);
		BResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double resta= Double.parseDouble(numero1.getText())- Double.parseDouble(numero2.getText());
				resultado.setText(Double.toString(resta));
			}
		});
		
		JButton BMult = new JButton("Mult");
		BMult.setBounds(261, 24, 68, 23);
		contentPane.add(BMult);
		BMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double mult= Double.parseDouble(numero1.getText())* Double.parseDouble(numero2.getText());
				resultado.setText(Double.toString(mult));
			}
		});
		
		JButton BDiv = new JButton("Div");
		BDiv.setBounds(339, 24, 68, 23);
		contentPane.add(BDiv);
		BDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double div= Double.parseDouble(numero1.getText())/ Double.parseDouble(numero2.getText());
				resultado.setText(Double.toString(div));
			}
		});
		
		JButton btnNewButton_2 = new JButton("Salir aplicacion");
		btnNewButton_2.setBounds(261, 227, 146, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Resultado");
		lblNewLabel.setBounds(10, 125, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero2");
		lblNewLabel_1.setBounds(10, 56, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero1");
		lblNewLabel_2.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
