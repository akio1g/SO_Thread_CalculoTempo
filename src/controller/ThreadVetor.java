package controller;

public class ThreadVetor extends Thread {

	private int x;
	private int vet[];

	public ThreadVetor(int x, int[] vet) {
		this.x = x;
		this.vet = vet;
	}

	@Override
	public void run() {
		tempoVet();
	}

	private void tempoVet() {
		if ((x % 2) == 0) {
			double tI = System.nanoTime();
			for (int i = 0; i < vet.length; i++) {
				vet[i] = vet[i];
			}
			double tF = System.nanoTime();
			double tG = tF - tI;
			tG = tG / Math.pow(10, 9);
			System.out.printf("tempo par: %.6f\n", tG);
		} else if ((x % 2) == 1) {
			double tI = System.nanoTime();
			for (int i : vet) {
				vet[i] = vet[i];
			}
			double tF = System.nanoTime();
			double tG = tF - tI;
			tG = tG / Math.pow(10, 9);
			System.out.printf("tempo impar: %.6f", tG);
		}		
	}

}
