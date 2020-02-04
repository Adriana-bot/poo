import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("digite o nome do aluno");
		String nome =sc.nextLine();
		System.out.println(" informe a idade do aluno:");
		int idade =sc.nextInt();
		sc.close();
		
		System.out.println("Aluno" +nome + ", sua idade é" + idade + "anos.");

	}

}
