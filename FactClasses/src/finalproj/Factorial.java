package finalproj;

public class Factorial {
	private int num = 0;
	private int fact = 1;
	private String form = "";
	public void setValue(int n) {
		num = n;
		int f = 1;
		String string = "";
		for (int i = n; i>1; i--) {
			f *= i;
			string += f + " x ";
		}
		string += "1 = ";
		fact = f;
		form = string;		
	}

	public int ExhortFact() {
		return fact;
		
	}
	public String ExhortFormula() {
		return form;
	}

}