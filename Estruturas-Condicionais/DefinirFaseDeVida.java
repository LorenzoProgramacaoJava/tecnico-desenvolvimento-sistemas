package GitHub;
import java.util.Scanner;
public class DefinirFaseDeVida {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade > 0 && idade <= 11) {
			System.out.println("Você é criança!");
		}
		else if (idade > 11 && idade <= 18) {
			System.out.println("Você é jovem!");
		}
		else if (idade > 18 && idade <= 50) {
			System.out.println("Você é adulto!");
		}
		else if (idade > 50 && idade <= 110 ) {
			System.out.println("Você é idoso!");
		}
		else {
			System.out.println("Idade inválida!");
		}
	}

}
