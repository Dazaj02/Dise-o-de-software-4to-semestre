package Model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        System.out.println("--- SISTEMA DE GESTIÓN EDITORIAL ---");
        System.out.println("1. Registrar un Libro");
        System.out.println("2. Registrar un Disco");
        System.out.println("3. Registrar un Video");
        System.out.print("Seleccione una opción: ");

        if (input.hasNextInt()) {
            opcion = input.nextInt();
        }
        input.nextLine();

        System.out.print("Ingrese el título: ");
        String titulo = input.nextLine();

        System.out.print("Ingrese el precio: ");
        double precio = input.nextDouble();


        switch (opcion) {
            case 1 -> {
                System.out.print("Año de publicación: ");
                int anio = input.nextInt();
                System.out.print("Número de páginas: ");
                int paginas = input.nextInt();

                Libro miLibro = new Libro(titulo, precio, anio, paginas);
                System.out.println("\nObjeto creado:");
                System.out.println(miLibro.toString());
            }
            case 2 -> {
                System.out.print("Duración en minutos: ");
                float minutos = input.nextFloat();

                Disco miDisco = new Disco(titulo, precio, minutos);
                System.out.println("\nObjeto creado:");
                System.out.println(miDisco.toString());
            }
            case 3 -> {
                System.out.println("Seleccione el Idioma:");
                System.out.println("1. Español");
                System.out.println("2. Inglés");
                System.out.println("3. Portugués");
                System.out.print("Opción de idioma: ");
                int idOpc = input.nextInt();

                Idioma idiomaSeleccionado = switch (idOpc) {
                    case 2 -> Idioma.INGLES;
                    case 3 -> Idioma.PORTUGUES;
                    default -> Idioma.ESPAÑOL;
                };

                System.out.print("Duración en horas (ejemplo 1,5): ");
                float horas = input.nextFloat();

                Video miVideo = new Video(titulo, precio, idiomaSeleccionado, horas);
                System.out.println("\nObjeto creado:");
                System.out.println(miVideo.toString());
            }
            default -> System.out.println("Opción no válida");
        }

        input.close();
        System.out.println("\n--- Proceso finalizado ---");
    }
}