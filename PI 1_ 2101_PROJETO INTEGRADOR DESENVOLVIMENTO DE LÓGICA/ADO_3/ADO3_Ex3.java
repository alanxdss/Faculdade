import java.util.Scanner;
public class ADO3_Ex3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int ano;
		System.out.print("Digite o ano: ");
		ano = teclado.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("� um ano bissexto!");
		} else {
			System.out.println("N�o � um ano bissexto!");
		}
		
		
	}
}
