package docrse;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AfterLogin extends JPanel {

	/**
	 * Create the panel.
	 */
	public AfterLogin() {

		JFrame f = new JFrame();
		JPanel Co = new JPanel();
		Co.setLayout(null);
		f.setSize(900,900);
		JButton b1 = new JButton("PROFILE");
		JButton b2 = new JButton("BOOK APPOINTMENT");
		JButton b3 = new JButton("CANCEL APPOINTMENT");
		JButton b4 = new JButton("SHOW APPOINTMENT");
		
		JButton b5=new JButton("BACK");
		b5.setBounds(50,900,100,50);
		b5.setFont(new Font("BinnerD",Font.BOLD,20));
		b5.setBackground(Color.YELLOW);
		b1.setFont(new Font("Arial",Font.BOLD,40));
		b2.setFont(new Font("Arial",Font.BOLD,40));
		b3.setFont(new Font("Arial",Font.BOLD,40));
		b4.setFont(new Font("Arial",Font.BOLD,40));
		Co.setBackground(Color.CYAN);
		b1.setBackground(Color.YELLOW);
		b1.setBounds(600,100,600,200);
		b2.setBackground(Color.PINK);
		b2.setBounds(600,300,600,200);
		b3.setBackground(Color.YELLOW);
		b3.setBounds(600,500,600,200);
		b4.setBackground(Color.PINK);
		b4.setBounds(600,700,600,200);
		Co.add(b1);
		Co.add(b2);
		Co.add(b3);
		Co.add(b4);
		Co.add(b5);
		f.add(Co);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
    public static void  main(String args[])
    {
    	new AfterLogin();
    }
}
