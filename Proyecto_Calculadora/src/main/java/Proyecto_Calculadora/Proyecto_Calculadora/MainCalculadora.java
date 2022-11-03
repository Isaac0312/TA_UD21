package Proyecto_Calculadora.Proyecto_Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Calculadora aux;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainCalculadora frame = new MainCalculadora();
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
	public MainCalculadora() {
		aux = new Calculadora();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.setBounds(469, 396, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(469, 340, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setBounds(469, 286, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X");
		btnNewButton_3.setBounds(469, 236, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("%");
		btnNewButton_4.setBounds(469, 181, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("0");
		btnNewButton_5.setBounds(151, 396, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("1");
		btnNewButton_5_1.setBounds(51, 357, 89, 23);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("2");
		btnNewButton_5_2.setBounds(151, 357, 89, 23);
		contentPane.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("3");
		btnNewButton_5_3.setBounds(250, 357, 89, 23);
		contentPane.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("6");
		btnNewButton_5_4.setBounds(250, 323, 89, 23);
		contentPane.add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("5");
		btnNewButton_5_5.setBounds(151, 323, 89, 23);
		contentPane.add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("4");
		btnNewButton_5_6.setBounds(51, 323, 89, 23);
		contentPane.add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("7");
		btnNewButton_5_7.setBounds(51, 286, 89, 23);
		contentPane.add(btnNewButton_5_7);
		
		JButton btnNewButton_5_8 = new JButton("8");
		btnNewButton_5_8.setBounds(151, 286, 89, 23);
		contentPane.add(btnNewButton_5_8);
		
		JButton btnNewButton_5_9 = new JButton("9");
		btnNewButton_5_9.setBounds(250, 286, 89, 23);
		contentPane.add(btnNewButton_5_9);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(51, 135, 288, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Operadores");
		lblNewLabel.setBounds(51, 110, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(51, 166, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(51, 191, 288, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		
		btnNewButton_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		
		btnNewButton_5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		
		btnNewButton_5_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		
		btnNewButton_5_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		
		btnNewButton_5_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		
		btnNewButton_5_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		
		btnNewButton_5_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		
		btnNewButton_5_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		
		btnNewButton_5_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					aux.setOperador1(Integer.parseInt(textField.getText()));
					aux.setOperacio(1);
					textField.setText("");
			}
		});
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					aux.setOperador1(Integer.parseInt(textField.getText()));
					aux.setOperacio(2);
					textField.setText("");

				 
			}
		});
		
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					aux.setOperador1(Integer.parseInt(textField.getText()));
					aux.setOperacio(3);
					textField.setText("");
				
			}
		});
		
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					aux.setOperador1(Integer.parseInt(textField.getText()));
					aux.setOperacio(4);
					textField.setText("");
				 
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				aux.setOperador2(Integer.parseInt(textField.getText()));
				textField.setText("");
				textField_1.setText(Integer.toString(aux.operacio()));
				aux.setOperador2(aux.operacio());
			}
		});
	}
}
