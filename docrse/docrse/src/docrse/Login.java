package docrse;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Login extends JPanel implements ActionListener {

	/**
	 * Create the panel.
	 */
	JFrame f = new JFrame();
	JButton b1,b2,b3;
	public Login() {
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel Co = new JPanel();
		Co.setLayout(null);
		f.setSize(900,900);
		 b1 = new JButton("LOGIN ");
		 b2 = new JButton("REGISTER");
		 b3 = new JButton("CLOSE");
		b1.setFont(new Font("Arial",Font.BOLD,60));
		b2.setFont(new Font("Arial",Font.BOLD,60));
		b3.setFont(new Font("Arial",Font.BOLD,60));
		Co.setBackground(Color.CYAN);
		b1.setBackground(Color.YELLOW);
		b1.setBounds(600,200,600,200);
		b2.setBackground(Color.PINK);
		b2.setBounds(600,400,600,200);
		b3.setBounds(700,700,400,100);
		b3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		Co.add(b1);
		Co.add(b2);
		Co.add(b3);
		f.add(Co);
		
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			
		   new Login1();
		   f.dispose();
		}
		else if(e.getSource()==b2)
		{
			
		   new Register();
		   f.dispose();
		}
		else 
		{
			f.dispose();
		}
	}
   
}
