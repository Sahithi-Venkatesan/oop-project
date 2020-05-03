package javaproject;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Createaccount extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField mailtf;
	

	public Createaccount() {
		
		getContentPane().setLayout(null);
		setBounds(100, 100, 450, 300);		
		setSize(1920,1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 7, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel usr = new JLabel("Username");
		usr.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		usr.setBounds(734, 625, 113, 47);
		contentPane.add(usr);
		
		JTextField tf_username = new JTextField();
		tf_username.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		tf_username.setBackground(new Color(245, 245, 245));
		tf_username.setBounds(857, 625, 399, 47);
		contentPane.add(tf_username);
		tf_username.setColumns(10);
		
		JLabel pass = new JLabel("Password");
		pass.setDisplayedMnemonic('*');
		pass.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		pass.setBounds(734, 716, 113, 39);
		contentPane.add(pass);
		
		JPasswordField tf_pass = new JPasswordField();
		tf_pass.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		tf_pass.setBackground(new Color(245, 245, 245));
		tf_pass.setEchoChar('*');
		tf_pass.setBounds(857, 712, 399, 49);
		contentPane.add(tf_pass);
		
		JLabel lblNewLabel = new JLabel("First Name ");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		lblNewLabel.setBounds(734, 164, 101, 32);
		contentPane.add(lblNewLabel);
		
		fname = new JTextField();
		fname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		fname.setBackground(new Color(245, 245, 245));
		fname.setBounds(859, 157, 399, 47);
		contentPane.add(fname);
		fname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(734, 255, 113, 17);
		contentPane.add(lblNewLabel_1);
		
		lname = new JTextField();
		lname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		lname.setBackground(new Color(245, 245, 245));
		lname.setBounds(859, 240, 399, 46);
		contentPane.add(lname);
		lname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email id");
		lblNewLabel_3.setFont(new Font("Segoe UI Emoji", lblNewLabel_3.getFont().getStyle(), 18));
		lblNewLabel_3.setBounds(734, 329, 101, 24);
		contentPane.add(lblNewLabel_3);
		
		mailtf = new JTextField();
		mailtf.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		mailtf.setBackground(new Color(245, 245, 245));
		mailtf.setBounds(859, 318, 399, 47);
		contentPane.add(mailtf);
		mailtf.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 17));
		btnNewButton.setBounds(1019, 769, 101, 32);
		btnNewButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent event)
		  {
			  
			  if(tf_username.getText().equals("") || tf_pass.getText().trim().isEmpty() || lname.getText().equals("")|| fname.getText().equals("") || mailtf.getText().equals(""))
				  JOptionPane.showMessageDialog((Component)event.getSource(), "Please fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
			  else	  
				  JOptionPane.showMessageDialog((Component)event.getSource(), "Your account has been created","Confirmation",JOptionPane.INFORMATION_MESSAGE);
		  
		  }
		});
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Fill in these details to create your account");
		lblNewLabel_2.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		lblNewLabel_2.setBounds(734, 77, 524, 47);
		contentPane.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(734, 414, 62, 20);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(859, 414, 62, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBounds(923, 414, 80, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		rdbtnNewRadioButton_2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBounds(1005, 414, 80, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Age");
		lblNewLabel_5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(734, 471, 46, 24);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "15-19", "20-30", "31-40", "41-50", "51-60", "61-70", "71-80", "81-90"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setToolTipText("Select");
		comboBox.setBounds(857, 467, 101, 28);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Location");
		lblNewLabel_6.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(734, 546, 80, 32);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("*");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(823, 171, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("*");
		lblNewLabel_8.setBackground(new Color(255, 255, 255));
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(823, 254, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("*");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setBounds(801, 330, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setBounds(816, 639, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("*");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setBounds(812, 723, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Adilabad", "Bhadradri Kothagudem", "Hyderabad", "Jagtial", "Jangaon", "Jayashankar Bhupalpally", "Jogulamba Gadwal", "Kamareddy", "Karimnagar", "Khammam", "Kumuram Bheem", "Mahabubabad", "Mahabubnagar", "Mancherial", "Medak", "Medchal", "Mulugu", "Nagarkurnool", "Nalgonda", "Narayanpet", "Nirmal", "Nizamabad", "Peddapalli", "Rajanna Sircilla", "Rangareddy", "Sangareddy", "Siddipet", "Suryapet", "Vikarabad", "Wanaparthy", "Warangal (Rural)", "Warangal (Urban)", "Yadadri Bhuvanagiri"}));
		comboBox_1.setBounds(857, 546, 189, 32);
		contentPane.add(comboBox_1);
		
	}
}