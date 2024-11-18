import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class Tela1 {

	private JFrame frame; //usar o frame
	private JTextField textField_2;
	// frame --> Jamela --> Paineis --> componentes

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(600, 600, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insira seu nome: ");
		lblNewLabel.setBounds(26, 24, 127, 26);
		frame.getContentPane().add(lblNewLabel);
		
		TextField nome = new TextField();
		nome.setText("insira seu nome");
		nome.setBounds(26, 52, 236, 22);
		frame.getContentPane().add(nome);
		
		JLabel email = new JLabel("Insira seu email: ");
		email.setBounds(26, 80, 127, 26);
		frame.getContentPane().add(email);
	
		
		TextField textField_1 = new TextField();
		textField_1.setText("insira seu email");
		textField_1.setBounds(26, 108, 236, 22);
		frame.getContentPane().add(textField_1);
		
		Checkbox checkbox = new Checkbox("Feminino");
		checkbox.setBounds(39, 150, 95, 22);
		frame.getContentPane().add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Masculino");
		checkbox_1.setBounds(39, 176, 95, 22);
		frame.getContentPane().add(checkbox_1);
		
		Button btenviar = new Button("aperte em mim!");
		btenviar.setBackground(new Color(255, 160, 122));
		btenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btenviar.setBounds(246, 257, 101, 40);
		frame.getContentPane().add(btenviar);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Bananas");
		textField_2.setBounds(303, 52, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		Button sair = new Button("sair!");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sair.setBackground(new Color(255, 160, 122));
		sair.setBounds(106, 257, 101, 40);
		frame.getContentPane().add(sair);
		

		
		
		btenviar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String name = nome.getText();
				String ema = email.getText();
				JOptionPane.showMessageDialog(null, "\nnome: "+name+ "\nemail: "+ema);
			}
		});
		
		btenviar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				nome.setText("");
				email.setText("");
			}
		});
		sair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});







		
		
		
	
	}
}
