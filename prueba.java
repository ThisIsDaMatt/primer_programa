import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Variables
        String nombre;
        float altura;
        Integer edad;

        // Solicitud de datos
        System.out.println("Por favor, ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.println("Por favor, ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, ingrese su estatura: ");
        altura = sc.nextFloat();
        sc.nextLine();

        System.out.println("Su nombre es " + nombre + ", su edad es " + edad + ", su estatura es " + altura);

        System.out.println("La cantidad de letras de su nombre es " + nombre.length());

        sc.close();
    }
}