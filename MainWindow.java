import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentListener;
import java.awt.font.TextAttribute;
import java.awt.event.AdjustmentEvent;

import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.BevelBorder;

import javax.swing.table.DefaultTableModel;

import java.util.Arrays;
//import java.util.Map;
import java.util.Scanner;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField cname_tf;
	private JTextField cmobile_tf;
	private JTextField cmail_tf;
	private JTextArea cconcern_tf;  //Changed from JTextField as JTextField is only for single line entry
	private JTextField dname_tf;
	private JPasswordField pa_tf;
	private JTextArea dopinion_tf;
	private JTextArea chat_tf;      //Changed from JTextField as JTextField is only for single line entry
	private JTextField tf_username;
	private JPasswordField tf_password;
	String nameid,mobileid,mailid,concernid;
	private JProgressBar pb;
	StringBuilder sb,sb2;
	int c=0;
	private JTextField namef;
	private JTextField dobf;
	private JTextField bplace;
	private JTextField clgtf;
	private JTextField mobiletf;
	JLabel txt;
	JLabel fname;
	JTextField fname_tf;
	JLabel lname;
	JTextField lname_tf;
	JLabel phone;
	JTextField phone_tf;
	JButton generate_pass;
	JButton btn_forgotpass;
	String fileName = "data.csv"; 
    File myCSVFile = new File("/home/sahithi/Desktop/oop-project/data.csv");
    File volFile = new File("/home/sahithi/Desktop/oop-project/volunteer.txt");
    Timer time;
    String file_discussion = "discussion.csv";
    //public static final String delimiter = "\n";
    //String csvFile = "/home/sahithi/Desktop/Csv/discussion.csv";
  
    private JTextField vnametf;
	private JTextField vmailtf;
	private JTextField vmobtf;
	private JTextField vagetf;
	private JTextField vproftf;
	private JTextField vloctf;
	
	Timer tm;
	 int i = 1;
	 int k;
	 String fileContents;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} 
				catch(Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	//Method to open a url in web browser
	public void openWebPage(String url){
		    try 
		   	{         
		     java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		   	}
		    catch(java.io.IOException e) 
		    {
		       System.out.println(e.getMessage());
		    }
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public MainWindow() throws FileNotFoundException {
		setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1920,1080);
		setTitle("Fight Corona With Drishti");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(240, 248, 255));
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(6, 54, 1914, 1026);
		tabbedPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tabbedPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(tabbedPane);
		
		JPanel home = new JPanel();
		home.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		home.setPreferredSize(new Dimension(320, 50));
		tabbedPane.addTab("Home", null, home, "");
		home.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 0, 1855, 969);
		home.add(panel);
		panel.setLayout(null);
		
		JLabel homepage_bg = new JLabel("");
		homepage_bg.setBackground(new Color(224, 255, 255));
		homepage_bg.setIcon(new ImageIcon("Homepage.jpg"));
		homepage_bg.setBounds(0, 0, 1849, 942);
		panel.add(homepage_bg);
		
		JPanel about = new JPanel();
		about.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		tabbedPane.addTab("About Us", null, about, null);
		about.setLayout(null);
		
		JLabel about_image = new JLabel("");
		about_image.setForeground(Color.WHITE);
		about_image.setBackground(Color.BLACK);
		about_image.setIcon(new ImageIcon("about.png"));
		about_image.setBounds(0, 0, 1853, 939);
		about.add(about_image);
		
		JPanel testing_centres = new JPanel();
		testing_centres.setBackground(new Color(255, 228, 225));
		tabbedPane.addTab("Testing Centres", null, testing_centres, null);
		testing_centres.setLayout(null);
		
		JLabel government = new JLabel("GOVERNMENT TESTING CENTRES");
		government.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 18));
		government.setBounds(328, 27, 344, 37);
		testing_centres.add(government);
		
		JLabel private_centres = new JLabel("PRIVATE TESTING CENTRES");
		private_centres.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 18));
		private_centres.setBounds(1192, 41, 325, 21);
		testing_centres.add(private_centres);
		
		JLabel l1 = new JLabel("Gandhi Medical College, Secunderabad");
		l1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		l1.setBounds(143, 157, 294, 21);
		testing_centres.add(l1);
		
		JLabel l2 = new JLabel("Osmania Medical College, Hyderabad");
		l2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		l2.setBounds(143, 220, 272, 27);
		testing_centres.add(l2);
		
		JLabel l3 = new JLabel("Sir Roland Ross Institute, Nallakunta");
		l3.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		l3.setBounds(143, 295, 272, 21);
		testing_centres.add(l3);
		
		JLabel l4 = new JLabel("Nizam's Institute of Medical Sciences, Hyderabad");
		l4.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		l4.setBounds(104, 358, 363, 27);
		testing_centres.add(l4);
		
		JLabel l5 = new JLabel("Institute of Preventive Medicine, Hyderabad");
		l5.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		l5.setBounds(130, 427, 331, 27);
		testing_centres.add(l5);
		
		JLabel l6 = new JLabel("ESIC Medical College, Hyderabad");
		l6.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		l6.setBounds(174, 502, 263, 21);
		testing_centres.add(l6);
		
		JLabel l7 = new JLabel("CCMB, Hyderabad");
		l7.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		l7.setBounds(208, 571, 207, 21);
		testing_centres.add(l7);
		
		JLabel l8 = new JLabel("Centre for DNA Fingerprinting and Diagnostics, Hyderabad");
		l8.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		l8.setBounds(71, 640, 437, 21);
		testing_centres.add(l8);
		
		JButton g1 = new JButton("Directions");
		g1.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		g1.setBackground(Color.BLACK);
		g1.setForeground(Color.WHITE);
		g1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/g1.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		g1.setBounds(649, 138, 117, 27);
		testing_centres.add(g1);
		
		JButton g2 = new JButton("Directions");
		g2.setBackground(Color.BLACK);
		g2.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		g2.setForeground(Color.WHITE);
		g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/g2.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		g2.setBounds(649, 205, 117, 27);
		testing_centres.add(g2);
		
		JButton g3 = new JButton("Directions");
		g3.setForeground(Color.WHITE);
		g3.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		g3.setBackground(Color.BLACK);
		g3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/g3.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		g3.setBounds(649, 290, 117, 27);
		testing_centres.add(g3);
		
		JButton g4 = new JButton("Directions");
		g4.setForeground(Color.WHITE);
		g4.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		g4.setBackground(Color.BLACK);
		g4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/g4.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		g4.setBounds(649, 356, 117, 27);
		testing_centres.add(g4);
		
		JButton g5 = new JButton("Directions");
		g5.setForeground(Color.WHITE);
		g5.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		g5.setBackground(Color.BLACK);
		g5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/g5.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		g5.setBounds(649, 425, 117, 27);
		testing_centres.add(g5);
		
		JButton g6 = new JButton("Directions");
		g6.setForeground(Color.WHITE);
		g6.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		g6.setBackground(Color.BLACK);
		g6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/g6.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		g6.setBounds(649, 497, 117, 27);
		testing_centres.add(g6);
		
		JButton g7 = new JButton("Directions");
		g7.setForeground(Color.WHITE);
		g7.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		g7.setBackground(Color.BLACK);
		g7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/g7.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		g7.setBounds(649, 566, 117, 27);
		testing_centres.add(g7);
		
		JButton g8 = new JButton("Directions");
		g8.setForeground(Color.WHITE);
		g8.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		g8.setBackground(Color.BLACK);
		g8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/g8.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		g8.setBounds(649, 635, 117, 27);
		testing_centres.add(g8);
		
		JLabel p1 = new JLabel("Apollo Hospitals,Jubilee Hills, Hyderabad");
		p1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p1.setBounds(1073, 138, 316, 21);
		testing_centres.add(p1);
		
		JLabel p2 = new JLabel("Vijaya Diagnostic Center Himayath Nagar, Hyderabad");
		p2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p2.setBounds(1034, 182, 395, 27);
		testing_centres.add(p2);
		
		JLabel p3 = new JLabel("Vimta Labs,Cherlapally,Hyderabad");
		p3.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p3.setBounds(1088, 240, 281, 21);
		testing_centres.add(p3);
		
		JLabel p4 = new JLabel("Apollo Diagnostic Laboratory, Bowenpally,Secunderabad");
		p4.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p4.setBounds(1037, 295, 422, 16);
		testing_centres.add(p4);
		
		JLabel p5 = new JLabel("Dr.Remedies Labs,Punjagutta,Hyderabad");
		p5.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p5.setBounds(1075, 334, 314, 27);
		testing_centres.add(p5);
		
		JLabel p6 = new JLabel("PathCare Labs,Medchal,Hyderabad");
		p6.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p6.setBounds(1104, 384, 272, 21);
		testing_centres.add(p6);
		
		JLabel p7 = new JLabel("American Institute of Pathology and Life Sciences,Hyderabad");
		p7.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p7.setBounds(1034, 440, 437, 21);
		testing_centres.add(p7);
		
		JLabel p8 = new JLabel("Medics Path Labs, Secunderabad");
		p8.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p8.setBounds(1117, 491, 272, 21);
		testing_centres.add(p8);
		
		JLabel p9 = new JLabel("Yashoda Hospital, Secunderabad");
		p9.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p9.setBounds(1126, 540, 263, 16);
		testing_centres.add(p9);
		
		JLabel p10 = new JLabel("Biognosys Technologies,Medchal,Hyderabad");
		p10.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p10.setBounds(1089, 590, 316, 21);
		testing_centres.add(p10);
		
		JLabel p11 = new JLabel("Tenet Diagnostics, Banjara Hills, Hyderabad");
		p11.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		p11.setBounds(1108, 640, 363, 21);
		testing_centres.add(p11);
		
		JButton b1 = new JButton("Directions");
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b1.setBackground(Color.BLACK);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/p1.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b1.setBounds(1512, 120, 110, 27);
		testing_centres.add(b1);
		
		JButton b2 = new JButton("Directions");
		b2.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/p2.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b2.setBounds(1512, 180, 110, 27);
		testing_centres.add(b2);
		
		JButton b3 = new JButton("Directions");
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b3.setBackground(Color.BLACK);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/p3.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b3.setBounds(1512, 235, 110, 27);
		testing_centres.add(b3);
		
		JButton b4 = new JButton("Directions");
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b4.setBackground(Color.BLACK);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/p4.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b4.setBounds(1512, 290, 110, 27);
		testing_centres.add(b4);
		
		JButton b5 = new JButton("Directions");
		b5.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLACK);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
                    File file = new java.io.File("files/p5.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b5.setBounds(1512, 332, 110, 27);
		testing_centres.add(b5);
		
		JButton b6 = new JButton("Directions");
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b6.setBackground(Color.BLACK);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/p6.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b6.setBounds(1512, 379, 110, 27);
		testing_centres.add(b6);
		
		JButton b7 = new JButton("Directions");
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b7.setBackground(Color.BLACK);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/p7.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b7.setBounds(1512, 427, 110, 27);
		testing_centres.add(b7);
		
		JButton b8 = new JButton("Directions");
		b8.setForeground(Color.WHITE);
		b8.setBackground(Color.BLACK);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/p8.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b8.setBounds(1512, 486, 110, 27);
		testing_centres.add(b8);
		
		JButton b9 = new JButton("Directions");
		b9.setForeground(Color.WHITE);
		b9.setBackground(Color.BLACK);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/p9.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b9.setBounds(1512, 533, 110, 27);
		testing_centres.add(b9);
		
		JButton b10 = new JButton("Directions");
		b10.setBackground(Color.BLACK);
		b10.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b10.setForeground(Color.WHITE);
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/p10.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b10.setBounds(1512, 585, 110, 27);
		testing_centres.add(b10);
		
		JButton b11 = new JButton("Directions");
		b11.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		b11.setBackground(Color.BLACK);
		b11.setForeground(Color.WHITE);
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try 
				{
                    File file = new java.io.File("files/p11.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		b11.setBounds(1512, 635, 110, 27);
		testing_centres.add(b11);
		
		JLabel imp_label = new JLabel("*Important Note:");
		imp_label.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		imp_label.setBounds(649, 821, 144, 15);
		testing_centres.add(imp_label);
		
		JLabel note_label = new JLabel("All the information provided has been taken from verified sources");
		note_label.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		note_label.setBounds(780, 820, 481, 16);
		testing_centres.add(note_label);
		
		JLabel background_img = new JLabel("");
		background_img.setIcon(new ImageIcon("location2.jpg"));
		background_img.setBounds(0, 0, 1860, 940);
		testing_centres.add(background_img);
		
		JPanel faqs = new JPanel();
		faqs.setBackground(new Color(255, 255, 204));
		tabbedPane.addTab("     FAQs    ", null, faqs, null);
		faqs.setLayout(null);
		
		JLabel heading_faqs = new JLabel("Frequently Asked Questions");
		heading_faqs.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 24));
		heading_faqs.setBounds(741, 6, 384, 47);
		faqs.add(heading_faqs);
		
		JButton knowmore_btn = new JButton("Click here to know more");
		knowmore_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				openWebPage("https://drive.google.com/file/d/1G6FcnM0bYR-4Vs8yElbmXl_e6v1UEBEQ/view?usp=sharing");
			}
		});
		knowmore_btn.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		knowmore_btn.setBounds(741, 612, 375, 65);
		faqs.add(knowmore_btn);
		
		JLabel faq1 = new JLabel("What are the symptoms of COVID 19?");
		faq1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		faq1.setBounds(70, 109, 322, 35);
		faqs.add(faq1);
		
		JLabel faq2 = new JLabel("The  most  common  symptoms  of  COVID-19  are  fever,  tiredness,  and dry   cough.   Some   patients   may   have   aches   and   pains, nasal congestion, runny nose, sore throat or diarrhea.These symptoms are ");
		faq2.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq2.setBounds(80, 137, 1764, 20);
		faqs.add(faq2);
		
		JLabel faq3 = new JLabel("mild  and  begin  gradually.  Some  people  become  infected  but don’t  develop  any  symptoms  and  don't  feel  unwell.  Most  people (about   80%)   recover   from   the   disease   without   needing   special");
		faq3.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq3.setBounds(80, 156, 1707, 27);
		faqs.add(faq3);
		
		JLabel faq4 = new JLabel("treatment.  Around  1  out  of  every  6  people  who  gets COVID-19 becomes  seriously  ill  and  develops  difficulty  breathing.  Older  people, and those with underlying medical problems like high blood ");
		faq4.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq4.setBounds(80, 183, 1707, 27);
		faqs.add(faq4);
		
		JLabel faq5 = new JLabel("pressure, heart problems or diabetes, are more likely to develop serious illness. People with fever, cough and difficulty breathing should seek medical attention.");
		faq5.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq5.setBounds(80, 209, 1707, 27);
		faqs.add(faq5);
		
		JLabel faq6 = new JLabel("How does COVID 19 spread?");
		faq6.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		faq6.setBounds(70, 248, 278, 27);
		faqs.add(faq6);
		
		JLabel faq7 = new JLabel("People  can  catch  COVID-19  from  others  who  have  the virus.  The disease can spread from person to person through small droplets from the  nose  or  mouth  which  are  spread  when  a  person  with  ");
		faq7.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq7.setBounds(80, 276, 1695, 20);
		faqs.add(faq7);
		
		JLabel faq8 = new JLabel("COVID-19 coughs  or  exhales.  These  droplets  land  on  objects  and  surfaces around  the  person.  Other  people  then  catch  COVID-19  by  touching these  objects  or  surfaces,  then  touching  their  eyes, ");
		faq8.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq8.setBounds(80, 294, 1695, 27);
		faqs.add(faq8);
		
		JLabel faq9 = new JLabel("nose  or  mouth. People  can  also  catch  COVID-19  if  they  breathe  in  droplets  from  a person  with  COVID-19  who  coughs  out  or  exhales  droplets.  This  is why  it  is  important  to  stay  more  than   ");
		faq9.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq9.setBounds(80, 319, 1712, 27);
		faqs.add(faq9);
		
		JLabel faq10 = new JLabel("1  meter  (3  feet)  away  from  a person who is sick.");
		faq10.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq10.setBounds(80, 344, 462, 20);
		faqs.add(faq10);
		
		JLabel faq11 = new JLabel("Can the virus that causes COVID-19 be transmitted through the air? ");
		faq11.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		faq11.setBounds(70, 395, 723, 20);
		faqs.add(faq11);
		
		JLabel faq12 = new JLabel("Studies to date suggest that the virus that causes COVID-19 is mainly transmitted   through   contact   with   respiratory   droplets   rather   than through  the  air. ");
		faq12.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq12.setBounds(80, 415, 1326, 27);
		faqs.add(faq12);
		
		JLabel faq13 = new JLabel("Can COVID-19 be caught from a person who has no symptoms?");
		faq13.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		faq13.setBounds(70, 480, 873, 27);
		faqs.add(faq13);
		
		JLabel faq14 = new JLabel("The  main  way  the  disease  spreads  is  through  respiratory  droplets expelled by someone who is coughing. The risk of catching COVID-19 from  someone  with  no  symptoms  at  all  is  very  low.However, ");
		faq14.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq14.setBounds(80, 503, 1707, 27);
		faqs.add(faq14);
		
		JLabel faq15 = new JLabel("many people   with   COVID-19   experience   only   mild   symptoms.   This   is particularly  true  at  the  early  stages  of  the  disease.  It  is  therefore  possible to catch COVID-19  from someone  who  has, for");
		faq15.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq15.setBounds(80, 526, 1707, 27);
		faqs.add(faq15);
		
		JLabel faq16 = new JLabel("example, just a mild cough and does not feel ill. ");
		faq16.setFont(new Font("DejaVu Math TeX Gyre", Font.ITALIC, 16));
		faq16.setBounds(80, 553, 839, 20);
		faqs.add(faq16);
		
		JLabel imp_label2 = new JLabel("*Important Note:");
		imp_label2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 12));
		imp_label2.setBounds(668, 752, 120, 27);
		faqs.add(imp_label2);
		
		JLabel note_label2 = new JLabel("All the information provided has been taken from verified sources");
		note_label2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 12));
		note_label2.setBounds(785, 752, 454, 27);
		faqs.add(note_label2);
		
		JPanel donate = new JPanel();
		donate.setBackground(new Color(240, 255, 255));
		tabbedPane.addTab("Donate Now", null, donate, null);
		donate.setLayout(null);
		
		JPanel description_pane = new JPanel();
		description_pane.setBackground(new Color(240, 255, 255));
		description_pane.setBounds(69, 420, 735, 547);
		donate.add(description_pane);
		description_pane.setLayout(null);
		
		JLabel logo_donate = new JLabel("");
		logo_donate.setIcon(new ImageIcon("logo_drishti.png"));
		logo_donate.setBounds(22, 193, 140, 150);
		description_pane.add(logo_donate);
		
		JLabel info_label1 = new JLabel("We are proudly non-profit, non-corporate and  ");
		info_label1.setFont(new Font("Dyuthi", Font.BOLD | Font.ITALIC, 25));
		info_label1.setBounds(174, 314, 574, 29);
		description_pane.add(info_label1);
		
		JLabel info_label2 = new JLabel("non-compromised. Thousands of people like you are lending ");
		info_label2.setFont(new Font("Dyuthi", Font.BOLD | Font.ITALIC, 25));
		info_label2.setBounds(22, 345, 690, 39);
		description_pane.add(info_label2);
		
		JLabel info_label3 = new JLabel("a helping hand to fight against the novel corona virus. Let’s  ");
		info_label3.setFont(new Font("Dyuthi", Font.BOLD | Font.ITALIC, 25));
		info_label3.setBounds(22, 381, 690, 29);
		description_pane.add(info_label3);
		
		JLabel info_label4 = new JLabel("contribute our share to and help India fight this.  All your ");
		info_label4.setFont(new Font("Dyuthi", Font.BOLD | Font.ITALIC, 25));
		info_label4.setBounds(22, 410, 690, 30);
		description_pane.add(info_label4);
		
		JLabel info_label5 = new JLabel("donations will be redirected to the Prime Minister’s Relief Fund. ");
		info_label5.setFont(new Font("Dyuthi", Font.BOLD | Font.ITALIC, 25));
		info_label5.setBounds(6, 437, 723, 39);
		description_pane.add(info_label5);
		
		JPanel form_pane = new JPanel();
		form_pane.setBackground(new Color(240, 255, 255));
		form_pane.setBounds(863, 420, 801, 472);
		donate.add(form_pane);
		form_pane.setLayout(null);
		
		JLabel header_donation = new JLabel("We can’t help everyone, but everyone can help someone. ");
		header_donation.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 21));
		header_donation.setBounds(128, 127, 688, 57);
		form_pane.add(header_donation);
		
		JLabel quote1 = new JLabel("Rebuilding lives for futures.");
		quote1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 21));
		quote1.setBounds(295, 196, 310, 51);
		form_pane.add(quote1);
		
		JLabel quote2 = new JLabel("Don’t delay,  give today! ");
		quote2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 21));
		quote2.setBounds(305, 259, 277, 51);
		form_pane.add(quote2);
		
		JButton quote3 = new JButton("Donate Now! ");
		quote3.setForeground(new Color(255, 250, 250));
		quote3.setBackground(new Color(0, 0, 0));
		quote3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openWebPage("https://pmnrf.gov.in/en/online-donation");
			}
		});
		quote3.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 24));
		quote3.setBounds(318, 385, 216, 76);
		form_pane.add(quote3);
		
		JLabel label_headerimage = new JLabel("");
		label_headerimage.setIcon(new ImageIcon("gov.jpg"));
		label_headerimage.setBounds(18, 6, 1837, 402);
		donate.add(label_headerimage);
		
		JPanel more_info = new JPanel();
		more_info.setBackground(new Color(255, 240, 245));
		tabbedPane.addTab("More Info ", null, more_info, null);
		more_info.setLayout(null);
		
		JPanel emergency_panel = new JPanel();
		emergency_panel.setBackground(new Color(255, 0, 0));
		emergency_panel.setBounds(194, 92, 497, 446);
		more_info.add(emergency_panel);
		emergency_panel.setLayout(null);
		
		JLabel heading_emergency = new JLabel("Emergency ");
		heading_emergency.setForeground(new Color(255, 255, 255));
		heading_emergency.setBackground(new Color(255, 255, 255));
		heading_emergency.setFont(new Font("Bitstream Charter", Font.BOLD, 21));
		heading_emergency.setBounds(29, 29, 127, 26);
		emergency_panel.add(heading_emergency);
		
		JLabel dashedline = new JLabel("-----------------------------");
		dashedline.setForeground(new Color(255, 255, 255));
		dashedline.setFont(new Font("DejaVu Sans", Font.PLAIN, 14));
		dashedline.setBounds(0, 53, 156, 15);
		emergency_panel.add(dashedline);
		
		JLabel label_cov = new JLabel("Coronavirus disease ");
		label_cov.setForeground(new Color(255, 255, 255));
		label_cov.setFont(new Font("Century Schoolbook L", Font.BOLD, 21));
		label_cov.setBounds(113, 106, 242, 32);
		emergency_panel.add(label_cov);
		
		JLabel label_covid = new JLabel("COVID - 19 ");
		label_covid.setForeground(new Color(255, 255, 255));
		label_covid.setFont(new Font("Century Schoolbook L", Font.BOLD, 21));
		label_covid.setBounds(164, 137, 179, 32);
		emergency_panel.add(label_covid);
		
		JLabel label_pandemic = new JLabel("pandemic ");
		label_pandemic.setForeground(new Color(255, 255, 255));
		label_pandemic.setFont(new Font("Century Schoolbook L", Font.BOLD, 21));
		label_pandemic.setBounds(164, 170, 152, 26);
		emergency_panel.add(label_pandemic);
		
		JButton btnMoreInfoHere = new JButton("More Info Here --->");
		btnMoreInfoHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				openWebPage("https://www.who.int/emergencies/diseases/novel-coronavirus-2019");
			}
		});
		btnMoreInfoHere.setBackground(new Color(255, 255, 255));
		btnMoreInfoHere.setForeground(new Color(255, 0, 0));
		btnMoreInfoHere.setFont(new Font("DejaVu Sans", Font.BOLD, 21));
		btnMoreInfoHere.setBounds(98, 247, 268, 55);
		emergency_panel.add(btnMoreInfoHere);
		
		JLabel note_imp = new JLabel("*Important Note:  All the information provided has been taken from verified sources ");
		note_imp.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 15));
		note_imp.setBounds(665, 847, 710, 43);
		more_info.add(note_imp);
		
		JLabel label_updates = new JLabel("Latest Updates !! ");
		label_updates.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 39));
		label_updates.setBounds(1114, 72, 452, 43);
		more_info.add(label_updates);
		
		JLabel lblNewLabel_1 = new JLabel("Plasma therapy is no silver bullet - To recommend it without ");
		lblNewLabel_1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(1048, 166, 489, 26);
		more_info.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("undertaking a robust scientific study may cause more harm ");
		lblNewLabel_2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(1048, 193, 489, 26);
		more_info.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("than good ");
		lblNewLabel_3.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(1048, 216, 199, 26);
		more_info.add(lblNewLabel_3);
		
		JButton btnKnowMore = new JButton("Know More");
		btnKnowMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openWebPage("https://aspirantworld.in/editorial-analysis-plasma-therapy-is-no-silver-bullet/");
			}
		});
		btnKnowMore.setBackground(new Color(0, 0, 0));
		btnKnowMore.setForeground(new Color(255, 228, 225));
		btnKnowMore.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 18));
		btnKnowMore.setBounds(1169, 229, 188, 43);
		more_info.add(btnKnowMore);
		
		JLabel lblNewLabel_4 = new JLabel("Find out the coronavirus disease (COVID - 19) situation ");
		lblNewLabel_4.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(1048, 315, 489, 26);
		more_info.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("dashboard. This interactive dashboard provides the latest ");
		lblNewLabel_5.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(1048, 336, 489, 26);
		more_info.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("global numbers and numbers by country of COVID-19 ");
		lblNewLabel_6.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(1048, 360, 489, 19);
		more_info.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("cases on a daily basis. ");
		lblNewLabel_7.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7.setBounds(1048, 374, 188, 26);
		more_info.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Find Here ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				openWebPage("https://covid19.who.int/");
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 240, 245));
		btnNewButton.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 18));
		btnNewButton.setBounds(1173, 412, 184, 43);
		more_info.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Here are a few very important Myth Busters for this pandemic ");
		lblNewLabel_8.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_8.setBounds(1048, 514, 489, 24);
		more_info.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("issued on public interest by the World Health Organisation . ");
		lblNewLabel_9.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_9.setBounds(1048, 539, 489, 26);
		more_info.add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("Myth Busters ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				openWebPage("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters");
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 240, 245));
		btnNewButton_1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 18));
		btnNewButton_1.setBounds(1137, 577, 284, 58);
		more_info.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("Inorder to write to us, visit the Connect With Us page or  ");
		lblNewLabel_10.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 18));
		lblNewLabel_10.setBounds(417, 736, 538, 26);
		more_info.add(lblNewLabel_10);
		
		JButton btnNewButton_2 = new JButton("Click Here ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				tabbedPane.setSelectedIndex(8);
			}
		});
		btnNewButton_2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.setForeground(new Color(255, 240, 245));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(954, 724, 228, 38);
		more_info.add(btnNewButton_2);
		
		JPanel stats = new JPanel();
		tabbedPane.addTab("Statistics", null, stats, null);
		stats.setLayout(null);
		
		JLabel stat_display = new JLabel("0 ");
		stat_display.setFont(new Font("Century Schoolbook L", Font.BOLD, 99));
		stat_display.setForeground(Color.WHITE);
		stat_display.setHorizontalAlignment(SwingConstants.CENTER);
		stat_display.setBounds(262, 128, 1061, 294);
		stats.add(stat_display);
		
		JLabel lblTotalCasesWorldwide = new JLabel("Total Cases Worldwide");
		lblTotalCasesWorldwide.setForeground(Color.WHITE);
		lblTotalCasesWorldwide.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 40));
		lblTotalCasesWorldwide.setBounds(485, 40, 523, 89);
		stats.add(lblTotalCasesWorldwide);
		
		JLabel lblNewLabel_13 = new JLabel("Apart from this, you can also view the total number");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 39));
		lblNewLabel_13.setBounds(39, 468, 1353, 79);
		stats.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("of active cases Worldwide, in India and in Telangana.");
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 39));
		lblNewLabel_14.setBounds(34, 549, 1289, 57);
		stats.add(lblNewLabel_14);
		
		JPanel panel_htmllink = new JPanel();
		panel_htmllink.setBackground(Color.BLACK);
		panel_htmllink.setBounds(670, 689, 352, 89);
		stats.add(panel_htmllink);
		panel_htmllink.setLayout(null);
		
		JLabel label_html = new JLabel("Have a look :) ");
		label_html.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try 
				{
                    File file = new java.io.File("files/index.html").getAbsoluteFile();
                    Desktop.getDesktop().open(file);                    
                } 
				catch (Exception e1) 
				{
                    e1.printStackTrace();
                }
			}
		});
		
		label_html.setHorizontalAlignment(SwingConstants.CENTER);
		label_html.setBounds(0, 0, 346, 83);
		panel_htmllink.add(label_html);
		label_html.setBackground(Color.BLACK);
		label_html.setForeground(Color.WHITE);
		label_html.setFont(new Font("Century Schoolbook L", Font.BOLD, 39));
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("bg_2.jpg"));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(0, 0, 1848, 935);
		stats.add(lblNewLabel_12);
		
			
			
			JPanel vol = new JPanel();
			vol.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			vol.setPreferredSize(new Dimension(320, 50));
			tabbedPane.addTab("Volunteer", null, vol, "");
			tabbedPane.setBackgroundAt(7, Color.WHITE);
			vol.setLayout(null);
			
			JLabel l11 = new JLabel("Become a proud volunteer");
			l11.setForeground(Color.WHITE);
			l11.setFont(new Font("Segoe UI Emoji", Font.BOLD, 37));
			l11.setBounds(84, 104, 569, 84);
			vol.add(l11);
			
			JLabel volname = new JLabel("Name");
			volname.setForeground(Color.WHITE);
			volname.setFont(new Font("Dialog", Font.BOLD, 20));
			volname.setBounds(146, 299, 122, 32);
			vol.add(volname);
			
			vnametf = new JTextField();
			vnametf.setFont(new Font("Tahoma", Font.PLAIN, 16));
			vnametf.setBounds(265, 295, 218, 41);
			vol.add(vnametf);
			vnametf.setColumns(10);
			
			JLabel vmail = new JLabel("Email");
			vmail.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
			vmail.setForeground(Color.WHITE);
			vmail.setBounds(133, 379, 76, 44);
			vol.add(vmail);
			
			vmailtf = new JTextField();
			vmailtf.setFont(new Font("Tahoma", Font.PLAIN, 16));
			vmailtf.setBounds(265, 381, 218, 41);
			vol.add(vmailtf);
			vmailtf.setColumns(10);
			
			JLabel vmobile = new JLabel("Mobile");
			vmobile.setForeground(Color.WHITE);
			vmobile.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
			vmobile.setBounds(619, 304, 112, 23);
			vol.add(vmobile);
			
			vmobtf = new JTextField();
			vmobtf.setFont(new Font("Tahoma", Font.PLAIN, 16));
			vmobtf.setBounds(741, 295, 218, 41);
			vol.add(vmobtf);
			vmobtf.setColumns(10);
			
			JLabel l12 = new JLabel("Age");
			l12.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
			l12.setForeground(Color.WHITE);
			l12.setBounds(619, 393, 63, 23);
			vol.add(l12);
			
			vagetf = new JTextField();
			vagetf.setFont(new Font("Tahoma", Font.PLAIN, 16));
			vagetf.setBounds(741, 378, 218, 44);
			vol.add(vagetf);
			vagetf.setColumns(10);
			
			JLabel vprof = new JLabel("Profession");
			vprof.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
			vprof.setForeground(Color.WHITE);
			vprof.setBounds(107, 461, 142, 32);
			vol.add(vprof);
			
			vproftf = new JTextField();
			vproftf.setFont(new Font("Tahoma", Font.PLAIN, 16));
			vproftf.setBounds(265, 461, 218, 41);
			vol.add(vproftf);
			vproftf.setColumns(10);
			
			JLabel vlov = new JLabel("Location");
			vlov.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
			vlov.setForeground(Color.WHITE);
			vlov.setBounds(577, 470, 137, 23);
			vol.add(vlov);
			
			vloctf = new JTextField();
			vloctf.setFont(new Font("Tahoma", Font.PLAIN, 16));
			vloctf.setBounds(741, 461, 218, 41);
			vol.add(vloctf);
			vloctf.setColumns(10);
			
			JButton joinbtn = new JButton("Join Now!");
			joinbtn.setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));		
			joinbtn.setBackground(new Color(100, 149, 237));
			joinbtn.setForeground(Color.WHITE);
			joinbtn.setBounds(511, 587, 142, 41);
			joinbtn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent event)
				{
					if(vnametf.getText().equals("")||vmobtf.getText().equals("")||vagetf.getText().equals("")||vmailtf.getText().equals("")||vproftf.getText().equals("")||vloctf.getText().equals("")) {
						JOptionPane.showMessageDialog((Component)event.getSource(),"Please fill all the details","Error", JOptionPane.ERROR_MESSAGE);
					}
					else if(vmobtf.getText().length()!=10) {
						JOptionPane.showMessageDialog((Component)event.getSource(),"Please enter a valid phone number","Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
					
					JOptionPane.showMessageDialog((Component)event.getSource(),"You are now a volunteer","Congrats!", JOptionPane.INFORMATION_MESSAGE);
					tm.start();
					try{
					FileWriter volwrite=new FileWriter("volunteer.txt",true);
					BufferedWriter volbuf=new BufferedWriter(volwrite);
					volbuf.write(vnametf.getText()+"  "+vmobtf.getText()+"  "+vagetf.getText()+"  "+vmailtf.getText()+"  "+vproftf.getText()+"  "+vloctf.getText()+"\n");
					volbuf.close();
					volwrite.close();
					}
					catch(IOException e1){
					}
					}
					vnametf.setText("");
					vmobtf.setText("");
					vagetf.setText("");
					vmailtf.setText("");
					vproftf.setText("");
					vloctf.setText("");
				}
			});
			
			vol.add(joinbtn);
			JLabel textvol = new JLabel("Volunteers are the backbone of  any organisation, helping to run successful ");
			textvol.setFont(new Font("Dialog", Font.BOLD, 18));
			textvol.setForeground(Color.WHITE);
			textvol.setBounds(1014, 299, 829, 42);
			vol.add(textvol);
			
			JLabel l13 = new JLabel(" programmes and assisting many vulnerable people in need.");
			l13.setFont(new Font("Dialog", Font.BOLD, 18));
			l13.setForeground(Color.WHITE);
			l13.setBounds(1014, 327, 700, 51);
			vol.add(l13);
			
			JLabel l14 = new JLabel("Drishti recruits volunteers irrespective of their race, ethnicity, sex,");
			l14.setFont(new Font("Dialog", Font.BOLD, 18));
			l14.setForeground(Color.WHITE);
			l14.setBounds(1024, 416, 819, 32);
			vol.add(l14);
			
			JLabel lblNewLabel_15 = new JLabel("religious belief, age, and disability.");
			lblNewLabel_15.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNewLabel_15.setForeground(Color.WHITE);
			lblNewLabel_15.setBounds(1024, 444, 819, 23);
			vol.add(lblNewLabel_15);
			
			JLabel lblNewLabel_16 = new JLabel("\"What is the essence of life?");
			lblNewLabel_16.setFont(new Font("Felix Titling", Font.BOLD, 30));
			lblNewLabel_16.setForeground(Color.WHITE);
			lblNewLabel_16.setBounds(1014, 556, 600, 44);
			vol.add(lblNewLabel_16);
			
			JLabel lblNewLabel_17 = new JLabel("to serve others and to do good.\"");
			lblNewLabel_17.setFont(new Font("Felix Titling", Font.BOLD, 30));
			lblNewLabel_17.setForeground(Color.WHITE);
			lblNewLabel_17.setBounds(1024, 612, 700, 32);
			vol.add(lblNewLabel_17);
			
			JLabel lblNewLabel_18 = new JLabel("-ARISTOTLE");
			lblNewLabel_18.setFont(new Font("Segoe UI Emoji", Font.BOLD, 22));
			lblNewLabel_18.setForeground(Color.WHITE);
			lblNewLabel_18.setBounds(1185, 697, 201, 32);
			vol.add(lblNewLabel_18);

			Scanner sc = new Scanner(new File("sample.txt"));
			  
			  StringBuilder sb2 = new StringBuilder();
			  
			  while (sc.hasNextLine()) {
			     sb2.append(sc.nextLine());
			  }
			   fileContents = sb2.toString();
			  int j=Integer.parseInt(fileContents);
			  sc.close();
			
			JLabel label = new JLabel(fileContents);
			label.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 29));
			label.setForeground(Color.WHITE);
			label.setBounds(741, 195, 112, 36);
			vol.add(label);
			
			
			JLabel volimg = new JLabel("");
			volimg.setIcon(new ImageIcon("volicon.png"));
			volimg.setBounds(675, 67, 154, 116);
			vol.add(volimg);
			
			
			
			JLabel voltxt = new JLabel("Volunteers reached");
			voltxt.setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));
			voltxt.setForeground(Color.WHITE);
			voltxt.setBounds(686, 242, 273, 23);
			vol.add(voltxt);
			
			JLabel lblNewLabel_19 = new JLabel("");
			lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_19.setIcon(new ImageIcon("volunteer.jpg"));
			lblNewLabel_19.setBounds(-119, 0, 1973, 1102);
			vol.add(lblNewLabel_19);
		

		
		
		JPanel contact = new JPanel();
		contact.setBackground(new Color(255, 228, 225));
		tabbedPane.addTab("Connect With Us", null, contact, null);
		contact.setLayout(null);

		tabbedPane.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent ce)
			{
				int index = tabbedPane.getSelectedIndex();
				if(index == 8)
				{
					cname_tf.setText("");
					cmobile_tf.setText("");
					cmail_tf.setText("");
					cconcern_tf.setText("");
					dopinion_tf.setText("");
                	String fileResult = "";                 
                	try 
                	{
                		BufferedReader csvReader = new BufferedReader(new FileReader("discussion.csv"));
                		String line = null;
                		while ((line = csvReader.readLine()) != null) 
                		{
   
                    		fileResult = fileResult+"\n"+line;
                		}
                	}
                	catch(FileNotFoundException ex) 
                	{
                    	System.err.println("File was not found");
                	}
                	catch(IOException ioe) 
                	{
                    	System.err.println("There was an error while reading the file");
                	}
                	chat_tf.setText(fileResult);	
				}
			}
		});
		
		JButton connect_button = new JButton("Submit ");
		connect_button.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		connect_button.setBounds(237, 389, 142, 37);
		connect_button.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent event)
		  {
			  
			     nameid=cname_tf.getText();
				 mobileid=cmobile_tf.getText();
				 mailid	=cmail_tf.getText();
			     concernid=cconcern_tf.getText();
		    
		    if(cname_tf.getText().equals("")||cmobile_tf.getText().equals("")||cconcern_tf.getText().equals("")) 
		    	JOptionPane.showMessageDialog((Component)event.getSource(),"Please fill all the fields","Error", JOptionPane.ERROR_MESSAGE);
			  
		    else if(cmobile_tf.getText().length()!=10)
		    	JOptionPane.showMessageDialog((Component)event.getSource(), "Please enter a valid phone number","Error",JOptionPane.ERROR_MESSAGE);    
			  
		    else
		    	JOptionPane.showMessageDialog((Component)event.getSource(), "Your concern has been submitted","Confirmation",JOptionPane.INFORMATION_MESSAGE);

		    
		    if(cname_tf.getText().equals("")||cmobile_tf.getText().equals("")||cconcern_tf.getText().equals("")) 
		    	JOptionPane.showMessageDialog((Component)event.getSource(),"Please fill all the fields","Error", JOptionPane.ERROR_MESSAGE);
			  
		    else if(cmobile_tf.getText().length()!=10)
		    	JOptionPane.showMessageDialog((Component)event.getSource(), "Please enter a valid phone number","Error",JOptionPane.ERROR_MESSAGE);    
			  
		    else
		    {
		    				
                try 
                {
                       
                    FileWriter fw = new FileWriter(fileName,true);
					BufferedWriter br = new BufferedWriter(fw);
					StringBuilder sb = new StringBuilder();
					for(int i=0; i<1; i++)
					{
						sb.append(cname_tf.getText()+",");

						sb.append(cmobile_tf.getText()+",");
						sb.append(cmail_tf.getText()+",");
						sb.append(cconcern_tf.getText()+"\n");
					}
					br.write(sb.toString());
    				br.close();
                        
                }
                catch(IOException ex) 
                {
                    System.out.println("Error writing to file '"+ fileName + "'");
                        
                }

                JOptionPane.showMessageDialog((Component)event.getSource(), "Your concern has been submitted","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                cname_tf.setText("");
                cmobile_tf.setText("");
                cmail_tf.setText("");
                cconcern_tf.setText("");

		  }}
		});
		contact.add(connect_button);
		
		
		
		JLabel connect_heading = new JLabel("Connect With Us");
		connect_heading.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 24));
		connect_heading.setBounds(73, 6, 231, 37);
		contact.add(connect_heading);
		
		JLabel discussion_heading = new JLabel("Discussion Forum");
		discussion_heading.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 24));
		discussion_heading.setBounds(73, 462, 247, 37);
		contact.add(discussion_heading);
		
		
		JLabel name_connect = new JLabel("Name:");
		name_connect.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		name_connect.setBounds(83, 55, 80, 19);
		contact.add(name_connect);
		
		JLabel mobile_connect = new JLabel("Mobile No:");
		mobile_connect.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		mobile_connect.setBounds(83, 108, 101, 20);
		contact.add(mobile_connect);
		
		JLabel email_connect = new JLabel("Email (Optional):");
		email_connect.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		email_connect.setBounds(83, 161, 153, 20);
		contact.add(email_connect);
		
		cname_tf = new JTextField();
		cname_tf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cname_tf.setBounds(263, 49, 239, 27);
		contact.add(cname_tf);
		cname_tf.setColumns(10);
		
		cmobile_tf = new JTextField();
		cmobile_tf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cmobile_tf.setBounds(263, 103, 239, 27);
		contact.add(cmobile_tf);
		cmobile_tf.setColumns(10);
		
		cmail_tf = new JTextField();
		cmail_tf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cmail_tf.setBounds(263, 156, 239, 27);
		contact.add(cmail_tf);
		cmail_tf.setColumns(10);
		
		JLabel concern_heading = new JLabel("Your Concern:");
		concern_heading.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		concern_heading.setBounds(83, 193, 133, 19);
		contact.add(concern_heading);
		
		cconcern_tf = new JTextArea();
		cconcern_tf.setFont(new Font("Monospaced", Font.PLAIN, 15));
		cconcern_tf.setBounds(73, 211, 429, 156);
		contact.add(cconcern_tf);
		cconcern_tf.setColumns(10);
		
		
		
		JLabel discuss_name = new JLabel("Username: ");
		discuss_name.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_name.setBounds(83, 511, 116, 19);
		contact.add(discuss_name);
		
		JLabel discuss_location = new JLabel("Password:");
		discuss_location.setDisplayedMnemonic('*');
		discuss_location.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_location.setBounds(83, 542, 101, 27);
		contact.add(discuss_location);
		
		dname_tf = new JTextField();		
		dname_tf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dname_tf.setBounds(237, 505, 281, 27);
		contact.add(dname_tf);
		dname_tf.setColumns(10);
		
		pa_tf = new JPasswordField();		
		pa_tf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pa_tf.setBounds(237, 540, 281, 27);
		pa_tf.setColumns(10);
		contact.add(pa_tf);
		
		
		JLabel discuss_opinion = new JLabel("Your Opinion:");
		discuss_opinion.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_opinion.setBounds(83, 581, 133, 27);
		contact.add(discuss_opinion);
		
		dopinion_tf = new JTextArea();
		dopinion_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dopinion_tf.setBounds(237, 579, 591, 55);
		contact.add(dopinion_tf);		
		dopinion_tf.setColumns(10);
		
		chat_tf = new JTextArea();
		chat_tf.setFont(new Font("Monospaced", Font.PLAIN, 15));
		chat_tf.setBounds(6, 695, 1110, 233);
		chat_tf.setColumns(10);
		
		pb = new JProgressBar(1,100);    
		pb.setValue(0); 
		pb.setStringPainted(true); 
		pb.setBounds(830,505,200,25);
		pb.setVisible(false);
		contact.add(pb); 
		
  
		
		
			
			JLabel createacc= new JLabel("Don't have an account?! ");
			createacc.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			createacc.setBounds(423, 646, 209, 37);
			contact.add(createacc);
			
			
			JButton create=new JButton("Create One ");			//new frame: Createaccount.java
			create.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			create.setBounds(627, 646, 172, 37);
			create.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					
					Createaccount ca=new Createaccount();
					ca.setVisible(true);
				}
			});
			contact.add(create);
			
			
			JLabel info1 = new JLabel("If you have any queries or have any problems relayed to COVID-19 lockdown");
			info1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			info1.setBounds(734, 37, 633, 27);
			contact.add(info1);
			
			JLabel info2 = new JLabel("or related issues, please feel free to drop in.");
			info2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			info2.setBounds(734, 69, 633, 27);
			contact.add(info2);
			
			JLabel info3 = new JLabel("All your concerns will be conveyed to the MHRD or the MoFHW and we will ");
			info3.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			info3.setBounds(733, 108, 618, 20);
			contact.add(info3);
			
			JLabel info4 = new JLabel("ensure that they respond quick. ");
			info4.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			info4.setBounds(734, 136, 457, 37);
			contact.add(info4);
			
			JLabel info5 = new JLabel("We're happy to help you anytime :)");
			info5.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 20));
			info5.setBounds(734, 185, 633, 48);
			contact.add(info5);
			
			JLabel info6 = new JLabel("Also, feel free to share your opinion with people around related to COVID-19 ");
			info6.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			info6.setBounds(734, 245, 672, 27);
			contact.add(info6);
			
			JLabel info7 = new JLabel("issues in the discussion forum below.");
			info7.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			info7.setBounds(734, 274, 403, 27);
			contact.add(info7);
			
			JLabel lblForgotPassword = new JLabel("Forgot password? ");
			lblForgotPassword.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			lblForgotPassword.setBounds(1116, 412, 172, 37);
			contact.add(lblForgotPassword);
			
			txt = new JLabel("Fill in these details to generate new password ");
			txt.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 17));
			txt.setBounds(1116,460,408,20);
			contact.add(txt);
			
			fname = new JLabel("Name: ");
			fname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 17));
			fname.setBounds(1116,513,108,20);
			contact.add(fname);
			
			fname_tf = new JTextField();
			fname_tf.setBounds(1216,503,216,27);
			contact.add(fname_tf);
			
			
		    
		    phone = new JLabel("Mobile no.: ");
			phone.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 17));
			phone.setBounds(1116,561,108,20);
			contact.add(phone);
			

			phone_tf = new JTextField();
			phone_tf.setBounds(1216,558,216,27);
			contact.add(phone_tf);
			
			generate_pass = new JButton("Generate Password");
			generate_pass.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae)
				{
					c=1;
					if(fname_tf.getText().equals("")  || phone_tf.getText().equals("")) {
						JOptionPane.showMessageDialog((Component)ae.getSource(),"Please fill all the fields","Error", JOptionPane.ERROR_MESSAGE);
					}
					else if(phone_tf.getText().length()!=10)
						JOptionPane.showMessageDialog((Component)ae.getSource(), "Please enter a valid phone number","Error",JOptionPane.ERROR_MESSAGE);    
					else {
					String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";                
					 sb = new StringBuilder(); 

					for (int i = 0; i < 6; i++) { 
					int index = (int)(characters.length() * Math.random()); 								
					 sb.append(characters.charAt(index));           
					}
					JOptionPane.showMessageDialog((Component)ae.getSource(),"Your new password :"+sb.toString(),"Reset", JOptionPane.INFORMATION_MESSAGE);
					fname_tf.setText("");
					phone_tf.setText("");
					}
				}
			});
			generate_pass.setBounds(1146, 619, 209, 37);
			generate_pass.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
			contact.add(generate_pass);
			
			
			
				
				
				JButton discuss_submit = new JButton(" Post ");
				discuss_submit.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
				discuss_submit.setBounds(271, 645, 108, 37);
				discuss_submit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) 
					{
						if(dname_tf.getText().equals("") || dopinion_tf.getText().equals("") || pa_tf.getText().trim().isEmpty()) {
							JOptionPane.showMessageDialog((Component)event.getSource(),"Please fill all the fields","Error", JOptionPane.ERROR_MESSAGE);
						}
						else if(c==0) {
						int i = 0; 
						pb.setVisible(true);
				        try { 
				            while (i <= 100) { 		              
				                pb.setString("posting"); 		                
				                Thread.sleep(100); 
				                pb.paintImmediately(0,0,200,25);
				                pb.setValue(i);
				                i=i+10; 
				            } 
				            pb.setVisible(false);
				        } 
				        catch (Exception e) { 
				        } 
						chat_tf.append(dname_tf.getText()+" : "+dopinion_tf.getText()+"\n");		
						}
						else {
							if(dname_tf.getText().equals("") || dopinion_tf.getText().equals("") || pa_tf.getText().trim().isEmpty()) 
								JOptionPane.showMessageDialog((Component)event.getSource(),"Please fill all the fields","Error", JOptionPane.ERROR_MESSAGE);
							
							else if(pa_tf.getText().equals(sb.toString())) {
								int j=0;
								pb.setVisible(true);
						        try { 
						            while (j <= 100) { 		              
						                pb.setString("posting"); 		                
						                Thread.sleep(100); 
						                pb.paintImmediately(0,0,200,25);
						                pb.setValue(j);
						                j=j+10; 
						            } 
						            pb.setVisible(false);
						        } 
						        catch (Exception e) { 
						        }
						        
						        
								//chat_tf.append(dname_tf.getText()+" : "+dopinion_tf.getText()+"\n");

								}
							else 
								JOptionPane.showMessageDialog((Component)event.getSource(),"Invalid Password","Error", JOptionPane.ERROR_MESSAGE);
							

							}

					try 
					{
                        
                        FileWriter fw = new FileWriter(file_discussion,true);
                        BufferedWriter br = new BufferedWriter(fw);
                        StringBuilder sb = new StringBuilder();
    					for (int i=0; i < 1; i++) 
    					{
							sb.append(dname_tf.getText()+":"+dopinion_tf.getText()+"\n");
						}
					br.write(sb.toString());
    				br.close();	
                    }
                    catch(IOException ex) 
                    {
                        System.out.println(
                            "Error writing to file '"+ file_discussion + "'");
                    }

                    
                	dopinion_tf.setText("");
                	String fileResult = "";                 
                	try 
                	{
                		BufferedReader csvReader = new BufferedReader(new FileReader("discussion.csv"));
                		String line = null;
                		while ((line = csvReader.readLine()) != null) 
                		{
   
                    		fileResult = fileResult+line+"\n";
                		}
                	}
                	catch(FileNotFoundException ex) 
                	{
                    	System.err.println("File was not found");
                	}
                	catch(IOException ioe) 
                	{
                    	System.err.println("There was an error while reading the file");
                	}
                	chat_tf.setText(fileResult);
                	dname_tf.setText("");
                	pa_tf.setText("");
                	dopinion_tf.setText("");							
				}

					});
				contact.add(discuss_submit);
				
				contact.add(chat_tf);
					/*
					JButton save_csv = new JButton("Save to Csv");
					save_csv.addActionListener(new ActionListener() {
						@Override  
					public void actionPerformed(ActionEvent ae) 
					{
						nameid=cname_tf.getText();
				 		mobileid=cmobile_tf.getText();
				 		mailid	=cmail_tf.getText();
			     		concernid=cconcern_tf.getText();
		    
		    			if(cname_tf.getText().equals("")||cmobile_tf.getText().equals("")||cconcern_tf.getText().equals("")) 
		    				JOptionPane.showMessageDialog((Component)ae.getSource(),"Please fill all the fields","Error", JOptionPane.ERROR_MESSAGE);
			  
		    			else if(cmobile_tf.getText().length()!=10)
		    				JOptionPane.showMessageDialog((Component)ae.getSource(), "Please enter a valid phone number","Error",JOptionPane.ERROR_MESSAGE);    
			  
		    			else
		    			{
		    				
                    		try 
                    		{
                       
                        		FileWriter fw = new FileWriter(fileName,true);
								BufferedWriter br = new BufferedWriter(fw);
								StringBuilder sb = new StringBuilder();
								for(int i=0; i<1; i++)
								{
									sb.append("\"Name\","+"\""+cname_tf.getText()+"\"");
									sb.append("\"Mobile\","+"\""+cmobile_tf.getText()+"\"");
									sb.append("\"Email\","+"\""+cmail_tf.getText()+"\"");
									sb.append("\"Concern\","+"\""+cconcern_tf.getText()+"\"");
								}
								br.write(sb.toString());
    							br.close();
                        
                    		}
                    		catch(IOException ex) 
                    		{
                        	System.out.println("Error writing to file '"+ fileName + "'");
                        
                    		}
                    		JOptionPane.showMessageDialog((Component)ae.getSource(), "Your concern has been submitted","Confirmation",JOptionPane.INFORMATION_MESSAGE);
   
                    	}
						}
						});
					save_csv.setFont(new Font("DejaVu Sans", Font.BOLD | Font.ITALIC, 16));
					save_csv.setBounds(439, 392, 142, 34);
					contact.add(save_csv);*/
		
		JPanel admin = new JPanel();
		admin.setBackground(new Color(224, 255, 255));
		admin.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 18));
		tabbedPane.addTab("Admin Login", null, admin, null);
		admin.setLayout(null);
		
		JLabel admin_heading = new JLabel("Admin Login");
		admin_heading.setBackground(new Color(0, 0, 0));
		admin_heading.setForeground(new Color(0, 0, 0));
		admin_heading.setFont(new Font("Dialog", Font.BOLD, 39));
		admin_heading.setBounds(888, 6, 325, 93);
		admin.add(admin_heading);
		
		JLabel admin_usr = new JLabel("Username: ");//Drishtiadmin@2020
		admin_usr.setFont(new Font("Segoe UI Emoji", Font.BOLD, 23));
		admin_usr.setBounds(734, 311, 150, 47);
		admin.add(admin_usr);
		
		tf_username = new JTextField();
		tf_username.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		tf_username.setBounds(883, 311, 393, 47);
		admin.add(tf_username);
		tf_username.setColumns(10);
		
		JLabel admin_pass = new JLabel("Password: ");//dri_439
		admin_pass.setBackground(new Color(224, 255, 255));
		admin_pass.setDisplayedMnemonic('*');
		admin_pass.setFont(new Font("Segoe UI Emoji", Font.BOLD, 23));
		admin_pass.setBounds(742, 385, 142, 39);
		admin.add(admin_pass);
		
		tf_password = new JPasswordField();
		tf_password.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		tf_password.setEchoChar('*');
		tf_password.setBounds(883, 380, 399, 49);
		admin.add(tf_password);
		
		
		JButton admin_login = new JButton("Login ");			//new frame:Adminlogin.java
		
		admin_login.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{								
				
				if(tf_username.getText().equals("Drishtiadmin@2020") && tf_password.getText().equals("dri_439"))
				{
					JOptionPane.showMessageDialog((Component)event.getSource(),"Successfully signed in!","Log in", JOptionPane.INFORMATION_MESSAGE);					 					 
					
									
					//File myCSVFile; 
					//Change the path of the file above or if you wanna open with some other application 
					String execString = "gedit " + myCSVFile.getAbsolutePath();
					String vol_execute = "gedit " + volFile.getAbsolutePath();
					Runtime run = Runtime.getRuntime();
					try 
					{
    					Process pp = run.exec(execString);
    					Process pv = run.exec(vol_execute);
					} 
					catch(Exception e) 
					{
    					e.printStackTrace();
					}
				}
				else
				{
					JOptionPane.showMessageDialog((Component)event.getSource(),"Invalid user id or password","Error", JOptionPane.ERROR_MESSAGE);
				}



				if(tf_username.getText().equals("Drishtiadmin@2020") && tf_password.getText().equals("dri_439"))
				{
					JOptionPane.showMessageDialog((Component)event.getSource(),"Successfully signed in!","Log in", JOptionPane.INFORMATION_MESSAGE);					 					 
					 Adminlogin adlog=new Adminlogin(nameid,mobileid,mailid,concernid);					
					adlog.setVisible(true);
				}
				else
				
					JOptionPane.showMessageDialog((Component)event.getSource(),"Invalid user id or password","Error", JOptionPane.ERROR_MESSAGE);
				
			}
		});

		admin_login.setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));
		admin_login.setBounds(954, 483, 187, 49);
		admin.add(admin_login);
		
		JLabel adminicon = new JLabel("New label");
		adminicon.setIcon(new ImageIcon("loginpageadmin.png"));
		adminicon.setBounds(899, 81, 200, 200);
		admin.add(adminicon);
		
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("bg_1.jpg"));
		lblNewLabel_11.setBounds(0, 0, 1860, 954);
		admin.add(lblNewLabel_11);
		
		tabbedPane.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent ce)
			{
				int index = tabbedPane.getSelectedIndex();
				if(index == 6)
				{
					time.start();
				}
			}
		});
		

		time = new Timer(1, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				stat_display.setText(Integer.toString(k));
				k++;
				if(k == 3932656)
				{
					time.stop();
				}
			}
		});
			
			
			
			
/*			  Scanner sc = new Scanner(new File("/home/sahithi/Desktop/oop-project/sample.txt"));
			  
			  StringBuilder sb = new StringBuilder();
			  
			  while (sc.hasNextLine()) {
			     sb.append(sc.nextLine());
			  }
			   fileContents = sb.toString();
			  int j=Integer.parseInt(fileContents);
			  sc.close();*/
			
			tm = new Timer(50, new ActionListener() {
				   
				   @Override
				   public void actionPerformed(ActionEvent e) {
				    
				    label.setText(Integer.toString(i));
				    i++;
					if(i==j+2)
					tm.stop();	
					k=j+1;
					String newLine = Integer.toString(k);
				    
				    fileContents = fileContents.replaceAll(fileContents, newLine);
				   
				    FileWriter writer;
					try {
						writer = new FileWriter("sample.txt",false);
						 writer.write(fileContents);
						    writer.flush();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				   }
				  });
			
			
			
		
		JPanel logo_panel = new JPanel();
		logo_panel.setBounds(50, 0, 162, 46);
		contentPane.add(logo_panel);
		logo_panel.setLayout(null);
		
		JLabel logo_icon = new JLabel("");
		logo_icon.setIcon(new ImageIcon("small_logo.png"));
		logo_icon.setBounds(0, 0, 56, 46);
		logo_panel.add(logo_icon);
		
		JPanel helpline_panel = new JPanel();
		helpline_panel.setBackground(new Color(255, 182, 193));
		helpline_panel.setBounds(1176, 6, 465, 61);
		contentPane.add(helpline_panel);
		helpline_panel.setLayout(null);
		
		JLabel label_helpline = new JLabel("Helpline for the corona virus: +91-11-23978046");
		label_helpline.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 18));
		label_helpline.setBounds(6, 20, 533, 30);
		helpline_panel.add(label_helpline);
			
	}
}
