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

public class MainWindow extends JFrame {

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
		tabbedPane.addTab("Testing Centres", null, testing_centres, null);
		
		JPanel precautions = new JPanel();
		tabbedPane.addTab("    Precautions     ", null, precautions, null);
		
		JLabel precaution_bg = new JLabel("");
		precaution_bg.setIcon(new ImageIcon("/home/sahithi/Downloads/precautions.jpg"));
		precautions.add(precaution_bg);
		
		JPanel faqs = new JPanel();
		tabbedPane.addTab("     FAQs    ", null, faqs, null);
		
		JPanel contact = new JPanel();
		tabbedPane.addTab("Connect With Us", null, contact, null);
	}
}
