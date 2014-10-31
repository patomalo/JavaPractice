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

public class CesarEnc extends JFrame{
		
		
		
	Vector<String> letras=new Vector<String>(62);
		JPanel panel=new JPanel();
		//JTEXTSFIELDS
		JTextField inicial=new JTextField();
		JTextField fin=new JTextField();
		JTextField n1=new JTextField();
		JTextField desen=new JTextField();
		public CesarEnc() {
			// TODO Auto-generated constructor stub
			//PANEL
			
			panel.setVisible(true);
			panel.setBounds(50, 50, 400, 400);
			panel.setBackground(Color.lightGray);
			panel.setLayout(null);
			
			
			//LABELS
			JLabel titulo=new JLabel("CIFRADO CESAR");
			titulo.setBounds(150, 25, 100, 25);
			titulo.setVisible(true);
			
			JLabel textoa=new JLabel("INGRESE EL TEXTO A ENCRIPTAR:");
			textoa.setBounds(10, 10, 200, 30);
			textoa.setVisible(true);
			
			JLabel textob=new JLabel("RESULTADO:");
			textob.setBounds(10, 90, 200, 30);
			textob.setVisible(true);
			
			JLabel n=new JLabel("n:");
			n.setBounds(170, 50, 20, 30);
			n.setVisible(true);
			
			JLabel textoc=new JLabel("DESENCRIPTAR:");
			textoc.setBounds(10, 180, 200, 30);
			textoc.setVisible(true);
			
			
			//JTEXTSFIELDS
			
			
			inicial.setBounds(10, 50, 150, 30);
			inicial.setVisible(true);
			
			
			fin.setBounds(10, 130, 150, 30);
			fin.setEditable(false);
			fin.setVisible(true);
			
			
			n1.setBounds(190,50,20,30);
			n1.setVisible(true);
			
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
			panel.add(n);
			panel.add(n1);
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
		public void encriptar(){
			
			String valori=inicial.getText();
			String valorf="";
			int n2=Integer.parseInt(n1.getText());
			
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
			
			for (int i = 0; i < valori.length(); i++) {
				int aux=letras.indexOf(Character.toString(valori.charAt(i)));
				aux=aux+n2;
				if(aux>61){
					aux-=61+1;
					System.out.println("aux: "+aux);
					valorf+=letras.elementAt(aux);
				}
				else{
					valorf+=letras.elementAt(aux);
				}
			}
			fin.setText(valorf);
			
			
		}
		public void desencriptar(){
			
			String valori=fin.getText();
			String valorf="";
			int n2=Integer.parseInt(n1.getText());
			
			//LLENANDO EL VECTOR
			/*for(int i=48;i<=57;i++)
			{
					letras.add(Character.toString((char)(i)));
			}
			for (int i = 65; i <= 90; i++) {
					letras.add(Character.toString((char)(i)));
			}
			for (int i = 97; i <=122; i++) {
					letras.add(Character.toString((char)(i)));
			}*/
			
			for (int i = 0; i < valori.length(); i++) {
				int aux=letras.indexOf(Character.toString(valori.charAt(i)));
				aux=aux-n2;
				if(aux<0){
					aux+=61+1;
					System.out.println("aux: "+aux);
					valorf+=letras.elementAt(aux);
				}
				else{
					valorf+=letras.elementAt(aux);
				}
			}
			desen.setText(valorf);
		}
		
}
