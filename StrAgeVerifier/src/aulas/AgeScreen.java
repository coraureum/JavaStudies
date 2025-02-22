package aulas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgeScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgeScreen frame = new AgeScreen();
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
	public AgeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(45, 40, 114, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ano de nascimento");
		lblNewLabel.setBounds(45, 14, 114, 14);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setBounds(45, 154, 55, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAge = new JLabel("0");
		lblAge.setBounds(129, 154, 55, 14);
		contentPane.add(lblAge);
		
		JLabel lblNewLabel_3 = new JLabel("Situaçao:");
		lblNewLabel_3.setBounds(45, 195, 55, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblSit = new JLabel("");
		lblSit.setBounds(104, 195, 138, 14);
		contentPane.add(lblSit);
		JButton btnCalc = new JButton("Calcular ");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int year = 2025, year2, age;
				
				 year2 = Integer.parseInt(textField.getText());
				age = year - year2;
				lblAge.setText(Integer.toString(age));
				if (age >= 18 && age <70) {
					lblSit.setText("Voto obrigatorio");
				}
				else if ((age >= 16 && age < 18) || age > 70){
					lblSit.setText("Voto opcional");
				}
				else {
					lblSit.setText("Muito jovem para votar!");
				}
				
			}
		});
		btnCalc.setBounds(45, 70, 98, 24);
		contentPane.add(btnCalc);
		
	
	}

}
