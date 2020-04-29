import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
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

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField cname_tf;
	private JTextField cmobile_tf;
	private JTextField cmail_tf;
	private JTextField cconcern_tf;
	private JTextField dname_tf;
	private JTextField dlocation_tf;
	private JTextField dopinion_tf;
	private JTextField chat_tf;

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
		setSize(1920,1080);
		setTitle("Fight Corona With Drishti");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tabbedPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		tabbedPane.setSize(new Dimension(1920, 0));
		tabbedPane.setBounds(6, 54, 1914, 1026);
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
		bg_image.setMinimumSize(new Dimension(1920, 1080));
		bg_image.setIcon(new ImageIcon("/home/sahithi/virus.jpeg"));
		bg_image.setPreferredSize(new Dimension(1920, 1080));
		bg_image.setMaximumSize(new Dimension(1920, 1080));
		about.add(bg_image);
		
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
		
		JLabel lblNewLabel = new JLabel("Gandhi Medical College, Secunderabad");
		lblNewLabel.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(143, 157, 294, 21);
		testing_centres.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Osmania Medical College, Hyderabad");
		lblNewLabel_1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(143, 220, 272, 27);
		testing_centres.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sir Roland Ross Institute, Nallakunta");
		lblNewLabel_2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(143, 295, 272, 21);
		testing_centres.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nizam's Institute of Medical Sciences, Hyderabad");
		lblNewLabel_3.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(104, 358, 363, 27);
		testing_centres.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Institute of Preventive Medicine, Hyderabad");
		lblNewLabel_4.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(130, 427, 331, 27);
		testing_centres.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ESIC Medical College, Hyderabad");
		lblNewLabel_5.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5.setBounds(174, 502, 263, 21);
		testing_centres.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CCMB, Hyderabad");
		lblNewLabel_6.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(208, 571, 207, 21);
		testing_centres.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Centre for DNA Fingerprinting and Diagnostics, Hyderabad");
		lblNewLabel_7.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7.setBounds(71, 640, 437, 21);
		testing_centres.add(lblNewLabel_7);
		
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
		
		JButton btn2 = new JButton("Directions");
		btn2.addActionListener(new ActionListener() {
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
		btn2.setBounds(1512, 180, 110, 27);
		testing_centres.add(btn2);
		
		JButton btn3 = new JButton("Directions");
		btn3.addActionListener(new ActionListener() {
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
		btn3.setBounds(1512, 235, 110, 27);
		testing_centres.add(btn3);
		
		JButton btn4 = new JButton("Directions");
		btn4.addActionListener(new ActionListener() {
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
		btn4.setBounds(1512, 290, 110, 27);
		testing_centres.add(btn4);
		
		JButton btn5 = new JButton("Directions");
		btn5.addActionListener(new ActionListener() {
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
		btn5.setBounds(1512, 332, 110, 27);
		testing_centres.add(btn5);
		
		JButton btn6 = new JButton("Directions");
		btn6.addActionListener(new ActionListener() {
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
		btn6.setBounds(1512, 379, 110, 27);
		testing_centres.add(btn6);
		
		JButton btn7 = new JButton("Directions");
		btn7.addActionListener(new ActionListener() {
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
		btn7.setBounds(1512, 427, 110, 27);
		testing_centres.add(btn7);
		
		JButton btn8 = new JButton("Directions");
		btn8.addActionListener(new ActionListener() {
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
		btn8.setBounds(1512, 486, 110, 27);
		testing_centres.add(btn8);
		
		JButton btn9 = new JButton("Directions");
		btn9.addActionListener(new ActionListener() {
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
		btn9.setBounds(1512, 533, 110, 27);
		testing_centres.add(btn9);
		
		JButton btn10 = new JButton("Directions");
		btn10.addActionListener(new ActionListener() {
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
		btn10.setBounds(1512, 585, 110, 27);
		testing_centres.add(btn10);
		
		JButton btn11 = new JButton("Directions");
		btn11.addActionListener(new ActionListener() {
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
		btn11.setBounds(1512, 635, 110, 27);
		testing_centres.add(btn11);
		
		JLabel lblNewLabel_8 = new JLabel("*Important Note:");
		lblNewLabel_8.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_8.setBounds(649, 821, 144, 15);
		testing_centres.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("All the information provided has been taken from verified sources");
		lblNewLabel_9.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_9.setBounds(780, 820, 481, 16);
		testing_centres.add(lblNewLabel_9);
		
		JPanel precautions = new JPanel();
		tabbedPane.addTab("    Precautions     ", null, precautions, null);
		
		JLabel precaution_bg = new JLabel("");
		precaution_bg.setIcon(new ImageIcon("/home/sahithi/Downloads/precautions.jpg"));
		precautions.add(precaution_bg);
		
		JPanel faqs = new JPanel();
		tabbedPane.addTab("     FAQs    ", null, faqs, null);
		
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
		cname_tf.setBounds(263, 49, 239, 27);
		contact.add(cname_tf);
		cname_tf.setColumns(10);
		
		cmobile_tf = new JTextField();
		cmobile_tf.setBounds(263, 103, 239, 27);
		contact.add(cmobile_tf);
		cmobile_tf.setColumns(10);
		
		cmail_tf = new JTextField();
		cmail_tf.setBounds(263, 156, 239, 27);
		contact.add(cmail_tf);
		cmail_tf.setColumns(10);
		
		JLabel concern_heading = new JLabel("Your Concern:");
		concern_heading.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		concern_heading.setBounds(83, 193, 133, 19);
		contact.add(concern_heading);
		
		cconcern_tf = new JTextField();
		cconcern_tf.setBounds(73, 211, 429, 156);
		contact.add(cconcern_tf);
		cconcern_tf.setColumns(10);
		
		JButton connect_button = new JButton("Submit");
		connect_button.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		connect_button.setBounds(237, 389, 142, 37);
		contact.add(connect_button);
		
		JLabel discuss_name = new JLabel("Name:");
		discuss_name.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_name.setBounds(83, 511, 80, 19);
		contact.add(discuss_name);
		
		JLabel discuss_location = new JLabel("Location:");
		discuss_location.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_location.setBounds(83, 542, 101, 27);
		contact.add(discuss_location);
		
		dname_tf = new JTextField();
		dname_tf.setBounds(237, 505, 281, 27);
		contact.add(dname_tf);
		dname_tf.setColumns(10);
		
		dlocation_tf = new JTextField();
		dlocation_tf.setBounds(237, 540, 281, 27);
		contact.add(dlocation_tf);
		dlocation_tf.setColumns(10);
		
		JLabel discuss_opinion = new JLabel("Your Opinion:");
		discuss_opinion.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_opinion.setBounds(83, 581, 133, 27);
		contact.add(discuss_opinion);
		
		dopinion_tf = new JTextField();
		dopinion_tf.setBounds(237, 579, 591, 55);
		contact.add(dopinion_tf);
		dopinion_tf.setColumns(10);
		
		JButton discuss_submit = new JButton("Submit");
		discuss_submit.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD | Font.ITALIC, 16));
		discuss_submit.setBounds(261, 646, 118, 37);
		contact.add(discuss_submit);
		
		chat_tf = new JTextField();
		chat_tf.setBounds(6, 717, 1789, 211);
		contact.add(chat_tf);
		chat_tf.setColumns(10);
		
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
		
		
		
			
	}
}
