package aulas;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {1, 2, 3, 4};
		System.out.println("O tamanho do vetor n[] : " + n.length);
		for (int i: n) {
			System.out.println("Na posicao "+ (i - 1) +" tem o valor "+n[(i - 1)]);
		}
	}

}
