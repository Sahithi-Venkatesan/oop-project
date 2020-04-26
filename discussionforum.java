import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

 class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(500,500);
		setSize(200,200);
		setTitle("Fight Corona With Drishti");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tabbedPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		tabbedPane.setSize(new Dimension(500, 0));
		tabbedPane.setBounds(6, 54, 1400, 700);
		contentPane.add(tabbedPane);
		
		JPanel about = new JPanel();
		about.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		about.setPreferredSize(new Dimension(320, 50));
		FlowLayout flowLayout = (FlowLayout) about.getLayout();
		flowLayout.setVgap(50);
		flowLayout.setHgap(320);
		tabbedPane.addTab("    About Us    ", null, about, null);
		
		JLabel Header = new JLabel("Fight Corona With Drishti  ");
		Header.setBounds(new Rectangle(0, 0, 1920, 50));
		Header.setMaximumSize(new Dimension(1920, 50));
		Header.setBackground(SystemColor.desktop);
		Header.setForeground(SystemColor.desktop);
		Header.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 42));
		about.add(Header);
		
		JLabel bg_image = new JLabel("New label");
		bg_image.setMinimumSize(new Dimension(1400, 1080));
		bg_image.setIcon(new ImageIcon("virus.jpg"));
		bg_image.setPreferredSize(new Dimension(1400, 1080));
		bg_image.setMaximumSize(new Dimension(1400, 1080));
		about.add(bg_image);
		
		JPanel testing_centres = new JPanel();
		tabbedPane.addTab("Testing Centres", null, testing_centres, null);
		
		JPanel precautions = new JPanel();
		tabbedPane.addTab("    Precautions     ", null, precautions, null);
		
		JLabel precaution_bg = new JLabel("");
		precaution_bg.setIcon(new ImageIcon("precautions.jpg"));
		precautions.add(precaution_bg);
		
		JPanel faqs = new JPanel();
		tabbedPane.addTab("     FAQs    ", null, faqs, null);
		
		JPanel contact = new JPanel(new GridLayout(2,1));
		JPanel jp3 = new JPanel();
		
		JLabel Header2 = new JLabel("Register To Add New Topic           ");
		Header2.setFont(new Font("DejaVu Math TeX Gyre",  Font.ITALIC, 42));
		jp3.add(Header2);
		
		jp3.add(new JLabel("        Name:    ",Label.LEFT));
		JTextField t1 = new JTextField(45);
		jp3.add(t1);
		jp3.add(new JLabel("                  Email id:   ",Label.LEFT));
		JTextField t2 = new JTextField(45);
		jp3.add(t2);
		jp3.add(new JButton("Register"));
		
		Border bor=BorderFactory.createLineBorder(Color.black);
		JPanel jp2 = new JPanel();
		JLabel Header3 = new JLabel("Post To Existing Topic                  ");
		Header3.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 42));
		jp2.add(Header3);
		jp2.add(new JLabel("Topic:           ",Label.LEFT));
		JTextField t4 = new JTextField(45);
		jp2.add(t4);
		jp2.add(new JLabel("             Post text:        ",Label.LEFT));
		JTextArea t5 = new JTextArea(8,46);
		t5.setBorder(bor);
		jp2.add(t5);
		jp2.add(new JButton("Post"));
		
		jp2.setBorder(bor);
	    jp3.setBorder(bor);
		JPanel twojp = new JPanel(new GridLayout(1,2));
	    twojp.add(jp3);
	    twojp.add(jp2);
		JLabel Header4 = new JLabel("Discussion Forum                  ");
		Header4.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 42));
		JPanel jp4 = new JPanel();
		jp4.add(Header4);
		
		contact.add(jp4);
		contact.add(twojp);
		
		
		tabbedPane.addTab("Connect With Us", null, contact, null);		
		
		
		
		
	}
}