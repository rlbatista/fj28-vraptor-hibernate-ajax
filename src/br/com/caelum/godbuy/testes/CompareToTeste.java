package br.com.caelum.godbuy.testes;

public class CompareToTeste {
	public static void main(String[] args) {
		final Integer tres = new Integer(3);
		final Integer nul = null;
		
		System.out.print("3 cT 2: ");
		System.out.println(tres.compareTo(2));
		
		System.out.print("3 cT 3: ");
		System.out.println(tres.compareTo(3));
		
		System.out.print("3 cT 4: ");
		System.out.println(tres.compareTo(4));
		
		System.out.print("3 cT null: ");
		System.out.println(tres.compareTo(nul));
	}
}
