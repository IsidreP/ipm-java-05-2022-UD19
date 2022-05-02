package act03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Encuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuesta frame = new Encuesta();
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
	public Encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setBounds(31, 22, 190, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows", true);
		rdbtnNewRadioButton.setBounds(31, 63, 109, 23);
		rdbtnNewRadioButton.setActionCommand("Windows");
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux", false);
		rdbtnNewRadioButton_1.setBounds(31, 89, 109, 23);
		rdbtnNewRadioButton_1.setActionCommand("Linux");
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac", false);
		rdbtnNewRadioButton_2.setBounds(31, 115, 109, 23);
		rdbtnNewRadioButton_2.setActionCommand("Mac");
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);
		
		//--------------------------------------------------------------
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(253, 22, 171, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox cbprogramacion = new JCheckBox("Programacion");
		cbprogramacion.setBounds(253, 63, 171, 23);
		contentPane.add(cbprogramacion);
		
		JCheckBox cbdisenografico = new JCheckBox("Dise\u00F1o grafico");
		cbdisenografico.setBounds(253, 89, 171, 23);
		contentPane.add(cbdisenografico);
		
		JCheckBox cbadmin = new JCheckBox("Administracion");
		cbadmin.setBounds(253, 115, 171, 23);
		contentPane.add(cbadmin);
		
		//--------------------------------------------------------------
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setMaximum(10);
		slider.setBounds(42, 183, 200, 50);
		contentPane.add(slider);
		
		//--------------------------------------------------------------
		
		JButton btnNewButton = new JButton("Sacar datos");
		btnNewButton.setBounds(312, 186, 112, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valorCB="";
				if(cbprogramacion.isSelected()) {
					valorCB+=cbprogramacion.getText();
				}
				
				if(cbdisenografico.isSelected()) {
					valorCB+=" "+cbdisenografico.getText();
				}
				
				if(cbadmin.isSelected()) {
					valorCB+=" "+cbadmin.getText();
				}
								
				JOptionPane.showMessageDialog(null, "Resultado encuesta: \n"+bgroup.getSelection().getActionCommand()+"\n"+valorCB+"\n"+slider.getValue());
			}
		});
		
		
		
		
	}
}
