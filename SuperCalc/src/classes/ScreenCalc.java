package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenCalc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenCalc frame = new ScreenCalc();
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
	public ScreenCalc() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite um valor");
		lblNewLabel.setBounds(12, 12, 95, 14);
		contentPane.add(lblNewLabel);
		
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(125, 10, 86, 18);
		contentPane.add(spinner);
		
		JPanel calcPan = new JPanel();
		calcPan.setBounds(12, 133, 199, 125);
		contentPane.add(calcPan);
		calcPan.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Resto por 2");
		lblNewLabel_1.setBounds(12, 12, 73, 14);
		calcPan.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Elevado ao cubo");
		lblNewLabel_2.setBounds(12, 38, 108, 14);
		calcPan.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Raiz   quadrada");
		lblNewLabel_3.setBounds(12, 64, 87, 14);
		calcPan.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Raiz cubica");
		lblNewLabel_4.setBounds(12, 90, 87, 14);
		calcPan.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Valor  absoluto");
		lblNewLabel_5.setBounds(12, 111, 97, 14);
		calcPan.add(lblNewLabel_5);
		
		JLabel lblRes1 = new JLabel("0");
		lblRes1.setBounds(132, 12, 55, 14);
		calcPan.add(lblRes1);
		
		JLabel lblRes2 = new JLabel("0");
		lblRes2.setBounds(132, 38, 55, 14);
		calcPan.add(lblRes2);
		
		JLabel lblRes3 = new JLabel("0");
		lblRes3.setBounds(132, 64, 55, 14);
		calcPan.add(lblRes3);
		
		JLabel lblRes4 = new JLabel("0");
		lblRes4.setBounds(132, 90, 55, 14);
		calcPan.add(lblRes4);
		
		JLabel lblRes5 = new JLabel("0");
		lblRes5.setBounds(132, 111, 55, 14);
		calcPan.add(lblRes5);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon(ScreenCalc.class.getResource("/img/calculator-icon.png")));
		lblNewLabel_11.setBounds(229, 25, 221, 241);
		contentPane.add(lblNewLabel_11);
		calcPan.setVisible(false);
		JButton btnBtn = new JButton("Calcular");
		btnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcPan.setVisible(true);
				int n1 = Integer.parseInt(spinner.getValue().toString());
				lblRes1.setText(Integer.toString(n1 % 2));
				lblRes2.setText(Integer.toString(n1 * n1 *n1));
				lblRes3.setText(String.format("%.4f", (Math.sqrt(n1))));
				lblRes4.setText(String.format("%.4f",  (Math.cbrt(n1))));
				lblRes5.setText(Integer.toString(Math.abs(n1)));
			}
		});
		btnBtn.setIcon(new ImageIcon(ScreenCalc.class.getResource("/img/New Project.png")));
		btnBtn.setBounds(91, 53, 132, 24);
		contentPane.add(btnBtn);
		
	}
}
