package GitHub;
import java.util.Scanner;
public class VerificarIdadeVotacao {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você pode votar.");
		}
		else {
			System.out.println("Você não pode votar.");
		}
	}

}
