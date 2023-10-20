package ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		String respuesta1;
		String respuesta2;
		String respuesta3;
		Scanner sc = new Scanner(System.in);
	
		do {
			System.out.println("Introduzca piedra papel o tijera: (Jugador1)");
			respuesta1=sc.nextLine();
			
		}while(!"piedra" .equals(respuesta1) && !"papel" .equals(respuesta1) && !"tijera" .equals(respuesta1))
	;
		
		do {
			System.out.println("Introduzca piedra papel o tijera: (Jugador2)");
			respuesta2=sc.nextLine();
		
		}while(!"piedra" .equals(respuesta2) && !"papel" .equals(respuesta2) && !"tijera" .equals(respuesta2))
	;
		
		if((respuesta1 .equals(respuesta2)))
			System.out.println("Empate");
			

			if ("piedra" .equals(respuesta1) && "tijera" .equals(respuesta2)) {
			System.out.println("Gana el jugador 1");
			}
			else if ("piedra" .equals(respuesta1) && "papel" .equals(respuesta2)) {
			System.out.println("Gana el jugador 2");
			}
			else if ("papel" .equals(respuesta1) && "tijera" .equals(respuesta2)) {
			System.out.println("Gana el jugador 2" );
			}
			else if ("papel" .equals(respuesta1) && "piedra" .equals(respuesta2)) {
			System.out.println("Gana el jugador 1" );
			}
			else if ("tijera" .equals(respuesta1) && "papel" .equals(respuesta2)) {
			System.out.println("Gana el jugador 1" );
			}
			else if ("tijera" .equals(respuesta1) && "piedra" .equals(respuesta2)) {
			System.out.println("Gana el jugador 2");
			}
			
			System.out.println("¿Quiere volver a jugar?");
			respuesta3=sc.nextLine();
			do {
				do {
					System.out.println("Introduzca piedra papel o tijera: (Jugador1)");
					respuesta1=sc.nextLine();
					
				}while(!"piedra" .equals(respuesta1) && !"papel" .equals(respuesta1) && !"tijera" .equals(respuesta1))
			;
				
				do {
					System.out.println("Introduzca piedra papel o tijera: (Jugador2)");
					respuesta2=sc.nextLine();
				
				}while(!"piedra" .equals(respuesta2) && !"papel" .equals(respuesta2) && !"tijera" .equals(respuesta2))
			;
				
				if((respuesta1 .equals(respuesta2)))
					System.out.println("Empate");
					

					if ("piedra" .equals(respuesta1) && "tijera" .equals(respuesta2)) {
					System.out.println("Gana el jugador 1");
					}
					else if ("piedra" .equals(respuesta1) && "papel" .equals(respuesta2)) {
					System.out.println("Gana el jugador 2");
					}
					else if ("papel" .equals(respuesta1) && "tijera" .equals(respuesta2)) {
					System.out.println("Gana el jugador 2" );
					}
					else if ("papel" .equals(respuesta1) && "piedra" .equals(respuesta2)) {
					System.out.println("Gana el jugador 1" );
					}
					else if ("tijera" .equals(respuesta1) && "papel" .equals(respuesta2)) {
					System.out.println("Gana el jugador 1" );
					}
					else if ("tijera" .equals(respuesta1) && "piedra" .equals(respuesta2)) {
					System.out.println("Gana el jugador 2");
					}
					
					System.out.println("¿Quiere volver a jugar?");
					respuesta3=sc.nextLine();
				while("S" .equals(respuesta3))
			;
			
			
		
		
		
	
	

}}}
