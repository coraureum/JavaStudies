package aulas;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sm = 0;
		String objresp = new String();
		Scanner entry = new Scanner(System.in);
		do {
			System.out.println("Digite um numero: ");
			num = entry.nextInt();
			sm += num;
			System.out.println("Quer continuar? |S|N| ");
			objresp = entry.next();
		}while(objresp.equals("S"));
		System.out.println ("A soma de todos os valores eh " + sm);
	}
	
}
