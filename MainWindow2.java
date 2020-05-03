package javaproject;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java .awt.event.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.util.Arrays;

 public class MainWindow2 extends JFrame {

	private JPanel contentPane;
	private JTextField cname_tf;
	private JTextField cmobile_tf;
	private JTextField cmail_tf;
	private JTextArea cconcern_tf;  //Changed from JTextField as JTextField is only for single line entry
	private JTextField dname_tf;
	private JPasswordField pa_tf;
	private JTextField dopinion_tf;
	private JTextArea chat_tf;      //Changed from JTextField as JTextField is only for single line entry
	private JTextField tf_username;
	private JPasswordField tf_password;
	String nameid,mobileid,mailid,concernid;
	private JProgressBar pb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{
					MainWindow2 frame = new MainWindow2();
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
	 */
	public MainWindow2() {
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
		tabbedPane.setBounds(6, 54, 1914, 1026);
		tabbedPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tabbedPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(tabbedPane);
		
		JPanel home = new JPanel();
		home.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		home.setPreferredSize(new Dimension(320, 50));
		tabbedPane.addTab("Home", null, home, null);
		home.setLayout(null);
		
		JLabel Header = new JLabel("Fight Corona With Drishti  ");
		Header.setBounds(new Rectangle(654, 50, 605, 52));
		Header.setMaximumSize(new Dimension(1920, 50));
		Header.setBackground(SystemColor.desktop);
		Header.setForeground(SystemColor.desktop);
		Header.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 42));
		home.add(Header);
		
		JLabel bg_image = new JLabel("");
		bg_image.setBounds(-3, 152, 1920, 1080);
		bg_image.setMinimumSize(new Dimension(1920, 1080));
		bg_image.setIcon(new ImageIcon("virus.jpeg"));
		bg_image.setPreferredSize(new Dimension(1920, 1080));
		bg_image.setMaximumSize(new Dimension(1920, 1080));
		home.add(bg_image);
		
		JPanel logo = new JPanel();
		logo.setBounds(460, 6, 134, 134);
		home.add(logo);
		logo.setLayout(null);
		
		JLabel logolabel = new JLabel("");
		logolabel.setIcon(new ImageIcon("logo_drishti.png"));
		logolabel.setBounds(6, 0, 146, 134);
		logo.add(logolabel);
		
		JPanel about = new JPanel();
		about.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		tabbedPane.addTab("About Us", null, about, null);
		about.setLayout(null);
		
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
		
		JPanel precautions = new JPanel();
		tabbedPane.addTab("    Precautions     ", null, precautions, null);
		
		JLabel precaution_bg = new JLabel("");
		precaution_bg.setIcon(new ImageIcon("precautions.jpg"));
		precautions.add(precaution_bg);
		
		JPanel contact = new JPanel();
		contact.setBackground(new Color(255, 228, 225));
		tabbedPane.addTab("Connect With Us", null, contact, null);
		contact.setLayout(null);
		
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
		
		JButton connect_button = new JButton("Submit");
		connect_button.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		connect_button.setBounds(237, 389, 142, 37);
		connect_button.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent event)
		  {
		    
		    if(cname_tf.getText().equals("")||cmobile_tf.getText().equals("")||cconcern_tf.getText().equals("")) 
		    	JOptionPane.showMessageDialog((Component)event.getSource(),"Please fill all the fields","Error", JOptionPane.ERROR_MESSAGE);
			  
		    else if(cmobile_tf.getText().length()!=10)
		    	JOptionPane.showMessageDialog((Component)event.getSource(), "Please enter a valid phone number","Error",JOptionPane.ERROR_MESSAGE);    
			  
		    else
		    	JOptionPane.showMessageDialog((Component)event.getSource(), "Your concern has been submitted","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                       		    
		  }
		});
		contact.add(connect_button);
		
		JLabel discuss_name = new JLabel("Userid:");
		discuss_name.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_name.setBounds(83, 511, 80, 19);
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
		
		dopinion_tf = new JTextField();
		dopinion_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dopinion_tf.setBounds(237, 579, 591, 55);
		contact.add(dopinion_tf);		
		dopinion_tf.setColumns(10);
		
		chat_tf = new JTextArea();
		chat_tf.setFont(new Font("Monospaced", Font.PLAIN, 15));
		chat_tf.setBounds(6, 717, 1789, 211);
		chat_tf.setColumns(10);
		
		pb = new JProgressBar(1,100);    
        pb.setValue(0); 
        pb.setStringPainted(true); 
        pb.setBounds(830,505,200,25);
        pb.setVisible(false);
        contact.add(pb); 
        
  
		
		JButton discuss_submit = new JButton("Post");
		discuss_submit.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_submit.setBounds(261, 646, 118, 37);
		discuss_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(dname_tf.getText().equals("") || dopinion_tf.getText().equals("") || pa_tf.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog((Component)event.getSource(),"Please fill all the fields","Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
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
			}
				
			});
		contact.add(discuss_submit);
	
		contact.add(chat_tf);
		
		JLabel createacc= new JLabel("Don't have an account");
		createacc.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		createacc.setBounds(382, 646, 457, 37);
		contact.add(createacc);
		
		
		JButton create=new JButton("Create");
		create.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		create.setBounds(682, 646, 118, 37);
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				createaccount ca=new createaccount();
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
		
		JPanel donate = new JPanel();
		donate.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Donate Now", null, donate, null);
		donate.setLayout(null);
		
		JPanel description_pane = new JPanel();
		description_pane.setBackground(new Color(204, 255, 204));
		description_pane.setBounds(69, 101, 735, 733);
		donate.add(description_pane);
		description_pane.setLayout(null);
		
		JLabel logo_donate = new JLabel("");
		logo_donate.setIcon(new ImageIcon("/home/sahithi/Documents/4th Sem/OOP/Project/logo_drishti.png"));
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
		form_pane.setBackground(new Color(204, 255, 204));
		form_pane.setBounds(863, 101, 801, 791);
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
		quote3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openWebPage("https://pmnrf.gov.in/en/online-donation");
			}
		});
		quote3.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 24));
		quote3.setBounds(318, 385, 216, 76);
		form_pane.add(quote3);
		
		JPanel admin = new JPanel();
		admin.setBackground(new Color(255, 204, 204));
		admin.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 18));
		tabbedPane.addTab("Admin Login", null, admin, null);
		admin.setLayout(null);
		
		JLabel admin_heading = new JLabel("Admin Login");
		admin_heading.setFont(new Font("Segoe UI Emoji", Font.BOLD, 32));
		admin_heading.setBounds(899, 31, 268, 39);
		admin.add(admin_heading);
		
		JLabel admin_usr = new JLabel("Username:");//Drishtiadmin@2020
		admin_usr.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
		admin_usr.setBounds(734, 311, 113, 47);
		admin.add(admin_usr);
		
		tf_username = new JTextField();
		tf_username.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		tf_username.setBounds(859, 311, 399, 47);
		admin.add(tf_username);
		tf_username.setColumns(10);
		
		JLabel admin_pass = new JLabel("Password:");//dri_439
		admin_pass.setDisplayedMnemonic('*');
		admin_pass.setFont(new Font("Segoe UI Emoji", Font.BOLD, 21));
		admin_pass.setBounds(734, 385, 113, 39);
		admin.add(admin_pass);
		
		tf_password = new JPasswordField();
		tf_password.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		tf_password.setEchoChar('*');
		tf_password.setBounds(859, 380, 399, 49);
		admin.add(tf_password);
		
		
		
		
		JButton admin_login = new JButton("Login ");
		
		admin_login.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				char ch[]=tf_password.getPassword();
				char pass[]=new char[]{'d','r','i','_','4','3','9'};

				if(tf_username.getText().equals("Drishtiadmin@2020") && Arrays.equals(ch,pass))
				{
					JOptionPane.showMessageDialog((Component)event.getSource(),"Successfully signed in!","Log in", JOptionPane.INFORMATION_MESSAGE);
					
					 nameid=cname_tf.getText();
					 mobileid=cmail_tf.getText();
					 mailid	=cmobile_tf.getText();
				     concernid=cconcern_tf.getText();
					adminlogin adlog=new adminlogin(nameid,mobileid,mailid,concernid);
					
					adlog.setVisible(true);
					
				}
				else
				{
					JOptionPane.showMessageDialog((Component)event.getSource(),"Invalid user id or password","Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		admin_login.setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));
		admin_login.setBounds(979, 483, 130, 39);
		admin.add(admin_login);
		
		JLabel adminicon = new JLabel("New label");
		adminicon.setIcon(new ImageIcon("C:\\Users\\RAJENDRA REDDY\\loginpageadmin.png"));
		adminicon.setBounds(899, 81, 200, 200);
		admin.add(adminicon);
		
		JPanel logo_panel = new JPanel();
		logo_panel.setBounds(50, 0, 162, 46);
		contentPane.add(logo_panel);
		logo_panel.setLayout(null);
		
		JLabel logo_icon = new JLabel("");
		logo_icon.setIcon(new ImageIcon("small_logo.png"));
		logo_icon.setBounds(0, 0, 56, 46);
		logo_panel.add(logo_icon);
			
	}
}