package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldOddEven;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scr frame = new Scr();
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
	public Scr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 232, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblScr = new JLabel("Par ou Impar?");
		lblScr.setBounds(53, 31, 114, 14);
		contentPane.add(lblScr);
		
		txtFieldOddEven = new JTextField();
		txtFieldOddEven.setBounds(44, 57, 114, 18);
		contentPane.add(txtFieldOddEven);
		txtFieldOddEven.setColumns(10);
		JLabel lblOddEven = new JLabel("???");
		lblOddEven.setBounds(53, 137, 157, 14);
		contentPane.add(lblOddEven);
		JButton btnFig = new JButton("Veja");
		btnFig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtFieldOddEven.getText());
				if (n1 % 2 == 0) {
					lblOddEven.setText("O numero " + n1 + " e par");
				}
				else {
					lblOddEven.setText("O numero " + n1 + " e impar" );
				}
			}
		});
		btnFig.setBounds(53, 87, 98, 24);
		contentPane.add(btnFig);
		
		
	}
}
