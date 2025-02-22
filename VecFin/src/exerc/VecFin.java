package exerc;

import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import  javax.swing.DefaultListModel;
public class VecFin extends JFrame {
	int vec[] = new int[9];
	DefaultListModel list =  new DefaultListModel();
	int selected = 0;
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VecFin frame = new VecFin();
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
	public VecFin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(39, 81, 28, 18);
		contentPane.add(spinner);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(spinner.getValue().toString());
			}
		});
		btnAdd.setBounds(77, 41, 98, 24);
		contentPane.add(btnAdd);
		
		JButton btnRm = new JButton("Remove");
		btnRm.setBounds(77, 78, 98, 24);
		contentPane.add(btnRm);
		
		JButton btnSort = new JButton("Sort");
		btnSort.setBounds(77, 114, 98, 24);
		contentPane.add(btnSort);
		
		JList list = new JList();
		list.setBounds(290, 41, 138, 217);
		contentPane.add(list);
		
		

	}
}
