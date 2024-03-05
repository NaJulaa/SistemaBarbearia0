package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {
	ImageIcon iconImage;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuarioField;
	private JLabel login;
	private JLabel usuarioLabel;
	private JLabel senhaLabel;
	private JPasswordField senhaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		senhaField = new JPasswordField();
		senhaField.setBounds(223, 321, 146, 20);
		contentPane.add(senhaField);
		
		senhaLabel = new JLabel("Senha:");
		senhaLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		senhaLabel.setForeground(new Color(255, 255, 255));
		senhaLabel.setBounds(261, 282, 80, 14);
		contentPane.add(senhaLabel);
		
		usuarioLabel = new JLabel("Usuário:");
		usuarioLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		usuarioLabel.setForeground(new Color(255, 255, 255));
		usuarioLabel.setBounds(261, 194, 80, 14);
		contentPane.add(usuarioLabel);
		
		login = new JLabel("LOGIN\r\n");
		login.setForeground(new Color(255, 255, 255));
		login.setFont(new Font("Tahoma", Font.BOLD, 20));
		login.setBounds(261, 103, 80, 36);
		contentPane.add(login);
		
		usuarioField = new JTextField();
		usuarioField.setBounds(223, 236, 145, 20);
		contentPane.add(usuarioField);
		usuarioField.setColumns(10);
		
		JLabel painelLogin = new JLabel();
		painelLogin.setIcon(new ImageIcon("C:\\Users\\njula\\eclipse-workspace\\SistemBarbearia\\barbearia\\barbeariaImg\\painelLogin1.png"));
		painelLogin.setBounds(120, 77, 325, 390);
		contentPane.add(painelLogin);
		
		JLabel loginLabel = new JLabel();
		loginLabel.setForeground(new Color(0, 0, 0));
		loginLabel.setBounds(-18, 0, 626, 626);
		loginLabel.setIcon(new ImageIcon("C:\\Users\\njula\\eclipse-workspace\\SistemBarbearia\\barbearia\\barbeariaImg\\logoImg.jpg"));
		contentPane.add(loginLabel);
		setSize(610,700);
		contentPane.add(loginLabel);
	}
}
