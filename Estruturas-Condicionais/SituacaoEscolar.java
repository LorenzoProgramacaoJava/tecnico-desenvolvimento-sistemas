package GitHub;
import java.util.Scanner;
public class SituacaoEscolar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua nota: ");
		double nota = entrada.nextDouble();
		
		if (nota >= 0 && nota <= 4) {
			System.out.println("Reprovado!");
		}
		else if (nota > 4 && nota < 7) {
			System.out.println("Está de recuperação!");
		}
		else if (nota >= 7 && nota <= 10) {
			System.out.println("Aprovado!");
		}

	}

}
