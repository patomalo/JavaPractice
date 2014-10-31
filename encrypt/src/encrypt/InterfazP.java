package encrypt;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class InterfazP extends JFrame{
	
	JPanel panel=new JPanel();
	public InterfazP() {
		// TODO Auto-generated constructor stub
		//TITULO
		JLabel titulo=new JLabel("METODOS DE ENCRIPTACIÓN");
		titulo.setBounds(70,10, 300, 50);
		titulo.setVisible(true);
		//RADIO BUTTONS 
		final JRadioButton cesar= new JRadioButton("CIFRADO CESAR");
		cesar.setBounds(25,70,150,50);
		
		final JRadioButton vigenere= new JRadioButton("CIFRADO VIGENERE");
		vigenere.setBounds(25,120,150,50);
		
		final JRadioButton dici= new JRadioButton("DISCO DE CIFRADO");
		dici.setBounds(25,170,150,50);
		
		final JRadioButton jefferson= new JRadioButton("DISCO DE JEFFERSON");
		jefferson.setBounds(25,220,150,50);
		
		//BUTTON
		
		JButton entrar=new JButton("entrar");
		entrar.setVisible(true);
		entrar.setBounds(25, 280, 100, 30);
		entrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cesar.isSelected()==true){
					CesarEnc nuevo=new CesarEnc();
					nuevo.setVisible(true);
					cerrar();
					
				}
				else if(vigenere.isSelected()==true){
					VigenereEnc nuevo=new VigenereEnc();
					nuevo.setVisible(true);
					cerrar();
				}
				else if(dici.isSelected()==true){
					DisCif nuevo=new DisCif();
					nuevo.setVisible(true);
					cerrar();
				}
				
			}
		});		
		JButton salir=new JButton("salir");
		salir.setVisible(true);
		salir.setBounds(135, 280, 100, 30);
		salir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cerrar();
				
			}
		});		
		
		//BUTTON GROUP
		
		ButtonGroup radios=new ButtonGroup();
		radios.add(cesar);
		radios.add(vigenere);
		radios.add(dici);
		radios.add(jefferson);
		
		//ADDS
		panel.add(titulo);
		panel.add(cesar);
		panel.add(vigenere);
		panel.add(dici);
		panel.add(jefferson);
		panel.add(entrar);
		panel.add(salir);
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBounds(50, 50, 300, 400);
		panel.setBackground(Color.white);
		this.setLayout(null);
		this.setSize(400, 500);
		this.add(panel);
		this.setVisible(true);
	}
	public void cerrar(){
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.dispose();
	}
	
}
