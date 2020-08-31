package docrse;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
public class FirstCon extends JDialog implements ActionListener  {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 5646718002809558971L;

	public JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			
			FirstCon dialog = new FirstCon();
			
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	JButton ok,cancel;
	public FirstCon()  {
		setBounds(600, 350, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		contentPanel.setBackground(Color.WHITE);
		JLabel l1 = new JLabel("Do you want to save information?");
		l1.setFont(new Font("BinnerD",Font.BOLD,20));
		l1.setBackground(Color.BLACK);
		
		contentPanel.add(l1);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				 ok = new JButton("OK");
				ok.setActionCommand("OK");
				buttonPane.add(ok);
				getRootPane().setDefaultButton(ok);
			}
			{
				 cancel = new JButton("Cancel");
				cancel.setActionCommand("Cancel");
				buttonPane.add(cancel);
			}
		}
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ok)
		{
			
			Confirm dialog = new Confirm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			this.dispose();
		   
		}
		else if(e.getSource()==cancel)
		{
			
		   
		   this.dispose();
		}
	}
	
}
