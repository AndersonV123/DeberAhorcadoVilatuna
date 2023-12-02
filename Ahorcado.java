import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        String[] palabras = {"computadora", "programacion", "java", "tecnologia", "desarrollo", "codigo", "informatica", "openai", "inteligencia", "algoritmo"};
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean jugar = true;

        while (jugar) {
            String palabraSeleccionada = palabras[rand.nextInt(palabras.length)];
            char[] palabraSecreta = new char[palabraSeleccionada.length()];
            for (int i = 0; i < palabraSecreta.length; i++) {
                palabraSecreta[i] = '_';
            }

            int intentos = 7;
            boolean palabraDescubierta = false;
            boolean[] letrasUsadas = new boolean[26];
            while (intentos > 0 && !palabraDescubierta) {
                System.out.println("\nPalabra a adivinar: " + String.valueOf(palabraSecreta));
                System.out.println("Intentos restantes: " + intentos);
                System.out.print("Ingresa una letra: ");
                char letra = scanner.next().charAt(0);

                boolean letraEncontrada = false;
                for (int i = 0; i < palabraSeleccionada.length(); i++) {
                    if (palabraSeleccionada.charAt(i) == letra) {
                        palabraSecreta[i] = letra;
                        letraEncontrada = true;
                    }
                }
            }
        }
    }
}