package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcular extends JFrame{
	JPanel panel = new JPanel();
	float texto=0;
	
	public calcular () {
		
		
		//TITULO
		Font font1 = new Font("cursive",Font.BOLD,18);
		JLabel titulo = new JLabel("CALCULADORA");
		titulo.setBounds(80, 0, 150, 50);
		titulo.setFont(font1);
		titulo.setVisible(true);
		
		Font font2 = new Font("SansSerif", Font.BOLD, 25);
		JTextField tx = new JTextField("0");
		tx.setBounds(5, 50, 293, 40);
		tx.setFont(font2);
		tx.setEditable(false);
		tx.setVisible(true);
		
		//BUTTONS
		//1
		JButton c = new JButton("C");
		c.setBounds(5,100,65,48);
		c.setVisible(true);
		c.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ActionC();
			}
			
		});
		
		JButton ce = new JButton("CE");
		ce.setBounds(81, 100,65, 48);
		ce.setVisible(true);
		
		JButton sqrt = new JButton("Raiz");
		sqrt.setBounds(157, 100,65, 48);
		sqrt.setVisible(true);
		
		JButton ch = new JButton("+/-");
		ch.setBounds(233, 100, 65, 48);
		ch.setVisible(true);
		
		//2
		JButton b7 = new JButton("7");
		b7.setBounds(5, 158, 65, 48);
		b7.setVisible(true);
		b7.addActionListener(this);
		
		JButton b8 = new JButton("8");
		b8.setBounds(81, 158, 65, 48);
		b8.setVisible(true);
		b8.addActionListener(this);
		
		JButton b9 = new JButton("9");
		b9.setBounds(157, 158, 65, 48);
		b9.setVisible(true);
		b9.addActionListener(this);
		
		JButton div = new JButton("/");
		div.setBounds(233, 158, 65, 48);
		div.setVisible(true);
		
		//3
		JButton b4 = new JButton("4");
		b4.setBounds(5, 216, 65, 48);
		b4.setVisible(true);
		b4.addActionListener(this);
		
		JButton b5 = new JButton("5");
		b5.setBounds(81, 216, 65, 48);
		b5.setVisible(true);
		b5.addActionListener(this);
		
		JButton b6 = new JButton("6");
		b6.setBounds(157, 216, 65, 48);
		b6.setVisible(true);
		b6.addActionListener(this);
		
		JButton mul = new JButton("X");
		mul.setBounds(233, 216, 65, 48);
		mul.setVisible(true);
		
		//4
		JButton b1 = new JButton("1");
		b1.setBounds(5, 274, 65, 48);
		b1.setVisible(true);
		b1.addActionListener(this);
		
		JButton b2 = new JButton("2");
		b2.setBounds(81, 274, 65, 48);
		b2.setVisible(true);
		b2.addActionListener(this);
		
		JButton b3 = new JButton("3");
		b3.setBounds(157, 274, 65, 48);
		b3.setVisible(true);
		b3.addActionListener(this);
		
		JButton res = new JButton("-");
		res.setBounds(233, 274, 65, 48);
		res.setVisible(true);
		
		//5
		JButton poi = new JButton(".");
		poi.setBounds(5, 332, 65, 48);
		poi.setVisible(true);
		
		JButton cero = new JButton("0");
		cero.setBounds(81, 332, 65, 48);
		cero.setVisible(true);
		
		JButton igu = new JButton("=");
		igu.setBounds(157, 332, 65, 48);
		igu.setVisible(true);
		
		JButton sum = new JButton("+");
		sum.setBounds(233, 332, 65, 48);
		sum.setVisible(true);
				
		panel.add(c);
		panel.add(ce);
		panel.add(sqrt);
		panel.add(ch);
		panel.add(tx);
		
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(div);
		
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(mul);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(res);
		
		panel.add(poi);
		panel.add(cero);
		panel.add(igu);
		panel.add(sum);
		
		panel.add(titulo);
		panel.setVisible(true);
		panel.setBounds(15,15,304,385);
		panel.setBackground(Color.GRAY);
		panel.setLayout(null);
		this.setLayout(null);
		this.add(panel);
		this.setSize(350, 450);
		this.setVisible(true);
	}
	public void actionPerformed (ActionEvent e) {
		
	}
	public void ActionC() {
		// TODO Auto-generated method stub
		
	}
}
