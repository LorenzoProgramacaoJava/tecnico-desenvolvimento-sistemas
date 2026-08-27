package GitHub;
import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite outro número: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("A multiplicação destes dois números resultará em " + (numero1 * numero2));
	}

}
