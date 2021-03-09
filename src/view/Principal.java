package view;

import java.util.Random;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {

		Random random = new Random();

		int vet[] = new int[1000];
		for (int i = 0; i < vet.length; i++) {
			int num = random.nextInt(100);
			vet[i] = num;
		}
		ThreadVetor par = new ThreadVetor(2, vet);
		par.start();

		ThreadVetor impar = new ThreadVetor(1, vet);
		impar.start();

	}

}
