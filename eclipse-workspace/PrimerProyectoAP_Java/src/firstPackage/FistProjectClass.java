package firstPackage;

public class FistProjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroInicio = 5;
		int numeroFin = 14;
		
		//primer ejercicio
		//Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
		//y “b”. Su código puede arrancar (por ejemplo):
		// Se deberían mostrar los números:
		//5,6,7,8,9,10,11,12,13,14
		
		while (numeroInicio <= numeroFin) {
				System.out.println(numeroInicio);
				numeroInicio = numeroInicio+1;
		}
		
		//b. A lo anterior, solo muestre los números pares
		
		
		while (numeroInicio <= numeroFin) {
			if (numeroInicio%2==0) {
				System.out.println("Muestro los pares");
				System.out.println(numeroInicio);
				numeroInicio = numeroInicio+1;
			}
		 else {
			numeroInicio = numeroInicio+1;
		}
		}
//		//c. A lo anterior, con una variable extra, elija si se deben mostrar los números
//		//	pares o impares
			
		boolean pares = true;
			
		while (numeroInicio <= numeroFin) {
				if (pares == true) {
					System.out.println("Muestro los pares");
					if(numeroInicio%2 == 0) {
						System.out.println(numeroInicio);}
					numeroInicio = numeroInicio+1;
				}
		else {
			System.out.println("Muestro los impares");
			if(numeroInicio%2 != 0) {
				System.out.println(numeroInicio);}
			numeroInicio = numeroInicio+1;}	
			}
		
		for (int i = numeroFin; i >= numeroInicio; i--) {
			System.out.println(i);
		}
	
//		d. Finalmente, vea si puede resolver el problema utilizando código Java. Por
//		ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
//		tendríamos el código que se muestra más abajo, y cambiando las variables
		
		int ingresos = 500000;
		
		int vehiculosNuevos = 4;
		
		boolean bienesDeLujo = true;
		
		int propiedades = 4;
		
		if (ingresos >= 489083||vehiculosNuevos>=3||propiedades>=3||bienesDeLujo==true) {
			System.out.println("Pertenece a segmento de ingresos altos");
		}else {
			System.out.println("No pertenece a segmento de ingresos altos");
		}
		
	}
}


