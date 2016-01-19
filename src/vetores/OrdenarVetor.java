package vetores;

import java.util.Scanner;

public class OrdenarVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []vetor = new int[4];
		Scanner sc = new Scanner (System.in);
		for(int i = 0; i < vetor.length; i++){
			System.out.println(" Digite um valor: ");
			vetor[i] = sc.nextInt();
		}
	}
}
