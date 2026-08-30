package GitHub;
import java.util.Scanner;
public class PositivoOuNegativo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if (numero > 0) {
			System.out.println("Este número é positivo!");
		}
		else if (numero == 0) {
			System.out.println("Este número é 0.");
		}
		else {
			System.out.println("Este número é negativo!");
		}
	}

}
