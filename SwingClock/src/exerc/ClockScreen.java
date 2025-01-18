package exerc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
public class ClockScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockScreen frame = new ClockScreen();
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
	public ClockScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ClockScreen.class.getResource("/images/coffee.jpg")));
		lblNewLabel.setBounds(12, 12, 110, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblDataEHora = new JLabel("Data e hora do sistema: ");
		lblDataEHora.setBounds(134, 12, 160, 14);
		contentPane.add(lblDataEHora);
		
		JLabel lblDate = new JLabel("<date>");
		lblDate.setFont(new Font("Dialog", Font.BOLD, 19));
		lblDate.setBounds(134, 38, 331, 27);
		contentPane.add(lblDate);
		
		JButton btnCliqueEmMim = new JButton("Clique em mim");
		btnCliqueEmMim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date time = new Date ();
				lblDate.setText(time.toString());
			}
		});
		btnCliqueEmMim.setBounds(140, 77, 141, 24);
		contentPane.add(btnCliqueEmMim);
	}
}
