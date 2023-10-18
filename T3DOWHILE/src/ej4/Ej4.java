package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int inicio=1;
		int numero;
		int por=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:" );
		numero=sc.nextInt();
		do {
			por=numero*inicio;
			inicio++;
			System.out.println("La tabla de multiplicar de " + numero + " es: " + por );
			}while (inicio<=10);
		
		
		sc.close();

	}

}
