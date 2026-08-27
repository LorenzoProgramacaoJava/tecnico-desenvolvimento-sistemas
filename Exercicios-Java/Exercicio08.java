package GitHub;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.println("Insira seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Insira sua idade:");
		idade = entrada.nextInt();
		
		System.out.println("Olá " + nome + "! " + " Você tem " + idade + " anos.");
	}

}
