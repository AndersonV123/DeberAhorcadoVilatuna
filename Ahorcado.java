import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        String[] palabras = {"computadora", "programacion", "java", "tecnologia", "desarrollo", "codigo", "informatica", "openai", "inteligencia", "algoritmo"};
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean jugar = true;