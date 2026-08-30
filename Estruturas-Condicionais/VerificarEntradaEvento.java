package GitHub;
import java.util.Scanner;
public class VerificarEntradaEvento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String pagamento = "", autorizacao = "";
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade <= 10) {
			System.out.println("Você paga entrada gratuita.");
			pagamento = "Entrada gratuita";
		}
		else if (idade >= 11 && idade <= 17) {
			System.out.println("Você paga meia-entrada.");
			pagamento = "Meia-entrada";
		}
		else {
			System.out.println("Você paga a entrada inteira.");
			pagamento = "Entrada inteira";
		}
		
		System.out.println("Você está com fantasia: ");
		boolean fantasia = entrada.nextBoolean();
		
		if (fantasia == true) {
			System.out.println("Você ganhou acesso á área especial!");
			autorizacao = "autorizada.";
		}
		else {
			System.out.println("Você não ganhou acesso á área especial.");
			autorizacao = "não autorizada.";
		}
		
		System.out.println("Situação geral:");
		System.out.println("Pagamento: " + pagamento);
		System.out.println("Área especial: Entrada " + autorizacao);
		

	}

}
