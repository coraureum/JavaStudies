package aulas;

import java.util.Arrays;

public class VectorThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v[] = {1.1, 3.4, -5.4, -9999.9};
		Arrays.sort(v);
		int pos = Arrays.binarySearch(v, -9999.9);
		for (double i: v) {
			
			System.out.println(i);
			
		}
		System.out.println(v[pos]);
	}

}
