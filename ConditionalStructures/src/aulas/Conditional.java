package aulas;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner(System.in);
		System.out.println("Digite duas notas.");
		float no1 = entry.nextFloat(), no2 = entry.nextFloat(), avg = (no1+no2)/2;
		System.out.println("Sua media  foi  "+avg);
		if (avg >=9) {
			System.out.println("Parabens!");
		}
		
	}

}
