import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		int a = sc.nextInt();
		System.out.print("Informe o valor de B: ");
		int b = sc.nextInt();
		
		int verificador;
		
		if(a < b) {
			verificador = b % a;
		}
		else {
			verificador = a % b;
		}
		
		String multiplo = (verificador == 0) ? "Sao multiplos" : "Nao sao multiplos";
		
		System.out.println(multiplo);
		
		sc.close();
	}

}
