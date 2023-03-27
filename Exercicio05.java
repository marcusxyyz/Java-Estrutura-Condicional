import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("CODIGO	ESPECIFICACAO		PRECO\n"
				+ "1	Cachorro Quente		R$4.00\n"
				+ "2	X-Salada		R$4.50\n"
				+ "3	X-Bacon			R$5.00\n"
				+ "4	Torrada Simples		R$2.00\n"
				+ "5	Refrigerante		R$1.50\n");
		System.out.println();
		System.out.print("Informe o codigo do produto: ");
		int codigo = sc.nextInt();
		System.out.print("Quantidade do produto: ");
		int qtd = sc.nextInt();
		
		double valor = 0;
		switch(codigo) {
			case 1:
				valor = qtd * 4.00;
				break;
			case 2:
				valor = qtd * 4.50;
				break;
			case 3:
				valor = qtd * 5.00;
				break;
			case 4:
				valor = qtd * 2.00;
				break;
			case 5:
				valor = qtd * 1.50;
				break;
			default:
				valor = 0;
				break;
		}
		
		if (valor > 0) {
			System.out.printf("Total: R$ %.2f", valor);
		}
		else {
			System.out.println("Codigo inserido invalido.");
		}
		
		sc.close();
	}

}
