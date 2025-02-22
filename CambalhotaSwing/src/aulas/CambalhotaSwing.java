package aulas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CambalhotaSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambalhotaSwing frame = new CambalhotaSwing();
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
	public CambalhotaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Counter:");
		lblNewLabel.setBounds(12, 12, 55, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCount = new JLabel("");
		lblCount.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCount.setBounds(92, 12, 224, 14);
		contentPane.add(lblCount);
		
		JButton btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cc = 0;
				String cnt = new String();
				while (cc < 10) {
					cnt += cc + " ";
					lblCount.setText(cnt);
					cc++;
				}
			}
		});
		btnCount.setBounds(162, 118, 98, 24);
		contentPane.add(btnCount);
	}
}
