package aulas;

public class StringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome1 = "Joao";
		String nome2 = (String) "Joao";
		String nome3 = new String("Joao");
		String res;
		
		res = (nome1.equals(nome3))?"igual":"diferente";
		
		System.out.println(res);
	}

}
