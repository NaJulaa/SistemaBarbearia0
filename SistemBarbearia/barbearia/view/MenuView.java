package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class MenuView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView frame = new MenuView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MenuView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 569);
		//MenuBar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu cadastroMenu = new JMenu("CADASTRO");
		cadastroMenu.setFont(new Font("Segoe UI", Font.BOLD, 11));
		menuBar.add(cadastroMenu);
		
		
		JMenuItem itemCliente = new JMenuItem("Cliente");
		itemCliente.setIcon(new ImageIcon("C:\\Users\\njula\\eclipse-workspace\\SistemBarbearia\\barbearia\\barbeariaImg\\cliente1.png"));
		cadastroMenu.add(itemCliente);
		
		
		JMenuItem itemServico = new JMenuItem("Serviço");
		itemServico.setIcon(new ImageIcon("C:\\Users\\njula\\eclipse-workspace\\SistemBarbearia\\barbearia\\barbeariaImg\\serviço.png"));
		
		cadastroMenu.add(itemServico);
		
		JMenu operacaoMenu = new JMenu("OPERAÇÃO");
		operacaoMenu.setFont(new Font("Segoe UI", Font.BOLD, 11));
		menuBar.add(operacaoMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel menuLabel = new JLabel();
		menuLabel.setIcon(new ImageIcon("C:\\Users\\njula\\eclipse-workspace\\SistemBarbearia\\barbearia\\barbeariaImg\\menu.jpg"));
		setSize(700,710);
		contentPane.add(menuLabel);
	}

}
