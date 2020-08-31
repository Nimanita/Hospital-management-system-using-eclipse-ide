package docrse;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Register extends JPanel implements ActionListener  {

	/**
	 * Create the panel.
	 */
	JCheckBox c1,c2,c3;
	String s1 ;
	String s2 ;
	String s3;
	String s4;
	JFrame f;
	JButton b1,b2;
	JTextField  nam,pho,ag,ci;
	JTextField pa;
	public Register()  {
                     
		
		  
			                     
	
		                    
      
		 f = new JFrame();
		JPanel Co = new JPanel();
		Co.setLayout(null);
		f.setSize(1900,1900);
		JLabel info, name,age,gen,city,pastm;
		
		
	   
            

//Co.add(l1);
				//JTextArea pa=new JTextArea();
		 c1=new JCheckBox("Male");
		 c2=new JCheckBox("Female");
	     c3=new JCheckBox("Other");
		Co.setBackground(Color.CYAN);
		
		b1=new JButton("BACK");
		b1.setBounds(50,900,100,50);
		b1.setFont(new Font("BinnerD",Font.BOLD,20));
		b1.setBackground(Color.YELLOW);
		//b1.setBack
		b2=new JButton("NEXT");
		b2.setBounds(800,40,100,50);
		b2.setFont(new Font("BinnerD",Font.BOLD,20));
		b2.setBackground(Color.YELLOW);
		info = new JLabel("Please fill the details");
		info.setFont(new Font("Helvetica",Font.ITALIC,40));
		info.setBounds(700,100,500,100);
		name=new JLabel("NAME");
		name.setFont(new Font("BinnerD",Font.BOLD,40));
		name.setBounds(300,150,150,200);
		gen=new JLabel("GENDER");
		gen.setFont(new Font("BinnerD",Font.BOLD,40));
		gen.setBounds(230,450,190,200);
		age=new JLabel("AGE");
		age.setFont(new Font("BinnerD",Font.BOLD,40));
		age.setBounds(300,300,150,200);
		ag = new JTextField();
		ag.setBounds(500,370,700,50);
		gen=new JLabel("GENDER");
		gen.setFont(new Font("BinnerD",Font.BOLD,40));
		gen.setBounds(230,450,190,200);
		c1.setBounds(500,450,190,150);
		c1.setFont(new Font("BinnerD",Font.ITALIC,40));
		c1.setBackground(Color.CYAN);
		c2.setBounds(500,530,190,170);
		c2.setFont(new Font("BinnerD",Font.ITALIC,40));
		c2.setBackground(Color.CYAN);
		c3.setBounds(500,620,190,190);
		c3.setFont(new Font("BinnerD",Font.ITALIC,40));
		c3.setBackground(Color.CYAN);
		pastm=new JLabel("PAST MEDICAL HISTORY");
		pastm.setFont(new Font("BinnerD",Font.BOLD,40));
		pastm.setBounds(230,750,800,200);
	    pa=new JTextField();
		ag.setFont(new Font("BinnerD",Font.BOLD,40));
		pa.setFont(new Font("BinnerD",Font.BOLD,40));
		pa.setBounds(800,750,700,200);
		 nam=new JTextField(20);
		 nam.setFont(new Font("BinnerD",Font.BOLD,40));
		nam.setBounds(500,230,700,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		Co.add(gen);
		Co.add(c1);
		Co.add(c2);
		
		Co.add(c3);
		Co.add(pa);
		Co.add(info);
		Co.add(name);
		Co.add(nam);
		Co.add(age);
		Co.add(ag);
		Co.add(pastm);
		
		
		Co.add(b1);
		Co.add(b2);
		
		
		
		f.add(Co);
		
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		s1=nam.getText();
		//System.out.println("20");
		//System.out.println(s1);
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
			new Register2();
			 f.setVisible(false);
			s1=nam.getText();
			s2=ag.getText();
			s3=ag.getText();
			s4=pa.getText();
			System.out.println(s4);
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
				       int a= Integer.parseInt(s2);
				       
				       System.out.println("hello");
				       System.out.println(a);
			           String Qry = "INSERT INTO Patient(Name,age,pastm,Gender) VALUES(?,?,?,?);";
			           stmt=conn.prepareStatement(Qry);
			           stmt.setString(1,s1);
			           stmt.setInt(2, a);
			           stmt.setString(3, s4);
			           stmt.setString(4, "F");
			         stmt.executeUpdate();
			           		
		       }catch( SQLException ex)	
		       {
		    	   System.out.println("SQLEXCEPTION "+ ex.getMessage());
		       }
			}
			

		}
		
	}
