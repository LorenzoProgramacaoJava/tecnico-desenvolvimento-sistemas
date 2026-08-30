package GitHub;
import java.util.Scanner;
public class EscolherClassePersonagem {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escolha uma classe de personagem: ");
		System.out.println("1 - Guerreiro");
		System.out.println("2 - Mago");
		System.out.println("3 - Arqueiro");
		System.out.println("4 - Curandeiro");
		
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Guerreiro escolhido! Você possui muita força.");
			break;
		case 2:
			System.out.println("Mago escolhido! Você domina poderes mágicos.");
			break;
		case 3:
			System.out.println("Arqueiro escolhido! Você ataca de longe.");
			break;
		case 4:
			System.out.println("Curandeiro escolhido! Você ajuda seus aliados.");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		
		
		
		
		
		
	}

}
