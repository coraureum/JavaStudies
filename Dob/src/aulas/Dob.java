package aulas;

import java.util.Scanner;
public class Dob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento");
		int dob = entry.nextInt(), age =  2025  - dob;
		
		System.out.println("Sua idade e "  + age);
		if (age >= 18) {
			System.out.println("Vc e maior de idade");
		} else {
			System.out.println("Vc e de menor");
		}
	}

}
