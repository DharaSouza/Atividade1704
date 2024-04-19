package estruturarepeticao;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
			int numeros, numero01;
			Scanner ler = new Scanner(System.in);
			System.out.println("informe o primeiro numero");
			numeros = ler.nextInt();
			System.out.println("informe o segundo numero");
			numero01 = ler.nextInt();
			for(int i=numeros ; i <=numero01; i++) {
			if (i %2 == 1) {
				System.out.println ("o numero mostrado é impar" + i);
			}
			}
			ler.close();
	}

}
