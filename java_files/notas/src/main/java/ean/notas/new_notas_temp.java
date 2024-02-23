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

    public static int[] cargarId(int cantidadEstudiantes, int[] idEstudiantes, int n){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el Id del estudiante");
        idEstudiantes[n] = sc.nextInt();
        return idEstudiantes;
    }



    public static float[][] cargarNotas(int cantidadEstudiantes, float[][] notas, int i, int j){
        Scanner sc = new Scanner(System.in);
        // i = Posicion del estudiante dentro del array
        // notas = [Cant. Estudiantes][N. Cortes = 4]
        // Multi dim array = array[rows][columns]
        //              N. Cortes indx = 0 corte 1, indx 1 = corte 2,  indx n = corte n+1
        System.out.println("Ingresa la nota del corte "+(j+1));
        float nota = sc.nextFloat();
        if (nota < 0 || nota > 100){
            nota = take(nota);
        }
        notas [j][i] = nota;
        return notas;
    }

    public static void printMenu(){
        System.out.println("Menu");
        System.out.println("1. Cargar \n2. Ordenar\n3.Calcular Definitiva\n0. Salir");
    }

    public static float take(float nota){
        Scanner sc = new Scanner(System.in);
        nota = sc.nextFloat();
        if (nota < 0 || nota > 100){
            System.out.println("Ingrese un numero valido");
            take(nota);
        }else{
            return nota;
        }
        return nota;
    }

    public static void main (String[] args){
        String[] nombresEstudiantes;
        float[][] notas;
        int[] idEstudiantes;
        int cantidadEstudiantes;

        Scanner sc = new Scanner(System.in);
        // cantidadEstudiantes
        int option = -1;

        // Menu
        printMenu();
        option = sc.nextInt();
        while (option != 0) {
            if (option == 1) {
                System.out.println("Ingrese la cantidad de estudiantes");
                cantidadEstudiantes=sc.nextInt();

                nombresEstudiantes = new String[cantidadEstudiantes];
                notas = new float[4][cantidadEstudiantes];
                idEstudiantes = new int[cantidadEstudiantes];

                for (int i = 0; i<(cantidadEstudiantes); i++){
                    nombresEstudiantes = cargarNombres(cantidadEstudiantes, nombresEstudiantes, i);
                    for (int j = 0; j<4; j++){
                        notas = cargarNotas(cantidadEstudiantes, notas, i, j);
                    }
                    idEstudiantes = cargarId(cantidadEstudiantes, idEstudiantes, i);
                }

                System.out.println("Todos los estudiantes añadidos correctamente");
                printMenu();
                option = sc.nextInt();

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



/*
       [
*      [1,2,3,3]
       [1,2,3,3]
*      ]
*
*
* */