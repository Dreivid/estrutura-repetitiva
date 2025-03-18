package estrutura_repetitivas;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int acesso = sc.nextInt();
		
		while (acesso != 2002) {
			System.out.println("Senha Invalida");
			acesso = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
