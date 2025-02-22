package exerc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BhaskaraScr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BhaskaraScr frame = new BhaskaraScr();
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
	public BhaskaraScr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinnerXSq = new JSpinner();
		spinnerXSq.setFont(new Font("Dialog", Font.BOLD, 22));
		spinnerXSq.setBounds(58, 73, 39, 32);
		contentPane.add(spinnerXSq);
		
		JSpinner spinnerX = new JSpinner();
		spinnerX.setFont(new Font("Dialog", Font.BOLD, 22));
		spinnerX.setBounds(148, 73, 39, 32);
		contentPane.add(spinnerX);
		
		JSpinner spinnerVal = new JSpinner();
		spinnerVal.setFont(new Font("Dialog", Font.BOLD, 22));
		spinnerVal.setBounds(235, 73, 39, 32);
		contentPane.add(spinnerVal);
		
		JLabel lblNewLabel = new JLabel("<html>x<sup>2</sup> +</html>");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel.setBounds(99, 57, 76, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("x  +");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_1.setBounds(193, 80, 55, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_2.setBounds(282, 82, 55, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblRes = new JLabel("0");
		lblRes.setFont(new Font("Dialog", Font.BOLD, 22));
		lblRes.setBounds(306, 76, 66, 26);
		contentPane.add(lblRes);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Dialog", Font.BOLD, 22));
		lblB.setBounds(108, 142, 33, 37);
		contentPane.add(lblB);
		
		JLabel lblNewLabel_5 = new JLabel("²");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_5.setBounds(125, 142, 115, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("-");
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_6.setBounds(136, 153, 55, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("<html>&Delta =</html>");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_7.setBounds(58, 121, 66, 76);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("4 .");
		lblNewLabel_8.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_8.setBounds(165, 144, 55, 32);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Dialog", Font.BOLD, 22));
		lblA.setBounds(203, 120, 88, 80);
		contentPane.add(lblA);
		
		JLabel lblNewLabel_10 = new JLabel(".");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_10.setBounds(232, 105, 74, 111);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Dialog", Font.BOLD, 22));
		lblC.setBounds(245, 126, 125, 69);
		contentPane.add(lblC);
		
	
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 253, 400, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JLabel lblNewLabel_7_1 = new JLabel("<html>&Delta =</html>");
		lblNewLabel_7_1.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_7_1.setBounds(0, 6, 66, 58);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblDelt = new JLabel("???");
		lblDelt.setFont(new Font("Dialog", Font.BOLD, 22));
		lblDelt.setBounds(44, 18, 59, 37);
		panel.add(lblDelt);
		
		JLabel lblType = new JLabel("???");
		lblType.setFont(new Font("Dialog", Font.BOLD, 20));
		lblType.setBounds(158, 18, 242, 37);
		panel.add(lblType);
		
		JLabel lblDelt_1_1 = new JLabel("Tipo:");
		lblDelt_1_1.setFont(new Font("Dialog", Font.BOLD, 22));
		lblDelt_1_1.setBounds(100, 18, 59, 37);
		panel.add(lblDelt_1_1);
		
		JButton btnCalcular = new JButton("Calcular!");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				int a = Integer.parseInt(spinnerXSq.getValue().toString()), 
						b = Integer.parseInt(spinnerX.getValue().toString()), 
						c = Integer.parseInt(spinnerVal.getValue().toString()), bhask = ((b * b) - 4*a*c);
				lblA.setText(Integer.toString(a));
				lblB.setText(Integer.toString(b));
				lblC.setText(Integer.toString(c));
				double Res1 = (((b * (-1) ) + Math.sqrt(Double.parseDouble(Integer.toString(bhask)))))/(2 * a);
				double Res2 = (((b * (-1) ) - Math.sqrt(Double.parseDouble(Integer.toString(bhask)))))/(2 * a);
				//lblRes1
				lblDelt.setText(Integer.toString(bhask));
				if (bhask >0) {
					lblType.setText("Duas raizes reais! ");
				}
				else if (bhask == 0) {
					lblType.setText("Uma raiz real! ");
				}
				else if (bhask < 0) {
					lblType.setText("Nenhuma raiz real.");
				}
			}
		});
		btnCalcular.setBounds(118, 182, 98, 24);
		contentPane.add(btnCalcular);
	}
}
