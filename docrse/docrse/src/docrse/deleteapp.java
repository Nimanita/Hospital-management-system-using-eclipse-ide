package docrse;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class deleteapp extends JPanel {

	/**
	 * Create the panel.
	 */
	JButton b1,b2;
	JFrame f;
	JLabel pass,user,info;
	public deleteapp() {

		JTextField  use,pas,cpas;
		
		f = new JFrame();
		JPanel Co = new JPanel();
		Co.setLayout(null);
		f.setSize(1900,1900);
		Co.setBackground(Color.CYAN);
		
		b1=new JButton("BACK");
		b1.setBounds(50,900,100,50);
		b1.setFont(new Font("BinnerD",Font.BOLD,20));
		b1.setBackground(Color.YELLOW);
		//b1.setBack
		b2=new JButton("SUBMIT");
		b2.setBounds(800,40,200,50);
		b2.setFont(new Font("BinnerD",Font.BOLD,20));
		b2.setBackground(Color.YELLOW);
		user=new JLabel("APPOINTMENT NO");
		user.setFont(new Font("BinnerD",Font.BOLD,40));
		user.setBounds(200,150,500,200);
		 use=new JTextField();
		 use.setFont(new Font("BinnerD",Font.BOLD,40));
		use.setBounds(700,230,300,50);
		
		
		Co.add(user);
	
		Co.add(use);
	
	
		Co.add(b1);
		Co.add(b2);
		f.add(Co);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new deleteapp();
	}
}
