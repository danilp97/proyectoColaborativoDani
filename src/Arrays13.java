package arrays13;

import java.util.Scanner;

public class Arrays13 {
	// Leer por teclado una serie de 10 números enteros. La aplicación debe
	// indicarnos si los números
	// están ordenados de forma creciente, decreciente, o si están desordenados.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
			System.out.print(numeros[i]+"-");
		}
		System.out.println();
		boolean creciente = true;
		for (int i=1;i<numeros.length;i++) {
			if(numeros[i]<numeros[i+1]) {
				creciente = false;
		}
		}	
		boolean decreciente = false;
		for (int i=1;i<numeros.length;i++) {
			if(numeros[i]<numeros[i-1]) {
				decreciente = false;
			}
		}
		boolean ordenado = true;
		for (int i=1;i<numeros.length;i++) {
			if(numeros[i]<numeros[i-1]) {
				ordenado = false;
			}
		}
		
		if(creciente) {
			System.out.println("Estan de forma creciente");
		}else if(decreciente) {
			System.out.println("Estan de forma decreciente");
		} else {
			System.out.println(ordenado);
		}
		scan.close();
		}
}
