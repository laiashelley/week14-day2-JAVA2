// 3- MEDIA EDADES DE TUS PADRES
// Se pregunta al usuario el nombre y edad de su madre, y lo mismo de su padre.

// Al final, mostrar frase del tipo “Tu madre se llama Berta y tiene 55 años, y tu padre se llama Roberto y tiene 57 años, y la media de us edades es 56”

// OJO, tener en cuenta los decimales!
// Cuando os salga el error que tiene que salir después del nextInt( ) , me avisáis

// solución al problema del tercero: añadir un extra de teclado.nextLine() después del nextInt()

import java.util.Scanner;

public class Java2ejercicio3 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuál es el nombre de tu madre?");
        String nombreMadre = sc.nextLine();

        System.out.println("Cuál es el nombre de tu padre?");
        String nombrePadre = sc.nextLine();

        System.out.println("Cuál es la edad de tu madre?");
        int edadMadre = sc.nextInt();
    
        System.out.println("Cuál es la edad de tu padre?");
        int edadPadre = sc.nextInt();

        int numeroDivision = 2;

        float mediaEdades = (edadMadre+edadPadre)/numeroDivision;

        sc.close();

        System.out.println("Tu madre se llama " + nombreMadre + " y tiene " + edadMadre + " años, y tu padre se llama " + nombrePadre + " y tiene " + edadPadre + " años, y la media de sus edades es " + mediaEdades);
        
    }
}
