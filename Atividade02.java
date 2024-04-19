package estruturarepeticao;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor, som=0, media;
		for (double i=0; i<=4; i++) {
			System.out.println("informe o valor:");
			valor = ler.nextDouble();
			som+= valor;
		}
		media = som/5;
		System.out.println("a media foi: " + media);
		ler.close();
	}

}
