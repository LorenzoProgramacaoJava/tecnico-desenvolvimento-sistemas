package GitHub;
import java.util.Scanner;
public class CalcularMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua nota do trabalho: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite sua nota da prova: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Digite sua nota da atividade avaliativa: ");
		double nota3 = entrada.nextDouble();
		
		double media = ((nota1 + nota2 + nota3) / 3);
		
		System.out.println("A sua média é: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado.");
		}
		else {
			System.out.println("Reprovado.");
		}
	}

}
