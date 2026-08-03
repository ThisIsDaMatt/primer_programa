import java.util.Scanner;

public class HolaMundoRepitiendo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido, " + nombre + ", a nuestro primer programa de Java!");
        System.out.println("Desea ver la información del equipo?");
        System.out.println("1) Si");
        System.out.println("2) No, salir del programa");
        Integer opcion = scanner.nextInt();
        while (opcion != 2) {
            switch(opcion) {
                case 1:
                    System.out.println("Somos Matias Munera y Esteban Gonzalez, y hablaremos de como funciona y como los programas usan la memoria RAM.");
                    break;
                default:
                    System.out.println("Por favor, ingrese una opción válida.");
            }
            System.out.println("Desea ver la información del equipo?");
            System.out.println("1) Si");
            System.out.println("2) No, salir del programa");
            opcion = scanner.nextInt();
        }
        System.out.println("Hasta pronto, gracias por usar nuestro programa.");
        scanner.close();
    }
}