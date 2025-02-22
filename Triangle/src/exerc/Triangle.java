package exerc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Triangle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangle frame = new Triangle();
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
	public Triangle() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JLabel lblA = new JLabel("a");
		lblA.setBounds(714, 55, 55, 14);
		contentPane.add(lblA);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JSlider sliderB = new JSlider();
		sliderB.setBounds(170, 89, 200, 16);
		contentPane.add(sliderB);
		
		JSlider sliderC = new JSlider();
		sliderC.setBounds(170, 145, 200, 16);
		contentPane.add(sliderC);
		
		JLabel lbla = new JLabel("???");
		lbla.setBounds(374, 44, 55, 14);
		contentPane.add(lbla);
		
		JLabel lblc = new JLabel("???");
		lblc.setBounds(374, 147, 55, 14);
		contentPane.add(lblc);
		
		JLabel lblb = new JLabel("???");
		lblb.setBounds(374, 89, 55, 14);
		contentPane.add(lblb);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Triangle.class.getResource("/img/851132_triangle_512x512.png")));
		lblNewLabel_3.setBounds(545, 12, 247, 206);
		contentPane.add(lblNewLabel_3);
		
		
		
		JLabel lblB = new JLabel("b");
		lblB.setBounds(546, 108, 55, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("c");
		lblC.setBounds(653, 214, 55, 14);
		contentPane.add(lblC);
		
		JLabel lblNewLabel_4 = new JLabel("Segmento a");
		lblNewLabel_4.setBounds(50, 44, 102, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Segmento b");
		lblNewLabel_4_1.setBounds(50, 91, 102, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Segmento c");
		lblNewLabel_4_2.setBounds(50, 147, 84, 14);
		contentPane.add(lblNewLabel_4_2);
		JSlider sliderA = new JSlider();
		
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int a = sliderA.getValue();
				lbla.setText(Integer.toString(a));
				lblA.setText(Integer.toString(a));
			}
		});
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int b = sliderB.getValue();
				lblb.setText(Integer.toString(b));
				lblB.setText(Integer.toString(b));
			}
		});
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int c = sliderC.getValue();
				lblc.setText(Integer.toString(c));
				lblC.setText(Integer.toString(c));
			}
		});
		sliderA.setBounds(170, 42, 200, 16);
		contentPane.add(sliderA);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(277, 193, 271, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JLabel lblFormaUmTriangulo = new JLabel("Forma um triangulo:");
		lblFormaUmTriangulo.setBounds(12, 12, 138, 14);
		panel.add(lblFormaUmTriangulo);
		
		JLabel lblYN = new JLabel("???");
		lblYN.setBounds(147, 12, 55, 14);
		panel.add(lblYN);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(99, 38, 33, 14);
		panel.add(lblTipo);
		
		JLabel label = new JLabel("???");
		label.setBounds(147, 38, 76, 14);
		panel.add(label);
		JButton btnCalc = new JButton("Calcular");
		btnCalc.setFont(new Font("Dialog", Font.BOLD, 20));
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				int l1 = sliderA.getValue(), l2 = sliderB.getValue(), l3 = sliderC.getValue();
				if (l1 > l2 + l3 || l2 > l1 + l3 || l3 > l2 + l1){
					lblYN.setText("Nao");
					label.setText("Impossivel");
					
				}
				else {
					if (l1 == l2 && l2 == l3) {
						lblYN.setText("Sim");
						label.setText("Equilatero");
				}
				else if (l1 != l2 && l2 != l3 && l3 != l1) {
					lblYN.setText("Sim");
					label.setText("Escaleno");
				}
				else if (l1 == l2 || l2 == l3) {
					lblYN.setText("Sim");
					label.setText("Isosceles");
				}
				
			}}
		});
		btnCalc.setBounds(50, 173, 142, 45);
		contentPane.add(btnCalc);
	}
}
