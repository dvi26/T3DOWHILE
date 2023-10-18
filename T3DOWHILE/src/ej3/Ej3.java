package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int inicio=1;
		int numero;
		int suma=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:" );
		numero=sc.nextInt();
		do {
			suma=suma+inicio;
			inicio++;
			}while (inicio<=numero);
		
		System.out.println("La suma de los numeros es: " + suma );
		sc.close();

	}
	
}
