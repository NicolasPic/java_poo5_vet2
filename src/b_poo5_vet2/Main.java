package b_poo5_vet2;

import java.util.Scanner;

import entidades.Quartos;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos para aluguel:");
		int n = sc.nextInt();
	   
		
		Quartos[] vet = new Quartos[10];

		
		for(int i = 0;i<n;i++) {
			sc.nextLine();
			System.out.println("Aluguel #"+ (i+1) + ":");
			System.out.println("Nome:");
			String nome = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Quarto:");
			int numero = sc.nextInt();
			
			vet[numero] = new Quartos(nome,email,numero);
			
		}
		System.out.println("Quartos ocupados:");
		
		for(int i = 0;i<10;i++) {
			if(vet[i] != null) {
				System.out.println(vet[i]);
			}
		}
		
		
		sc.close();

	}

}
