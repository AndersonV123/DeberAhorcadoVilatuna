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

                if (!letrasUsadas[letra - 'a']) {
                    letrasUsadas[letra - 'a'] = true;
                    if (!letraEncontrada) {
                        intentos--;
                        System.out.println("Letra incorrecta.");
                    }
                } else {
                    System.out.println("Ya has usado esta letra. Prueba con otra.");
                }

                if (String.valueOf(palabraSecreta).equals(palabraSeleccionada)) {
                    palabraDescubierta = true;
                }
            }

            if (palabraDescubierta) {
                System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabraSeleccionada);
            } else {
                System.out.println("\nLo siento, has agotado tus intentos. La palabra era: " + palabraSeleccionada);
            }

            System.out.print("\n¿Quieres jugar de nuevo? (S/N): ");
            char respuesta = scanner.next().charAt(0);
            jugar = (respuesta == 'S' || respuesta == 's');
        }

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}