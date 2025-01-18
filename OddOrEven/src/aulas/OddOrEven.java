package aulas;

import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner (System.in);
		
		System.out.println("Insira um numero: ");
		int a = entry.nextInt();
		if (a % 2 == 0) {
			System.out.println("O numero " + a + " e par!");
		}
		else {
			System.out.println("O numero " + a + " e impar!" );
		}
	}

}
