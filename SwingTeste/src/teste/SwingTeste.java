package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.Scanner;
public class SwingTeste extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField insertN1;
	private JTextField insertN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingTeste frame = new SwingTeste();
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
	public SwingTeste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		insertN1 = new JTextField();
		insertN1.setBounds(22, 87, 50, 50);
		contentPane.add(insertN1);
		insertN1.setColumns(10);
		
		JButton btnEquals = new JButton("=");

		btnEquals.setBounds(258, 99, 90, 26);
		contentPane.add(btnEquals);
		
		JLabel lblRes = new JLabel("0");
		lblRes.setFont(new Font("Liberation Sans", Font.PLAIN, 20));
		lblRes.setBounds(374, 91, 16, 36);
		contentPane.add(lblRes);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1, n2, sm;
				Scanner entry = new Scanner(System.in);
				n1 = Integer.parseInt(insertN1.getText());
				n2 = Integer.parseInt(insertN2.getText());
				sm = n1 + n2;
				lblRes.setText(Integer.toString(sm));
			}
		});
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setBounds(107, 105, 55, 14);
		contentPane.add(lblNewLabel_1);
		
		insertN2 = new JTextField();
		insertN2.setColumns(10);
		insertN2.setBounds(149, 87, 50, 50);
		contentPane.add(insertN2);
	}
}
