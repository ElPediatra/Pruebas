import java.util.Scanner;

public class Tamagotchi {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hambre = 50;
        int felicidad = 50;
        String nombre;

        System.out.println("Bienvenido a Tamagotchi");
        System.out.println("Selecciona el nombre para tu Tamagotchi: ");
            nombre = teclado.nextLine();
        

        while (true) {
            System.out.println("\nSelecciona una opción: ");
            System.out.println("\t\t1. Jugar");
            System.out.println("\t\t2. Comer");
            System.out.println("\t\t3. Dormir");
            System.out.println("\t\t4. Salir");
            int option = teclado.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\033[36m"+nombre+" está jugando\033[0m");
                    System.out.println(" /\\__/\\ ");
                    System.out.println("(=^ .^=)");
                    System.out.println("  q  p   ");
                    System.out.println("   \\   /");
                    System.out.println("   (\\ /)");
                    System.out.println("    > <");
                    felicidad += 10;
                    hambre -= 10;
                    break;
                case 2:
                    System.out.println("\033[36m"+nombre+" está comiendo\033[0m");
                    System.out.println(" /\\__/\\ ");
                    System.out.println("(=^ .^=)");
                    System.out.println("   c   \"");
                    System.out.println("  ( v )");
                    System.out.println("   \\ / ");
                    hambre += 10;
                    felicidad -= 10;
                    break;
                case 3:
                    System.out.println("\033[36m"+nombre+" está durmiendo\033[0m");
                    System.out.println(" ZZZ ");
                    System.out.println(" /\\__/\\ ");
                    System.out.println("(=^ .^=)");
                    System.out.println("   c   \"");
                    System.out.println("  z  z");
                    hambre -= 10;
                    felicidad += 10;
                    break;
                case 4:
                    System.out.println("\033[36mAdiós!\033[0m");
                    return;
                default:
                    System.out.println("\033[36mOpción inválida\033[0m");
            }

            System.out.println("\033[36mHambre: " + hambre + "\033[0m");
            System.out.println("\033[36mFelicidad: " + felicidad + "\033[0m");

            if (hambre <= 0 || felicidad <= 0) {
                System.out.println("\033[36m"+nombre+" ha muerto\033[0m");
                System.out.println("          __________");
                System.out.println("         /          \\");
                System.out.println("        /            \\");
                System.out.println("       /   REST IN    \\");
                System.out.println("      /      PEACE    \\");
                System.out.println("     /                \\");
                System.out.println("    /__________________\\");
                return;
            }
        }
    }
}