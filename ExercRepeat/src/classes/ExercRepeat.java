package classes;

import javax.swing.JOptionPane;
public class ExercRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sm = 0, ct = 0, ctb = 0, ctpar = 0, ctin = 0;
		double avg = 0;
		do {
	    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero (0 interrompe): ").toString());
	    ct++;
	    sm += n;
		if (n % 2 == 0) {
			ctpar++;
		}
		if (n % 2 == 1) {
			ctin++;
		}
		
		if (n > 100) {
			ctb++;
		}
		}while (n != 0);
		ct--;  ctpar--;
		avg = sm/ct;
		JOptionPane.showMessageDialog(null, "<html> O total de valores eh: "+ ct +"<br>A soma eh: "  + sm + "<br> A qtde de "
				+ "valores pares"
				+ " sao " + ctpar + "<br>" +" Os valores impares sao " + ctin
				+ "<br> Valores maiores que 100 sao: "+ ctb + "<br>A media eh: "+ avg +"</html>");
		
	}

}
