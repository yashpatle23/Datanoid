package backend;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class zzzzz extends JFrame {

	private JPanel contentPane;
	private JTextField user_id;
	private JTextField password;
	private JTextField re_password;
	private JLabel lblNewLabel_3;
	private JTextField phone_no;
	private JLabel lblNewLabel_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtGamingIdCreation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zzzzz frame = new zzzzz();
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
	public zzzzz() {
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("\"C:\\Users\\Yash\\Desktop\\c+++\\college\\mini_projects\\image_processing20200204-16886-l1ze9q.png\""));
		setTitle("Gaming Id");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 512);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER_ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(66, 75, 68, 17);
		contentPane.add(lblNewLabel);
		
		user_id = new JTextField();
		user_id.setForeground(Color.BLACK);
		user_id.setBounds(203, 75, 145, 20);
		contentPane.add(user_id);
		user_id.setColumns(10);
		
		password = new JTextField();
		password.setForeground(Color.BLACK);
		password.setBounds(203, 123, 145, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWARD");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(66, 122, 86, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RE PASSWARD");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(66, 165, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		re_password = new JTextField();
		re_password.setForeground(Color.BLACK);
		re_password.setBounds(203, 159, 145, 20);
		contentPane.add(re_password);
		re_password.setColumns(10);
		
		lblNewLabel_3 = new JLabel("PHONE No.");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(66, 206, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		phone_no = new JTextField();
		phone_no.setForeground(Color.BLACK);
		phone_no.setBounds(203, 203, 145, 20);
		contentPane.add(phone_no);
		phone_no.setColumns(10);
		
		lblNewLabel_4 = new JLabel("COUNTRY");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(66, 246, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton india = new JRadioButton("INDIA");
		india.setBackground(Color.MAGENTA);
		india.setForeground(Color.WHITE);
		buttonGroup.add(india);
		india.setSelected(true);
		india.setBounds(203, 242, 109, 23);
		contentPane.add(india);
		
		JRadioButton other = new JRadioButton("OTHER");
		other.setBackground(Color.MAGENTA);
		other.setForeground(Color.WHITE);
		buttonGroup.add(other);
		other.setSelected(true);
		other.setBounds(336, 242, 109, 23);
		contentPane.add(other);
		
		JLabel lblNewLabel_5 = new JLabel("ADDRESS");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(66, 287, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JTextArea address = new JTextArea();
		address.setForeground(Color.BLACK);
		address.setBounds(204, 282, 169, 90);
		contentPane.add(address);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_id.setText("");
				password.setText("");
				re_password.setText("");
				address.setText("");
				phone_no.setText("");
				buttonGroup.clearSelection();
			}
		});
		reset.setForeground(Color.BLACK);
		reset.setFont(new Font("Tahoma", Font.BOLD, 15));
		reset.setBounds(161, 410, 95, 35);
		contentPane.add(reset);
		
		JButton create = new JButton("Create");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","*23122003#Yash");
					String query="insert into home values(?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,user_id.getText());
					if(password.getText().equals(re_password.getText())) ps.setString(3,password.getText());
					else {
						
					}
					if(india.isSelected())ps.setString(2, "INDIA");
					else if(other.isSelected()) ps.setString(2, "OTHER");
					ps.setString(4,address.getText());
					ps.setString(5,phone_no.getText());
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(create,i+" Record is submited succesfully");
					ps.close();
					con.close();
				}
				catch (Exception e1) {
					System.out.println(e1);
				} 
			}
		});
		create.setForeground(Color.BLACK);
		create.setFont(new Font("Tahoma", Font.BOLD, 15));
		create.setBounds(308, 410, 95, 31);
		contentPane.add(create);
		
		txtGamingIdCreation = new JTextField();
		txtGamingIdCreation.setForeground(new Color(255, 0, 255));
		txtGamingIdCreation.setBackground(new Color(75, 0, 130));
		txtGamingIdCreation.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtGamingIdCreation.setHorizontalAlignment(SwingConstants.CENTER);
		txtGamingIdCreation.setText("Gaming Id Creation");
		txtGamingIdCreation.setBounds(161, 11, 334, 50);
		contentPane.add(txtGamingIdCreation);
		txtGamingIdCreation.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Yash\\Desktop\\c+++\\college\\mini_projects\\image_processing20200204-16886-l1ze9q.png"));
		lblNewLabel_6.setBounds(0, 0, 710, 473);
		contentPane.add(lblNewLabel_6);
	}
}
