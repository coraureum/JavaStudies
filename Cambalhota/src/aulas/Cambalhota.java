package aulas;

public class Cambalhota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int cc = 0;
			while (cc < 10) {
				cc++;
				if (cc == 5 || cc == 7) {
					continue;
				}
				if (cc == 8) {
					break;
				}
				System.out.println("Cambalhota de numero " + cc );
				}
	}

}
