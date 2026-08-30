package GitHub;
import java.util.Scanner;
public class ComprarJogo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double valor = 0, valorFinal;
		String jogo = "";
		boolean validacao = true;
		
		System.out.println("Escolha um jogo para comprar: ");
		System.out.println("1 - Minecraft - R$ 100,00");
		System.out.println("2 - FIFA - R$ 250,00");
		System.out.println("3 - The Sims - R$ 150,00");
		System.out.println("4 - Stardew Valley - R$ 40,00");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Minecraft escolhido!");
			jogo = "Minecraft.";
			valor = 100;
			break;
		case 2:
			System.out.println("FIFA escolhido!");
			jogo = "FIFA.";
			valor = 250;
			break;
		case 3:
			System.out.println("The Sims escolhido!");
			jogo = "The Sims.";
			valor = 150;
			break;
		case 4:
			System.out.println("Stardew Valley escolhido!");
			jogo = "Stardew Valley.";
			valor = 40;
			break;
		default:
			System.out.println("Jogo inválido.");
			validacao = false;
				
		}
		
		System.out.println("Você possui cupom de desconto: ");
		boolean desconto = entrada.nextBoolean();
		
		if (desconto == true) {
			valorFinal = valor - (valor * 0.15);
			System.out.println("Cupom de 15% de desconto aplicado!");
		}
		else {
			valorFinal = valor;
		}
		
		if (validacao == true) {
			System.out.println("Resumo geral da compra:");	
			System.out.println("Jogo escolhido: " + jogo);	
			System.out.println("Valor total: R$" + valorFinal);	
		}
		else {
			System.out.println("Compra inválida.");
		}

	}

}
