// 1- EJERCICIO CONDICIONALES JAVA
// Preguntas la edad, y según la respuesta, le contestas:
// estás en primaria/ secundaria/ universidad/ trabajando
// +EXTRA: que si pone menos de 6 o más 120, dar un mensaje de error

import java.util.Scanner;

public class Java2ejercicio1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuál es tu edad?");
        int edad = sc.nextInt();

        sc.close();

        if (edad >= 6 && edad <=12){
            System.out.println("Estas en Primaria!");
        } else if (edad > 12 && edad < 18){
            System.out.println("Estas en Secundaria!");
        } else if (edad >= 18) {
            System.out.println("Estas en la universidad!");
        } else if (edad < 6 && edad > 120) {
            System.out.println("Error 404.");
        } else {
            System.out.println("Por favor, introduce un valor numerico.");
        }
    
    }
}
