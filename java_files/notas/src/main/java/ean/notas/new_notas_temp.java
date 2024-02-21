package ean.notas;

import java.util.Scanner;

public class new_notas_temp {



    public static String[] cargarNombres(int cantidadEstudiantes, String[] nombresEstudiantes, int n ){
        Scanner sc = new Scanner(System.in);
        // n = student array position
        // función para añadir todos los nombres al array de nombres
        System.out.println("Ingresa el nombres del estudiante");
        nombresEstudiantes[n] = sc.next();

        return nombresEstudiantes;
    }



    public static float[][] cargarNotas(int cantidadEstudiantes, float[][] notas, int n, int j){
        // n = student array position
        // notas = [Cant. Estudiantes][N. Cortes]
        // Multi dim array = array[rows][columns]
        //              N. Cortes indx = 0 corte 1, indx 1 = corte 2,  indx n = corte n+1
        System.out.println("");
        //notas [n][j] =
        return notas;
    }

    public static void main (String args[]){
        String[][] nombres;
        float[][] notas;
        int cantidadEstudiantes;

        Scanner sc = new Scanner(System.in);
        // cantidadEstudiantes
        int option = -1;

        // Menu
        System.out.println("        Menu         \n");
        System.out.println("1. Cargar \n2. Ordenar\n3.Calcular Definitiva\nSalir");
        option = sc.nextInt();
        while (option != 0) {
            if (option == 1) {
                System.out.println("Ingrese la cantidad de estudiantes");
                cantidadEstudiantes=sc.nextInt();

                String[] nombresEstudiantes = new String[cantidadEstudiantes];

                for (int i = 0; i<cantidadEstudiantes; i++){
                    nombresEstudiantes = cargarNombres(cantidadEstudiantes, nombresEstudiantes, i);


                }

                notas = cargarNotas(cantidadEstudiantes);

                // ejecutar cargar
            } else if (option == 2) {
                option = sc.nextInt();
                //ejecutar QuickSort
            } else if (option == 3) {
                option = sc.nextInt();
                // ejecutar calcular
            } else {
                System.out.println("Ingresa un número valido");
                option = sc.nextInt();
            }

        }

    }
}