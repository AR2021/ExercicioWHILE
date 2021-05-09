import java.util.Scanner;

public class Nome10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe seu nome :");
		String nome = ler.nextLine();
		
		int cond = 0;
		
		while(cond <10) {
			System.out.println(nome);
          cond++;
		}
		  
		
		ler.close();

	}

}
