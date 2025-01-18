package aulas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
public class SwingOperator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textN1;
	private JTextField textN2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingOperator frame = new SwingOperator();
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
	public SwingOperator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 242, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textN1 = new JTextField();
		textN1.setBounds(115, 28, 86, 18);
		contentPane.add(textN1);
		textN1.setColumns(10);
		
		textN2 = new JTextField();
		textN2.setBounds(115, 71, 86, 18);
		contentPane.add(textN2);
		textN2.setColumns(10);

		JLabel lblRes1 = new JLabel("0");
		lblRes1.setBounds(169, 173, 55, 14);
		contentPane.add(lblRes1);
		
		JLabel lblRes2 = new JLabel("0");
		lblRes2.setBounds(169, 207, 55, 14);
		contentPane.add(lblRes2);
		JButton btnDivision = new JButton("Dividir");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(textN1.getText()), n2 = Integer.parseInt(textN2.getText());
				Scanner entry = new Scanner(System.in);
				float div = n1/n2;
				double res = Math.sqrt(n1);
				lblRes1.setText(Float.toString(div));
				lblRes2.setText(Double.toString(res));
			}
		});
		btnDivision.setBounds(103, 110, 98, 24);
		contentPane.add(btnDivision);
		
		JLabel lblNewLabel = new JLabel("Divisao:");
		lblNewLabel.setBounds(73, 173, 55, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sqrt:");
		lblNewLabel_1.setBounds(73, 207, 55, 14);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("Numerador:");
		lblNewLabel_3.setBounds(12, 30, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Denominador:");
		lblNewLabel_4.setBounds(12, 73, 85, 14);
		contentPane.add(lblNewLabel_4);
	}
}
