import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		String parOuImpar = (num % 2 == 0) ? "PAR" : "IMPAR";
		
		System.out.println(parOuImpar);
		
		sc.close();
	}

}
