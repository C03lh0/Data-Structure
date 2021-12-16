package conversorDecimalBinario;
import java.util.Scanner;
import java.util.Stack;

public class ConversorDecimalBinario {
	
	public static void main (String[] args) {
		int value;
		Scanner in = new Scanner (System.in);
		
		System.out.println("*BEM-VINDO AO CONVERSOR DECIMAL-BINÁRIO*");
		System.out.println("Informe o número (decimal) que deseja converter: ");
		value = in.nextInt();
		convert(value);
		convert2(value);
		
	}

	private static void convert(int value) {
		MyStack bitsStack = new MyStack();
		int rest, quotient;
		
		quotient = value;
		while (quotient != 0) {
			rest = quotient % 2;
			if(!bitsStack.isFull()) {
				bitsStack.push(rest);
			}
			quotient = quotient / 2;
		}
		
		System.out.print("Valor correspondente em binário: ");
		while (!bitsStack.isEmpty()) {
			System.out.print(bitsStack.pop());
		}
		System.out.println();
	}
	
	private static void convert2(int value) {
		Stack<Integer> bitsStack = new Stack<Integer>();
		int rest, quotient;
		quotient = value;
		
		while (quotient != 0) {
			rest = quotient % 2;
			bitsStack.push(rest);
			quotient = quotient / 2;
		}
		
		System.out.print("Valor correspondente em binário: ");
		while (!bitsStack.isEmpty()) {
			System.out.print(bitsStack.pop());
		}
		System.out.println();
	}
}
