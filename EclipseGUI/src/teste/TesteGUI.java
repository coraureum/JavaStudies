package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
public class TesteGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textN1;
	private JTextField textN2;
	private final JButton button = new JButton("=");
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteGUI frame = new TesteGUI();
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
	public TesteGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textN1 = new JTextField();
		textN1.setBounds(42, 91, 61, 41);
		contentPane.add(textN1);
		textN1.setColumns(10);
		
		textN2 = new JTextField();
		textN2.setColumns(10);
		textN2.setBounds(159, 91, 61, 41);
		contentPane.add(textN2);
		
		JLabel lblSum = new JLabel("+");
		lblSum.setBounds(121, 104, 20, 14);
		contentPane.add(lblSum);
		
		JLabel lblRes = new JLabel("0");
		lblRes.setBounds(351, 104, 55, 14);
		contentPane.add(lblRes);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1, n2, sum;
				Scanner entry = new Scanner(System.in);
				n1 = Integer.parseInt(textN1.getText());
				n2 = Integer.parseInt(textN2.getText());
				sum = n1 + n2;
				
				lblRes.setText(Integer.toString(sum));
			}
		});
		button.setBounds(242, 95, 76, 33);
		contentPane.add(button);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(42, 91, 61, 41);
		contentPane.add(textField_2);
	}
}
