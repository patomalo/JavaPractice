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
	JTextField tx = new JTextField("0");
	float texto=0;
	double va1=0;
	double va2=0;
	String op = null;
	boolean pt = false;
	
	public calcular () {
		
		
		//TITULO
		Font font1 = new Font("cursive",Font.BOLD,18);
		JLabel titulo = new JLabel("CALCULADORA");
		titulo.setBounds(80, 0, 150, 50);
		titulo.setFont(font1);
		titulo.setVisible(true);
		
		Font font2 = new Font("SansSerif", Font.BOLD, 25);
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
				tx.setText("0");
				va1 = 0;
				va2 = 0;
				op = null;
			}
			
		});
		
		JButton ce = new JButton("CE");
		ce.setBounds(81, 100,65, 48);
		ce.setVisible(true);
		ce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tx.setText("0");
			}
		});
		
		JButton sqrt = new JButton("Raiz");
		sqrt.setBounds(157, 100,65, 48);
		sqrt.setVisible(true);
		sqrt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double val = Double.parseDouble(tx.getText());
				val = Math.sqrt(val);
				System.out.println(val);
				tx.setText("" + val);
			}
		});
		
		JButton ch = new JButton("+/-");
		ch.setBounds(233, 100, 65, 48);
		ch.setVisible(true);
		ch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r = Double.parseDouble(tx.getText());
				r*=(-1);
				tx.setText("" + r);
			}
		});
		
		//2
		JButton b7 = new JButton("7");
		b7.setBounds(5, 158, 65, 48);
		b7.setVisible(true);
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText("7");
				else tx.setText(tx.getText() + "7");
			}
			
		});
		
		JButton b8 = new JButton("8");
		b8.setBounds(81, 158, 65, 48);
		b8.setVisible(true);
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText("8");
				else tx.setText(tx.getText() + "8");
			}
		});
		
		JButton b9 = new JButton("9");
		b9.setBounds(157, 158, 65, 48);
		b9.setVisible(true);
		b9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText(tx.getText());
				else tx.setText(tx.getText() + "9");
			}
		});
		
		JButton div = new JButton("/");
		div.setBounds(233, 158, 65, 48);
		div.setVisible(true);
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				op = "div";
				va1 = Double.parseDouble(tx.getText());
				tx.setText("0");
			}
		});
		
		//3
		JButton b4 = new JButton("4");
		b4.setBounds(5, 216, 65, 48);
		b4.setVisible(true);
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText("4");
				else tx.setText(tx.getText() + "4");
			}
		});
		
		JButton b5 = new JButton("5");
		b5.setBounds(81, 216, 65, 48);
		b5.setVisible(true);
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText("5");
				else tx.setText(tx.getText() + "5");
			}
		});
		
		JButton b6 = new JButton("6");
		b6.setBounds(157, 216, 65, 48);
		b6.setVisible(true);
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText("6");
				else tx.setText(tx.getText() + "6");
			}
		});
		
		JButton mul = new JButton("X");
		mul.setBounds(233, 216, 65, 48);
		mul.setVisible(true);
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				op = "mul";
				va1 = Double.parseDouble(tx.getText());
				tx.setText("0");
			}
		});
		
		//4
		JButton b1 = new JButton("1");
		b1.setBounds(5, 274, 65, 48);
		b1.setVisible(true);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText("1");
				else tx.setText(tx.getText() + "1");
			}
		});
		
		JButton b2 = new JButton("2");
		b2.setBounds(81, 274, 65, 48);
		b2.setVisible(true);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText("2");
				else tx.setText(tx.getText() + "2");
			}
		});
		
		JButton b3 = new JButton("3");
		b3.setBounds(157, 274, 65, 48);
		b3.setVisible(true);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r == 0) tx.setText("3");
				else tx.setText(tx.getText() + "3");
			}
		});
		
		JButton res = new JButton("-");
		res.setBounds(233, 274, 65, 48);
		res.setVisible(true);
		res.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				op = "res";
				va1 = Double.parseDouble(tx.getText());
				tx.setText("0");
			}
		});
		
		//5
		JButton poi = new JButton(".");
		poi.setBounds(5, 332, 65, 48);
		poi.setVisible(true);
		poi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText() + ".");
			}
		});
		
		JButton cero = new JButton("0");
		cero.setBounds(81, 332, 65, 48);
		cero.setVisible(true);
		cero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double r;
				r = Double.parseDouble(tx.getText());
				if(r != 0) tx.setText(tx.getText() + "0");
			}
		});
		
		JButton igu = new JButton("=");
		igu.setBounds(157, 332, 65, 48);
		igu.setVisible(true);
		igu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				va2 = Double.parseDouble(tx.getText());
				double sol = resultado(op,va1,va2);
				tx.setText("" + sol);
			}		
		});
		
		JButton sum = new JButton("+");
		sum.setBounds(233, 332, 65, 48);
		sum.setVisible(true);
		sum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				op = "sum";
				va1 = Double.parseDouble(tx.getText());
				tx.setText("0");
			}
		});
				
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
	public double resultado(String op,double va1,double va2) {
		// TODO Auto-generated method stub
		System.out.println(va1 + " " +va2);
		if(op == "div") {
			System.out.println("Dividiendo");
			return va1/va2;
		}
		if(op == "mul") {
			System.out.println("Multiplicando");
			return va1*va2;
		}
		if(op == "res") {
			System.out.println("Restando");
			return va1-va2;
		}
		if(op == "sum") {
			System.out.println("Sumando");
			return va1+va2;
		}
		return 0;
	}
}
