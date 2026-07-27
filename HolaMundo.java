import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido, " + nombre + ", a nuestro primer programa de Java!");
        System.out.println("Desea ver la información del equipo?");
        System.out.println("1) Si");
        System.out.println("2) No, salir del programa");
        Integer opcion = scanner.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("Bla bla bla acá va la información del equipo");
                break;
            case 2:
                System.out.println("Hasta pronto, gracias por usar nuestro programa.");
                break;
            default:
                System.out.println("Por favor, ingrese una opción válida.");
            }
        scanner.close();
    }
}