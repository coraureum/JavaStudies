package aulas;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insira um nome para o aluno: ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		System.out.println("Digite a nota do aluno: ");
		float nota = entrada.nextFloat();
		System.out.format("A nota de %s e %.3f", nome, nota);
	}

}
