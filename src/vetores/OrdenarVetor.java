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
		
		for( int i = 0; i < 3; i++){
			for(int j = i + 1; j < 4; j++ ){
				if(vetor[i] > vetor[j]){
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	    for(int i = 0; i < vetor.length; i++){
	    	System.out.println(vetor[i]);
	    }
	}
}
