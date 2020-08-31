package docrse;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register2 extends JPanel implements ActionListener {

	/**
	 * Create the panel.
	 */
	JButton b1,b2;
	JFrame f;
	JLabel pass,user,cpass;
	
	JTextField use,pas,cpas;
	public Register2() {

		//JTextField  use,pas,cpas;
		
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
		b2=new JButton("SAVE");
		b2.setBounds(800,40,100,50);
		b2.setFont(new Font("BinnerD",Font.BOLD,20));
		b2.setBackground(Color.YELLOW);
		user=new JLabel("USERNAME");
		user.setFont(new Font("BinnerD",Font.BOLD,40));
		user.setBounds(300,150,300,200);
		 use=new JTextField();
		 use.setFont(new Font("BinnerD",Font.BOLD,40));
		use.setBounds(700,230,700,50);
		pass=new JLabel("PASSWORD");
		pass.setFont(new Font("BinnerD",Font.BOLD,40));
		pass.setBounds(300,300,300,200);
		pas = new JTextField();
		pas.setBounds(700,370,700,50);
		pas.setFont(new Font("BinnerD",Font.BOLD,40));
		cpass=new JLabel("CONFIRM PASSWORD");
		cpass.setFont(new Font("BinnerD",Font.BOLD,40));
		cpass.setBounds(100,450,500,200);
		 cpas=new JTextField();
		cpas.setFont(new Font("BinnerD",Font.BOLD,40));
		cpas.setBounds(700,530,700,50);
		Co.add(user);
		Co.add(pass);
		Co.add(cpass);
		Co.add(use);
		Co.add(pas);
		Co.add(cpas);
		Co.add(b1);
		Co.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(Co);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
		if(e.getSource()==b2)
		{
			String s1,s2,s3;
			s1=use.getText();
			s2=pas.getText();
			s3=cpas.getText();
			System.out.println(s2);
			System.out.println(s3);
			if(s2.compareTo(s3)!=0)
			{
				
				passnotcpass dialog = new passnotcpass();
				//dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
				new Register();
			} 
			else 
			{	
				
		
            FirstCon dialog = new FirstCon();
			
			//dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
			Connection conn = null;
			  try {
		            // connect way #1
		            String url1 = "jdbc:mysql://localhost:3306/Patient";
		            String user = "root";
		            String password = "Vrindavan@25";
		            
		            try{
		                Class.forName("com.mysql.cj.jdbc.Driver");
		                conn = DriverManager.getConnection(url1, user, password);
		                if (conn != null) {
		                    System.out.println("Connected to the database test1"+"hurray");
		                }
		              }catch(ClassNotFoundException ex)
		              {
		                    System.out.println(ex);
		              }
		           
		          
		            
		        } catch (SQLException ex) {
		            System.out.println("An error occurred. Maybe user/password is invalid");
		            ex.printStackTrace();
		        }
		       try {
				      PreparedStatement stmt = null;
				      
				       System.out.println(s2);
				      // int a= Integer.parseInt(s2);
				       
				       System.out.println("hello");
				       //System.out.println(a);
			           String Qry = "INSERT INTO Patient(Username,Password) VALUES(?,?);";
			           stmt=conn.prepareStatement(Qry);
			           stmt.setString(1,s1);
			        
			           stmt.setString(2, s2);
			           
			         stmt.executeUpdate();
			           		
		       }catch( SQLException ex)	
		       {
		    	   System.out.println("SQLEXCEPTION "+ ex.getMessage());
		       }
			}
		 }
			


		
		else if(e.getSource()==b1)
		{
           new Login();
          f.dispose();

	   }
		
	}
}
