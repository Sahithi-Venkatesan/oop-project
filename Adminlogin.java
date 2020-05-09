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
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
public class Adminlogin extends JFrame {

	private JPanel contentPane;
	private	JTable table;
	
	public Adminlogin(String st1,String st2,String st3,String st4) {
		getContentPane().setLayout(null);
		
		setBounds(100, 100, 450, 300);
		setSize(1920,1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin !");
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel.setBounds(52, 31, 259, 78);
		contentPane.add(lblNewLabel);
		
		
		
			
			JButton view = new JButton("View");
			view.setBounds(680, 348, 200, 50);
			view.addActionListener(new ActionListener()
		{
		  @SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent event)
		  {
			   try {
			 table = new JTable();
	            BufferedReader br = new BufferedReader(new FileReader("data.csv"));
	            
	            String firstLine = br.readLine().trim();
	            String[] columnsName = firstLine.split(" ");
	            DefaultTableModel model = (DefaultTableModel)table.getModel();
	            model.setColumnIdentifiers(columnsName);
	           
	            Object[] row = br.lines().toArray();
	            
	            for(int i = 0; i < row.length; i++)
	            {
	                String line = row[i].toString().trim();
	                String[] data = line.split(",");
	                model.addRow(data);
	            }
	            JScrollPane scrollPane = new JScrollPane(table);
	    		scrollPane.setBounds(297, 430, 964, 415);
	    		contentPane.add(scrollPane);
	    		
	            
	            
	        } catch (Exception ex) {
	           
	        }
			  
		  }
		});
			contentPane.add(view);
			
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
