package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Agendar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField valorField;
	private JTextField dataField;
	private JTextField horaFild;
	private JTextField obcervacaoField;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agendar frame = new Agendar();
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
	public Agendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null},
				{null, null, null},
			},
			new String[] {
				"Nome", "Serviço", "Valor"
			}
		));
		table.setBounds(56, 311, 472, 32);
		contentPane.add(table);
		
		JToggleButton agendarToggleButton = new JToggleButton("AGENDAR");
		agendarToggleButton.setBackground(Color.GREEN);
		agendarToggleButton.setBounds(389, 167, 121, 23);
		contentPane.add(agendarToggleButton);
		
		obcervacaoField = new JTextField();
		obcervacaoField.setBounds(374, 75, 154, 64);
		contentPane.add(obcervacaoField);
		obcervacaoField.setColumns(10);
		
		JLabel obcervacaoLabel = new JLabel("Obcervações:");
		obcervacaoLabel.setForeground(new Color(255, 255, 255));
		obcervacaoLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		obcervacaoLabel.setBounds(279, 78, 86, 14);
		contentPane.add(obcervacaoLabel);
		
		JComboBox servicoBox = new JComboBox();
		servicoBox.setBounds(125, 123, 86, 22);
		contentPane.add(servicoBox);
		
		JComboBox nomeBox = new JComboBox();
		nomeBox.setModel(new DefaultComboBoxModel(new String[] {"Alan", "Pedro", "João"}));
		nomeBox.setBounds(125, 75, 86, 22);
		contentPane.add(nomeBox);
		
		JLabel horaLabel = new JLabel("Hora:");
		horaLabel.setForeground(Color.WHITE);
		horaLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		horaLabel.setBounds(56, 258, 46, 14);
		contentPane.add(horaLabel);
		
		JLabel dataLabel = new JLabel("Data:");
		dataLabel.setForeground(Color.WHITE);
		dataLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dataLabel.setBounds(56, 213, 46, 14);
		contentPane.add(dataLabel);
		
		JLabel valorRLabel = new JLabel("Valor R$:");
		valorRLabel.setForeground(Color.WHITE);
		valorRLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		valorRLabel.setBounds(56, 170, 59, 14);
		contentPane.add(valorRLabel);
		
		JLabel servicoLabel = new JLabel("Serviço:");
		servicoLabel.setForeground(Color.WHITE);
		servicoLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		servicoLabel.setBounds(56, 126, 59, 14);
		contentPane.add(servicoLabel);
		
		horaFild = new JTextField();
		horaFild.setColumns(10);
		horaFild.setBounds(125, 256, 86, 20);
		contentPane.add(horaFild);
		
		dataField = new JTextField();
		dataField.setColumns(10);
		dataField.setBounds(125, 211, 86, 20);
		contentPane.add(dataField);
		
		valorField = new JTextField();
		valorField.setColumns(10);
		valorField.setBounds(125, 168, 86, 20);
		contentPane.add(valorField);
		
		JLabel agendaLabel = new JLabel("Agenda");
		agendaLabel.setForeground(new Color(0, 0, 0));
		agendaLabel.setBackground(new Color(0, 0, 0));
		agendaLabel.setFont(new Font("Arial", Font.BOLD, 20));
		agendaLabel.setBounds(257, 11, 78, 20);
		contentPane.add(agendaLabel);
		
		JLabel nomeLabel = new JLabel("Nome: ");
		nomeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nomeLabel.setForeground(new Color(255, 255, 255));
		nomeLabel.setBounds(56, 78, 46, 14);
		contentPane.add(nomeLabel);
		
		JLabel painelLabel = new JLabel();
		painelLabel.setIcon(new ImageIcon("C:\\Users\\njula\\eclipse-workspace\\SistemBarbearia\\barbearia\\barbeariaImg\\painelLogin1.png"));
		painelLabel.setBounds(-40, -53, 657, 548);
		contentPane.add(painelLabel);
		
		JLabel agendarLabel = new JLabel("");
		agendarLabel.setBounds(0, -15, 687, 486);
		agendarLabel.setIcon(new ImageIcon("C:\\Users\\njula\\eclipse-workspace\\SistemBarbearia\\barbearia\\barbeariaImg\\Agendar.png"));
		contentPane.add(agendarLabel);
	}
}
