


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.*;
import java.awt.event.*;
public class Adminlogin extends JFrame {

	private JPanel contentPane;

	
	public Adminlogin(String st1,String st2,String st3,String st4) {
		getContentPane().setLayout(null);
		
		setBounds(100, 100, 450, 300);
		setSize(1920,1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin !");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel.setBounds(52, 31, 259, 78);
		contentPane.add(lblNewLabel);
		
		
		JTable table = new JTable();		
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addColumn("Name");
		model.addColumn("Contact");
		model.addColumn("Email id");
		model.addColumn("Concern");
      
		table.getColumnModel().getColumn(0).setPreferredWidth(1000);
		table.getColumnModel().getColumn(1).setPreferredWidth(1000);
		table.getColumnModel().getColumn(2).setPreferredWidth(1000);
		table.getColumnModel().getColumn(3).setPreferredWidth(4000);
		table.setModel(model);
		
		Object [] row = new Object[10];
		
			
			row[0]=st1;
			row[1]=st2;
			row[2]=st3;
			row[3]=st4;
	    
			model.addRow(row);
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(297, 430, 964, 415);
			contentPane.add(scrollPane);
			
			JLabel lblNewLabel_1 = new JLabel("Details and concerns of individuals are as follows...");
			lblNewLabel_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 18));
			lblNewLabel_1.setBounds(54, 374, 608, 24);
			contentPane.add(lblNewLabel_1);
			
			JLabel adminimg = new JLabel("");
			adminimg.setBounds(62, 115, 197, 183);
			adminimg.setMinimumSize(new Dimension(162,157));
			adminimg.setIcon(new ImageIcon("adminicon.png"));
			adminimg.setPreferredSize(new Dimension(162,157));
			adminimg.setMaximumSize(new Dimension(162,157));
			
			contentPane.add(adminimg);
	
		
	}

}

