package estruturarepeticao;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero, fatorial;
		System.out.print("Informe um número: ");
		numero = ler.nextInt();
		fatorial = 1;
		for (int i = 1; i <=numero; i++) {
		fatorial *= i;
		}
		System.out.println(numero + " != " + fatorial);
		ler.close();
	}

}
