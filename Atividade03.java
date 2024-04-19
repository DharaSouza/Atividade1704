package estruturarepeticao;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	int somimp=0,sompar=0, numero=0;
	for(int i=1; i<=10; i++) {
		System.out.println("informe um valor:");
		numero = ler.nextInt();
		if (numero %2 == 0) {
			sompar += 1;
		}
		else {
			somimp += 1;
			
		}
	}
	System.out.println("A quantidade de numeros pares é: " + sompar);
	System.out.println("A quantidade de numeros ímpares é: " + somimp);
	
	
	}

}
