package aulas;

import java.util.Scanner;
public class VectorMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int nod[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner entry = new Scanner(System.in);
		System.out.println("Insira o ano: ");
		int curryear = entry.nextInt();
		if (curryear % 4 == 0) {
			nod[1] = 29;
		}
		
		for (int i = 0; i < nod.length; i++) {
			System.out.println("O mes " + months[i] + " tem " + nod[i] + " dias!");
		}
	}

}
