package ejerciciosTraductor;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercio10 {

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
		String entrada;
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<5; i++) {
			Random generator = new Random();
			Object[] values = diccionario.keySet().toArray();
			Object randomValue = values[generator.nextInt(values.length)];
			
			System.out.println("Traduce " + randomValue + ": ");
			entrada = sc.nextLine();
			
			traduccion = diccionario.get(randomValue);
			

				if(entrada.equals(traduccion) ) {
					System.out.println("La traduccion es correcta \n");
					contador++;
				
				} else {
					System.out.println("La traduccion es incorrecta \n");
				}
		
		}
		
		System.out.println("Obtuviste " + contador + " respuestas correctas \n");
		System.out.println("Y " + (i-contador) + " respuestas incorrectas \n");
	}	
}

