package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int numeror;
		String respuesta;
		String solucion;
		numeror=(int)(Math.random()*100+1);
		System.out.println("¿Es?:" + numeror );
		Scanner sc = new Scanner(System.in);
		respuesta=sc.nextLine();
		do {
			solucion=switch(respuesta) {
			case "igual" -> "Has ganado";
			default -> "Introduzca mayor, menor o igual";
			};
			if ("mayor" .equals(respuesta)) {
			numeror=(int)(Math.random()*100+1);
			System.out.println("¿Es?:" + numeror );
			respuesta=sc.nextLine();
			}
			else if ("menor" .equals(respuesta)) {
			numeror=(int)(Math.random()*100+1);
			System.out.println("¿Es?:" + numeror );
			respuesta=sc.nextLine();
			}
			}while ("mayor" .equals(respuesta) || ("menor" .equals(respuesta)));

			sc.close();
		}
		
	}


