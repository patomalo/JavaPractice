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

public class DisCif extends JFrame{
	String MAY[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String min[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	//String inM[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	//String inm[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	JPanel panel=new JPanel();
	//JTEXTSFIELDS
	JTextField inicial=new JTextField();
	JTextField fin=new JTextField();
	JTextField l1=new JTextField();
	JTextField s1=new JTextField();
	JTextField desen=new JTextField();
	public DisCif()
	{
		//PANEL
		panel.setVisible(true);
		panel.setBounds(50, 50, 400, 400);
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);
		
		//LABELS
		JLabel titulo=new JLabel("DISCO DE CIFRADO");
		titulo.setBounds(150, 25, 150, 25);
		titulo.setVisible(true);
		
		JLabel textoa=new JLabel("INGRESE EL TEXTO A ENCRIPTAR:");
		textoa.setBounds(10, 10, 200, 30);
		textoa.setVisible(true);
		
		JLabel textob=new JLabel("RESULTADO:");
		textob.setBounds(10, 90, 200, 30);
		textob.setVisible(true);
		
		JLabel l=new JLabel("L:");
		l.setBounds(170, 50, 20, 30);
		l.setVisible(true);
		
		JLabel s=new JLabel("S:");
		s.setBounds(240, 50, 20, 30);
		s.setVisible(true);
		
		JLabel textoc=new JLabel("DESENCRIPTAR:");
		textoc.setBounds(10, 180, 200, 30);
		textoc.setVisible(true);
		
		//JTEXTSFIELDS
		inicial.setBounds(10, 50, 150, 30);
		inicial.setVisible(true);
		
		
		fin.setBounds(10, 130, 150, 30);
		fin.setEditable(false);
		fin.setVisible(true);
		
		
		l1.setBounds(190,50,40,30);
		l1.setVisible(true);
		
		s1.setBounds(260,50,40,30);
		s1.setVisible(true);
		
		desen.setBounds(10, 230, 150, 30);
		desen.setEditable(false);
		desen.setVisible(true);
		
		//BUTTONS
		JButton enc=new JButton("Encriptar");
		enc.setBounds(10, 280, 100, 30);
		enc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				encriptar();
			}
		});
		
		JButton desenc=new JButton("Desencriptar");
		desenc.setBounds(120, 280, 120, 30);
		desenc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				desencriptar();
			}
		});
		
		JButton atras=new JButton("Atras");
		atras.setBounds(250, 280, 100, 30);
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
		panel.add(l);
		panel.add(l1);
		panel.add(s);
		panel.add(s1);
		panel.add(textob);
		panel.add(fin);
		panel.add(textoc);
		panel.add(desen);
		panel.add(enc);
		panel.add(desenc);
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
	public void encriptar()
	{
		int ascii;char c;
		String valori=inicial.getText();
		String aux="";
		String valorf="";
		String large=l1.getText();
		String small=s1.getText();
		int lM,sM,lm,sm,vali,valf;
		System.out.println("valor "+valori+" L: "+large+" S: "+small);
		//CONVERTIR ASCII LOS VALORES L S
		c=large.charAt(0);ascii=(int)c;
		if(ascii<=90)
		{
			c=large.charAt(0);
			lM=(int)c;
			c=small.charAt(0);
			sM=(int)c;
			lm=lM+32;
			sm=sM+32;
		}
		else
		{
			c=large.charAt(0);
			lm=(int)c;
			c=small.charAt(0);
			sm=(int)c;
			lM=lm-32;
			sM=sm-32;
		}
		System.out.println((char)lM+" "+(char)sM+" "+(char)lm+" "+(char)sm);
		//convertir
		for(int i=0;i<valori.length();i++)
		{
			aux=Character.toString(valori.charAt(i));
			c = aux.charAt(0);
			ascii=(int)c;System.out.print(ascii+" ");
			if(ascii<=90 && ascii>=65)
			{
				vali=lM-ascii;
				valf=sM+vali;
				if(valf>90) valf=(valf-91)+65;
				if(valf<65) valf=90-(64-valf);
				valorf+=(char)valf;
			}
			else
			{
				if(ascii<=122 && ascii>=97)
				{
					vali=lm-ascii;
					valf=sm+vali;
					if(valf>122) valf=(valf-123)+97;
					if(valf<97) valf=122-(96-valf);
					valorf+=(char)valf;
				}
				else
				{
					vali=lM-sM;
					valf=ascii-vali;
					if(valf<32)
					{
						valf=65-(32-valf);
					}
					if(valf>64)
					{
						valf=(valf-65)+32;
					}
					valorf+=(char)valf;
				}
			}
		}
		fin.setText(valorf);
	}
	public void desencriptar()
	{
		int ascii;char c;
		String valori=fin.getText();
		String aux="";
		String valorf="";
		String large=l1.getText();
		String small=s1.getText();
		int lM,sM,lm,sm,vali,valf;
		System.out.println("valor "+valori+" L: "+large+" S: "+small);
		//CONVERTIR ASCII LOS VALORES L S
		c=large.charAt(0);ascii=(int)c;
		if(ascii<=90)
		{
			c=large.charAt(0);
			lM=(int)c;
			c=small.charAt(0);
			sM=(int)c;
			lm=lM+32;
			sm=sM+32;
		}
		else
		{
			c=large.charAt(0);
			lm=(int)c;
			c=small.charAt(0);
			sm=(int)c;
			lM=lm-32;
			sM=sm-32;
		}
		System.out.println((char)lM+" "+(char)sM+" "+(char)lm+" "+(char)sm);
		//convertir
		for(int i=0;i<valori.length();i++)
		{
			aux=Character.toString(valori.charAt(i));
			c = aux.charAt(0);
			ascii=(int)c;
			if(ascii<=90 && ascii>=65)
			{
				vali=lM-ascii;
				valf=sM+vali;
				if(valf>90) valf=(valf-91)+65;
				if(valf<65) valf=90-(64-valf);
				valorf+=(char)valf;
			}
			else
			{
				if(ascii<=122 && ascii>=97)
				{
					vali=lm-ascii;
					valf=sm+vali;
					if(valf>122) valf=(valf-123)+97;
					if(valf<97) valf=122-(96-valf);
					valorf+=(char)valf;
				}
				else
				{
					vali=lM-sM;
					valf=ascii+vali;
					if(valf<32)
					{
						valf=65-(32-valf);
					}
					if(valf>64)
					{
						valf=(valf-65)+32;
					}
					valorf+=(char)valf;
				}
			}
		}
		desen.setText(valorf);
	}
	
	
}
