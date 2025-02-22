package classes;

import java.awt.EventQueue;
import java.util.*;
import java.time.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgeCalc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgeCalc frame = new AgeCalc();
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
	public AgeCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("D. O. B.");
		lblNewLabel.setBounds(33, 12, 55, 14);
		contentPane.add(lblNewLabel);
		JLabel lblAge = new JLabel("???");
		lblAge.setBounds(96, 134, 55, 14);
		contentPane.add(lblAge);
		JSpinner spinner = new JSpinner();
		spinner.setBounds(96, 10, 82, 18);
		contentPane.add(spinner);
		
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int curryr = LocalDate.now().getYear();
				int year = Integer.parseInt(spinner.getValue().toString());
				lblAge.setText(Integer.toString(curryr - year));
				
			}
		});
		btnCalculate.setIcon(new ImageIcon(AgeCalc.class.getResource("/images/New Project.png")));
		btnCalculate.setBounds(12, 40, 166, 54);
		contentPane.add(btnCalculate);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBounds(12, 134, 55, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon(AgeCalc.class.getResource("/images/10770632.png")));
		lblNewLabel_1_1_2.setBounds(196, 12, 128, 206);
		contentPane.add(lblNewLabel_1_1_2);
	}
}
