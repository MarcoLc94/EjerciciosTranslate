package ejerciciosTraductor;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		HashMap<String, String> diccionario = new HashMap<>();
		diccionario.put("amigos", "friends");
		diccionario.put("hija", "daughter");
		diccionario.put("desarrollador", "developer");
		diccionario.put("ejercico", "exercise");
		diccionario.put("bota", "boot");
		diccionario.put("hermano", "brother");
		diccionario.put("hernana", "sister");
		diccionario.put("casa", "house");
		diccionario.put("este", "this");
		diccionario.put("cabeza", "head");
		diccionario.put("mano", "hand");
		diccionario.put("sueter", "sweater");
		diccionario.put("lapiz", "pencil");
		diccionario.put("cafe", "coffee");
		diccionario.put("te", "tea");
		diccionario.put("automovil", "car");
		diccionario.put("rojo", "red");
		diccionario.put("azul", "blue");
		diccionario.put("ojos", "eyes");
		diccionario.put("verde", "green");

		int i;
		int contador = 0;
		String traduccion;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Ingresa la palabra que quieres traducir: ");
			traduccion = sc.nextLine();
			
			if(diccionario.containsKey(traduccion)) {
				System.out.println("La traduccion es: " + diccionario.get(traduccion) + "\n");
				
			} else {
				System.out.println("La palabra no se encuentra en el diccionario \n");
				
			}
			
		} while(!traduccion.equals("exit")); 


	}
}
