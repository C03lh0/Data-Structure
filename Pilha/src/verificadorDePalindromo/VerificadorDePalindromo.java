package verificadorDePalindromo;
import java.util.Scanner;
import java.util.Stack;

public class VerificadorDePalindromo {
	
	public static void main (String[] args) {
		String value;
		Scanner in = new Scanner (System.in);
		
		System.out.println("*BEM-VINDO AO VERIFICADOR DE PALINDROMO*");
		System.out.println("Informe a frase que deseja verificar: ");
		value = in.nextLine();
		convert(value);
		//convert2(value);
		
	}

	private static void convert(String value) {
		int j = 0;
		char[] string;
		MyStack bitsStack = new MyStack();
		String possiblePalindrome, formartedString;
		
		formartedString = formartString(value);
		for(int i = 0; i < formartedString.length(); i++) {
			if(!bitsStack.isFull()) {
				bitsStack.push(formartedString.charAt(i));
			}
		}
		
		string = new char [formartedString.length()];
		while (!bitsStack.isEmpty()) {
			string [j] = bitsStack.pop();
			j++;
		}
		possiblePalindrome = new String (string);
		
		if (formartedString.compareTo(possiblePalindrome) == 0) {
			System.out.println("A frase \""+value+"\" é um palindromo!");
		} else {
			System.out.println("A frase \""+value+"\" não é um palindromo!");
		}
	}
	
	private static void convert2(String value) {
		int j = 0;
		char[] string;
		Stack<Character> bitsStack = new Stack<Character>();
		String possiblePalindrome, formartedString;
		
		formartedString = formartString(value);
		for(int i = 0; i < formartedString.length(); i++) {
			bitsStack.push(formartedString.charAt(i));
		}
		
		string = new char [formartedString.length()];
		while (!bitsStack.isEmpty()) {
			string [j] = (char) bitsStack.pop();
			j++;
		}
		possiblePalindrome = new String (string);
		
		if (formartedString.compareTo(possiblePalindrome) == 0) {
			System.out.println("A frase \""+value+"\" é um palindromo!");
		} else {
			System.out.println("A frase \""+value+"\" não é um palindromo!");
		}
	}
	
	private static String formartString(String value) {
		String formatedString;
		formatedString = value.replaceAll(" ", "");
		return formatedString.toLowerCase();
	}
}
