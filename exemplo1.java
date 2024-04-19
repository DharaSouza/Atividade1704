package estruturarepeticao;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		
		int numero, resultado;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe o numero para ver a tabuada:");
		numero = ler.nextInt();
		for (int i=1; i <=10; i++) {
			resultado = numero * i;
		}
		ler.close();

	}

}
