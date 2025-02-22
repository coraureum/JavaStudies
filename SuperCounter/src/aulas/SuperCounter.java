package aulas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;

public class SuperCounter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperCounter frame = new SuperCounter();
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
	public SuperCounter() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblEnd = new JLabel("0");
		lblEnd.setBounds(252, 101, 55, 14);
		contentPane.add(lblEnd);
		
		JLabel lblStep = new JLabel("1");
		lblStep.setBounds(252, 161, 55, 14);
		contentPane.add(lblStep);
		
		JLabel lblSupe = new JLabel("Super Counter");
		lblSupe.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSupe.setBounds(90, 0, 143, 44);
		contentPane.add(lblSupe);
		
		JLabel lblBein = new JLabel("Begin");
		lblBein.setBounds(12, 50, 55, 14);
		contentPane.add(lblBein);
		
		JLabel lblEnd_1 = new JLabel("End");
		lblEnd_1.setBounds(12, 103, 55, 14);
		contentPane.add(lblEnd_1);
		
		JLabel lblStep_1 = new JLabel("Step");
		lblStep_1.setBounds(12, 161, 55, 14);
		contentPane.add(lblStep_1);
		
		JLabel lblBegin = new JLabel("0");
		lblBegin.setBounds(252, 52, 55, 14);
		contentPane.add(lblBegin);
		
		
		JSlider sldBegin = new JSlider();
		sldBegin.setValue(0);
		sldBegin.setMaximum(5);
		sldBegin.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblBegin.setText(Integer.toString(sldBegin.getValue()));
			}
		});
		sldBegin.setBounds(48, 50, 200, 16);
		contentPane.add(sldBegin);
		
		JSlider sldEnd = new JSlider();
		sldEnd.setMaximum(60);
		sldEnd.setMinimum(6);
		sldEnd.setValue(6);
		sldEnd.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblEnd.setText(Integer.toString(sldEnd.getValue()));
			}
		});
		sldEnd.setBounds(48, 101, 200, 16);
		contentPane.add(sldEnd);
		
		JSlider sldStep = new JSlider();
		sldStep.setMaximum(4);
		sldStep.setMinimum(1);
		sldStep.setValue(1);
		sldStep.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblStep.setText(Integer.toString(sldStep.getValue()));
			}
		});
		JPanel panel = new JPanel();
		panel.setBounds(308, 12, 120, 242);
		contentPane.add(panel);
		panel.setLayout(null);
		
		List list = new List();
		list.setBounds(10, 46, 100, 170);
		panel.add(list);
		panel.setVisible(false);
		sldStep.setBounds(48, 161, 200, 16);
		contentPane.add(sldStep);
		JButton btnCount = new JButton("Count");
		
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fs = sldBegin.getValue();
				int ls = sldEnd.getValue();
				int step = sldStep.getValue();
				
				
				panel.setVisible(true);

				for (int i = fs; i <= ls; i+=step) {
					list.add(Integer.toString(i));
				}

				
				
			}
		});
		btnCount.setBounds(106, 209, 98, 24);
		contentPane.add(btnCount);
		
		
		
	}
}
