package docrse;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
public class Login1 extends JPanel implements ActionListener{

	/**
	 * Create the panel.
	 */
	JButton b1,b2;
	JFrame f;
	JLabel pass,user,info;
	public Login1() {

		JTextField  use,pas,cpas;
		
		f = new JFrame();
		JPanel Co = new JPanel();
		Co.setLayout(null);
		f.setSize(1900,1900);
		Co.setBackground(Color.CYAN);
		info = new JLabel("Please enter username and password");
		info.setFont(new Font("Helvetica",Font.ITALIC,40));
		info.setBounds(500,100,700,100);
		b1=new JButton("BACK");
		b1.setBounds(50,900,100,50);
		b1.setFont(new Font("BinnerD",Font.BOLD,20));
		b1.setBackground(Color.YELLOW);
		//b1.setBack
		b2=new JButton("SUBMIT");
		b2.setBounds(800,40,200,50);
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
		b1.addActionListener(this);
		b2.addActionListener(this);
		Co.add(user);
		Co.add(pass);
		Co.add(info);
		Co.add(use);
		Co.add(pas);
	
		Co.add(b1);
		Co.add(b2);
		f.add(Co);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			
		   new Login();
		   f.dispose();
		}
		else if(e.getSource()==b2)
		{
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
				      
				      
				      // int a= Integer.parseInt(s2);
				       
				       System.out.println("hello");
				       //System.out.println(a);
			           String Qry = "INSERT INTO Patient(Username,Password) VALUES(?,?);";
			           stmt=conn.prepareStatement(Qry);
			           
			           
			         stmt.executeUpdate();
			           		
		       }catch( SQLException ex)	
		       {
		    	   System.out.println("SQLEXCEPTION "+ ex.getMessage());
		       }
			}
		 
			

		   new AfterLogin();
		   f.dispose();
		}
		
	}

