package encrypt;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class VigenereEnc extends JFrame{
	
	
	//CREANDO VECTORES CON LAS LETRAS.
	
	Vector<String> letras=new Vector<String>(62);
	
	//PANEL
	JPanel panel=new JPanel();
	//JTEXTFIELDS
	JTextField inicial=new JTextField();
	JTextField fin=new JTextField();
	JTextField clave=new JTextField();
	JTextField desen=new JTextField();
	public VigenereEnc() {
		// TODO Auto-generated constructor stub
		//PANEL
		
		panel.setVisible(true);
		panel.setBounds(50, 50, 400, 400);
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);
		
		//LABELS
		
		JLabel titulo=new JLabel("CIFRADO VIGENERE");
		titulo.setBounds(200, 25, 120, 25);
		titulo.setVisible(true);
		
		JLabel textoa=new JLabel("INGRESE EL TEXTO A ENCRIPTAR:");
		textoa.setBounds(10, 10, 200, 30);
		textoa.setVisible(true);
		
		JLabel textob=new JLabel("RESULTADO:");
		textob.setBounds(10, 120, 200, 30);
		textob.setVisible(true);
		
		JLabel n=new JLabel("CLAVE:");
		n.setBounds(10, 90, 50, 30);
		n.setVisible(true);
		
		JLabel textoc=new JLabel("DESENCRIPTAR:");
		textoc.setBounds(10,190,200,30);
		textoc.setVisible(true);
		
		//JTEXTSFIELDS
		
		
		inicial.setBounds(10, 50, 160, 30);
		inicial.setVisible(true);
		
		
		fin.setBounds(10, 150, 150, 30);
		fin.setEditable(false);
		fin.setVisible(true);
		
		desen.setBounds(10, 230, 150, 30);
		desen.setEditable(false);
		desen.setVisible(true);
		
		
		
		clave.setBounds(70,90,100,30);
		clave.setVisible(true);
		
		//BUTTONS
		
		JButton enc=new JButton("Encriptar");
		enc.setBounds(10, 270, 100, 30);
		enc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				encriptar();
			}
		});
		
		JButton des=new JButton("Desencriptar");
		des.setBounds(120, 270, 120, 30);
		des.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				desencriptar();
			}
		});
		
		JButton atras=new JButton("Atras");
		atras.setBounds(250, 270, 100, 30);
		atras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				InterfazP p=new InterfazP();
				cerrar();
			}
		});
		
		//ADDS
		panel.add(textoa);
		panel.add(inicial);
		panel.add(n);
		panel.add(clave);
		panel.add(textob);
		panel.add(fin);
		panel.add(textoc);
		panel.add(desen);
		panel.add(enc);
		panel.add(des);
		panel.add(atras);
		this.setLayout(null);
		this.setVisible(true);
		this.add(panel);
		this.add(titulo);
		this.setSize(500, 500);
	}
	public void cerrar(){
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.dispose();
	}
	public void encriptar(){
		String inicio=inicial.getText();
		String cl=clave.getText();
		String result="";
		
		//LLENANDO EL VECTOR
		for(int i=48;i<=57;i++)
		{
				letras.add(Character.toString((char)(i)));
		}
		for (int i = 65; i <= 90; i++) {
				letras.add(Character.toString((char)(i)));
		}
		for (int i = 97; i <=122; i++) {
				letras.add(Character.toString((char)(i)));
		}
	
		System.out.println(result);
		for (int i = 0,e=0; i < inicio.length(); i++,e++) {
			System.out.println(result);
			if(e==cl.length()){
				e=0;
			}
			int valor1=0;
			int valor2=0;
			int indice=0;
			inicio.charAt(i);
			valor1=letras.indexOf(Character.toString(inicio.charAt(i)));
			valor2=letras.indexOf(Character.toString(cl.charAt(e)));
			indice=(valor1+valor2)%62;
			result+=letras.elementAt(indice);
		}
		fin.setText(result);
		
		
	}
	public void desencriptar(){
		String inicio=fin.getText();
		String cl=clave.getText();
		String result="";
		
		//LLENANDO EL VECTOR
		for(int i=48;i<=57;i++)
		{
				letras.add(Character.toString((char)(i)));
		}
		for (int i = 65; i <= 90; i++) {
				letras.add(Character.toString((char)(i)));
		}
		for (int i = 97; i <=122; i++) {
				letras.add(Character.toString((char)(i)));
		}
	
		System.out.println(result);
		for (int i = 0,e=0; i < inicio.length(); i++,e++) {
			System.out.println(result);
			if(e==cl.length()){
				e=0;
			}
			int valor1=0;
			int valor2=0;
			int indice=0;
			inicio.charAt(i);
			valor1=letras.indexOf(Character.toString(inicio.charAt(i)));
			valor2=letras.indexOf(Character.toString(cl.charAt(e)));
			indice=(62+valor1-valor2)%62;
			result+=letras.elementAt(indice);
		}
		desen.setText(result);
		
		
	}

}
