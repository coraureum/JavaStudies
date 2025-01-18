package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Akinator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Akinator frame = new Akinator();
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
	public Akinator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(120, 63, 363, 293);
		lblNewLabel_1.setIcon(new ImageIcon(Akinator.class.getResource("/img/akinator.png")));
		contentPane.add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(120, 313, 28, 18);
		contentPane.add(spinner);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(55, 315, 55, 14);
		contentPane.add(lblValor);
		JLabel lblF = new JLabel("<html>	Estou pensando em um<br> valor entre 1-5. <br> Tente advinhar este valor.</html>");
		lblF.setBounds(40, 45, 371, 108);
		lblF.setFont(new Font("Dialog", Font.BOLD, 15));
		contentPane.add(lblF);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(22, -22, 461, 237);
		lblNewLabel.setIcon(new ImageIcon(Akinator.class.getResource("/img/3839753.png")));
		contentPane.add(lblNewLabel);
		
		JButton btnAdv = new JButton("Advinhe");
		btnAdv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rnd =(int) (Math.random() * (6-1) + 1);
				
				int guess = Integer.parseInt(spinner.getValue().toString());
				if (rnd != guess) {
					lblF.setFont(new Font("Jetbrains Mono", Font.BOLD, 17));
					lblF.setText("Voce errou, eu pensei " + rnd);
				}
				else {

					lblF.setText("Acertou mizeravi!");
				}
			}
		});
		btnAdv.setBounds(50, 349, 98, 24);
		contentPane.add(btnAdv);
		

	}
}
