package GitHub;
import java.util.Scanner;
public class LanchoneteGamer {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		boolean verificacao = true;
		
		System.out.println("Escolha uma opção de lanche: ");
		System.out.println("10 = Pixel Burger");
		System.out.println("20 = XP Duplo Fries");
		System.out.println("30 = Mana Shake");
		System.out.println("40 = Combo Chefão");
		
		int opcao = entrada.nextInt();
		
		
		
		switch (opcao) {
		case 10:
			System.out.println("Pixel Burger escolhido!");
			break;
		case 20:
			System.out.println("XP Duplo Fries escolhido!");
			break;
		case 30:
			System.out.println("Mana Shake escolhido!");
			break;
		case 40:
			System.out.println("Combo Chefão escolhido!");
			break;
		default:
			System.out.println("Opção inválida.");
			verificacao = false;
			
			break;
		}
		
		System.out.println("Digite a quantidade desejada: ");
		int quantidade = entrada.nextInt();
		
		if (quantidade <= 0) {
			System.out.println("Quantidade inválida.");
			verificacao = false;
		}
		
		if (verificacao == false) {
			System.out.println("Falha no cadastro do pedido.");
		}
		else {
			System.out.println("Pedido cadastrado!");
		}

	}
}
