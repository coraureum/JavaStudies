package aulas;

import java.util.Scanner;
public class SwitchPernas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner(System.in);
		String type;
		System.out.println("Insira um numero de pernas");
		int legs = entry.nextInt();
		switch (legs) {
		case 1:
			type = "saci";
			break;
		case 2:
			type = "bipede";
			break;
		case 3:
			type = "Tripe";
			break;
		case 4:
			type = "quadrupede";
			break;
		case 6, 8:
			type = "aranha ou inseto";
			break;
		
			default:
			type = "ET";
			break;
		}
		System.out.println("Tipo: " + type);
	}

}
