package ean.notas;

import java.util.Scanner;

public class imprimir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        double promedio = calcularPromedioNotas(numEstudiantes);

        System.out.println("El promedio de notas de los " + numEstudiantes + " estudiantes es: " + promedio);
    }

    public static double calcularPromedioNotas(int numEstudiantes) {
        Scanner scanner = new Scanner(System.in);
        double totalNotas = 0;

        for (int i = 1; i <= numEstudiantes; i++) {
            System.out.print("Ingrese la nota del estudiante " + i + ": ");
            double nota = scanner.nextDouble();
            totalNotas += nota;
        }

        double promedio = totalNotas / numEstudiantes;
        return promedio;
    }
}
