import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		String infoNum = (num < 0) ? "NEGATIVO" : "NAO NEGATIVO";
		
		System.out.println(infoNum);
		
		sc.close();
	}

}
