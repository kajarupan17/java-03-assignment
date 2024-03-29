import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q1_SwingCal 
{
	public static void main(String args[]) {
		JFrame jf = new JFrame();
		
		JLabel jl = new JLabel("SIMPLE CALCULATOR");
		jl.setBounds(125,50,250,30);
		Font f = new Font("Serif",Font.BOLD,20);
		jl.setFont(f);
		jf.add(jl);
		
		 JLabel lb2 = new JLabel("First Number:");
		 lb2.setBounds(20,100,100,30);
		 jf.add(lb2);
		 
		 JTextField tf1 = new JTextField();
		 tf1.setBounds(130,100,100,30);
		 jf.add(tf1);
		 
		 JLabel lb3 = new JLabel("Second Number:");
		 lb3.setBounds(250,100,100,30);
		 jf.add(lb3);
		 
		 JTextField tf2 = new JTextField();
		 tf2.setBounds(360,100,100,30);
		 jf.add(tf2);
		 
		 JButton b1 = new JButton("ADD");
		 b1.setBounds(10,150,110,30);
		 jf.add(b1);
		 
		 JButton b2 = new JButton("SUBSTRACT");
		 b2.setBounds(130,150,110,30);
		 jf.add(b2);
		 
		 JButton b3 = new JButton("MULTIPLY");
		 b3.setBounds(250,150,110,30);
		 jf.add(b3);
		 
		 JButton b4 = new JButton("DIVIDE");
		 b4.setBounds(370,150,110,30);
		 jf.add(b4);
		 
		 JLabel lb4 = new JLabel("Answer is");
		 lb4.setBounds(200,200,100,30);
		 jf.add(lb4);
		
		
		jf.setSize(500,300);
		jf.setLayout(null);
		jf.setVisible(true);
		
		 b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					int num3=Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());
					lb4.setText(Integer.toString(num3));		
				}
				 
			 });
			 
			 b2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					int num3=Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText());
					lb4.setText(Integer.toString(num3));		
				}
				 
			 });
			 
			 b3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					int num3=Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText());
					lb4.setText(Integer.toString(num3));		
				}
				 
			 });
			 
			 b4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					int num3=Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText());
					lb4.setText(Integer.toString(num3));			
				}
				 
			 });
		
	}

}
