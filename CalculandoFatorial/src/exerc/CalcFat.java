package exerc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;

public class CalcFat extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcFat frame = new CalcFat();
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
	public CalcFat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		JPanel panel = new JPanel();
		panel.setBounds(23, 96, 303, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("! =");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel.setBounds(89, 208, 101, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblRes = new JLabel("1");
		lblRes.setFont(new Font("Dialog", Font.BOLD, 35));
		lblRes.setBounds(146, 221, 249, 34);
		contentPane.add(lblRes);
	
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(CalcFat.class.getResource("/img/9868393.png")));
		lblNewLabel_1.setBounds(268, 36, 174, 218);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblConta = new JLabel("Conta:");
		lblConta.setBounds(12, 38, 58, 22);
		panel.add(lblConta);
		lblConta.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel lblResC = new JLabel("conta");
		lblResC.setBounds(82, 44, 303, 14);
		panel.add(lblResC);
		JSpinner spVal = new JSpinner();
		spVal.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(10), Integer.valueOf(1)));
		spVal.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String ct = new String();
				panel.setVisible(true);
				
				int fat = 1, n = Integer.parseInt(spVal.getValue().toString()), c = n;
				lblRes.setText(Integer.toString(fat));

				while (1 <= c) {
					fat *= c;
					
					--c;
				
					if (n == 1 || n == 0) {
						ct = "1";
						lblResC.setText(ct);
						break;
					}
					//ct += " ";
					if (c == n) {
						continue;
					}
					ct+=  (c+1) + " x ";
					
					
				}
				
				lblRes.setText(Integer.toString(fat));
				
				lblResC.setText(ct);
				
			
			}
		});
		spVal.setFont(new Font("Dialog", Font.BOLD, 20));
		spVal.setBounds(38, 218, 50, 37);
		contentPane.add(spVal);
				
	}
}
