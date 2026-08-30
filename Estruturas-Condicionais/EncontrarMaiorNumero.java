package GitHub;
import java.util.Scanner;
public class EncontrarMaiorNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = 0;
		numero1 = entrada.nextInt();
		
		System.out.println("Digite um número: ");
		int numero2 = 0;
		numero2 = entrada.nextInt();
	
		System.out.println("Digite um número: ");
		int numero3 = 0;
		numero3 = entrada.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O número " + numero1 + " é o maior.");
		}
		else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O número " + numero2 + " é o maior.");
		}
		else if (numero3 >= numero2 && numero3 >= numero1) {
			System.out.println("O número " + numero3 + " é o maior.");
		}
		

	}

}
