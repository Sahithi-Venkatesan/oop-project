import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.awt.ButtonGroup;
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
	private JTextField textField;
	private JTextField otp_tf;
	int OTP;
	//ButtonGroup butgrp;
	

	public Createaccount() {
		
		getContentPane().setLayout(null);
		setBounds(100, 100, 450, 300);		
		setSize(1920,1080);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 7, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel usr = new JLabel("Username: ");
		usr.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		usr.setBounds(734, 413, 113, 47);
		contentPane.add(usr);
		
		JTextField tf_username = new JTextField();
		tf_username.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		tf_username.setBackground(new Color(245, 245, 245));
		tf_username.setBounds(857, 413, 399, 47);
		contentPane.add(tf_username);
		tf_username.setColumns(10);
		
		JLabel pass = new JLabel("Password: ");
		pass.setDisplayedMnemonic('*');
		pass.setFont(new Font("Create OneSegoe UI Emoji", Font.PLAIN, 18));
		pass.setBounds(734, 554, 113, 39);
		contentPane.add(pass);
		
		JPasswordField tf_pass = new JPasswordField();
		tf_pass.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		tf_pass.setBackground(new Color(245, 245, 245));
		tf_pass.setEchoChar('*');
		tf_pass.setBounds(857, 554, 399, 49);
		contentPane.add(tf_pass);
		
		JLabel label_firstname = new JLabel("First Name: ");
		label_firstname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		label_firstname.setBounds(734, 87, 113, 32);
		contentPane.add(label_firstname);
		
		fname = new JTextField();
		fname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		fname.setBackground(new Color(245, 245, 245));
		fname.setBounds(857, 80, 399, 47);
		contentPane.add(fname);
		fname.setColumns(10);
		
		JLabel label_lastname = new JLabel("Last Name: ");
		label_lastname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		label_lastname.setBounds(722, 148, 125, 24);
		contentPane.add(label_lastname);
		
		lname = new JTextField();
		lname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		lname.setBackground(new Color(245, 245, 245));
		lname.setBounds(857, 139, 399, 46);
		contentPane.add(lname);
		lname.setColumns(10);
		
		JLabel label_emailid = new JLabel("Email id: ");
		label_emailid.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_emailid.setBounds(734, 199, 101, 24);
		contentPane.add(label_emailid);
		
		mailtf = new JTextField();
		mailtf.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		mailtf.setBackground(new Color(245, 245, 245));
		mailtf.setBounds(857, 197, 399, 47);
		contentPane.add(mailtf);
		mailtf.setColumns(10);
		
		
		JButton create_button = new JButton("Create Now");
		create_button.setBackground(Color.WHITE);
		create_button.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 17));
		create_button.setBounds(887, 865, 233, 60);
		create_button.addActionListener(new ActionListener()
		{
		  @SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent event)
		  {
			  
			  if(tf_username.getText().equals("") || tf_pass.getText().trim().isEmpty() || lname.getText().equals("")|| fname.getText().equals("") || mailtf.getText().equals(""))
				  JOptionPane.showMessageDialog((Component)event.getSource(), "Please fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
			  else	  
				  JOptionPane.showMessageDialog((Component)event.getSource(), "Your account has been created","Confirmation",JOptionPane.INFORMATION_MESSAGE);
		  
		  }
		});
		contentPane.add(create_button);
		
		
		
		JLabel header_create = new JLabel("Create your account now! ");
		header_create.setFont(new Font("Segoe UI Emoji", Font.BOLD, 25));
		header_create.setBounds(831, 37, 425, 47);
		contentPane.add(header_create);
		
		
		JLabel label_gender = new JLabel("Gender: ");
		label_gender.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		label_gender.setBounds(748, 265, 87, 20);
		contentPane.add(label_gender);
		
		
		JLabel label_age = new JLabel("Age: ");
		label_age.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		label_age.setBounds(759, 319, 46, 24);
		contentPane.add(label_age);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "15-19", "20-30", "31-40", "41-50", "51-60", "61-70", "71-80", "81-90"}));
		comboBox.setBackground(new Color(245, 245, 245));
		comboBox.setToolTipText("Select");
		comboBox.setBounds(857, 318, 101, 28);
		contentPane.add(comboBox);

		/*
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
		
		butgrp.add(rdbtnNewRadioButton);
		butgrp.add(rdbtnNewRadioButton_1);
		butgrp.add(rdbtnNewRadioButton_2);
		*/
		
		JLabel label_location = new JLabel("Location: ");
		label_location.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		label_location.setBounds(734, 369, 113, 32);
		contentPane.add(label_location);
		
		JLabel lblNewLabel_7 = new JLabel(" *");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(823, 87, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("*");
		lblNewLabel_8.setBackground(new Color(255, 255, 255));
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(823, 139, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("  *");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setBounds(801, 191, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("   *");
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setBounds(817, 413, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("  *");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setBounds(812, 547, 35, 24);
		contentPane.add(lblNewLabel_11);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Adilabad", "Bhadradri Kothagudem", "Hyderabad", "Jagtial", "Jangaon", "Jayashankar Bhupalpally", "Jogulamba Gadwal", "Kamareddy", "Karimnagar", "Khammam", "Kumuram Bheem", "Mahabubabad", "Mahabubnagar", "Mancherial", "Medak", "Medchal", "Mulugu", "Nagarkurnool", "Nalgonda", "Narayanpet", "Nirmal", "Nizamabad", "Peddapalli", "Rajanna Sircilla", "Rangareddy", "Sangareddy", "Siddipet", "Suryapet", "Vikarabad", "Wanaparthy", "Warangal (Rural)", "Warangal (Urban)", "Yadadri Bhuvanagiri"}));
		comboBox_1.setBounds(855, 370, 189, 32);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Male","Female","Other"} ));
		comboBox_2.setBounds(857, 264, 187, 25);
		contentPane.add(comboBox_2);
		
		JLabel mobilenum_tf = new JLabel("Mobile Number:");
		mobilenum_tf.setFont(new Font("Dialog", Font.PLAIN, 18));
		mobilenum_tf.setBounds(704, 493, 143, 32);
		contentPane.add(mobilenum_tf);
		
		JLabel lblNewLabel = new JLabel("* ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(831, 485, 30, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 245, 245));
		textField.setBounds(859, 491, 397, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGenerateOtp = new JButton("Generate OTP");
		btnGenerateOtp.setBounds(880, 642, 216, 39);
		contentPane.add(btnGenerateOtp);
		
		JLabel lblNewLabel_1 = new JLabel("Enter OTP: ");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(722, 730, 125, 24);
		contentPane.add(lblNewLabel_1);
		
		otp_tf = new JTextField();
		otp_tf.setBackground(new Color(245, 245, 245));
		otp_tf.setBounds(857, 734, 399, 32);
		contentPane.add(otp_tf);
		otp_tf.setColumns(10);
		
		JButton btn_verify = new JButton("Verify OTP ");
		btn_verify.setBounds(880, 789, 223, 39);
		contentPane.add(btn_verify);

	}

	public static void main(String[] args) {
		new Createaccount();
	}
}

