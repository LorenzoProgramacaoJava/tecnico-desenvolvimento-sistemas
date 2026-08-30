package GitHub;
import java.util.Scanner;
public class EscolherBebida {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Coca-Cola");
		System.out.println("2 - Guaraná");
		System.out.println("3 - Fanta");
		System.out.println("4 - Sprite");
		
		int opcao = entrada.nextInt();
		
		
		switch (opcao) {
		case 1:
			System.out.println("Coca-Cola escolhida!");
			break;
		case 2:
			System.out.println("Guaraná escolhido!");
			break;
		case 3:
			System.out.println("Fanta escolhida!");
			break;
		case 4:
			System.out.println("Sprite escolhida!");
			break;
		}
	}

}
