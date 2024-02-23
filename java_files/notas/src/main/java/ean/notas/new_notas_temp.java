package ean.notas;

import java.util.Scanner;

public class new_notas_temp {
ew Scanner(System.in);

<<<<<<< HEAD
    public static void cargarNombres(){
        System.out.println("Ingrese la cantidad total de estudiantes");
        Scanner sc = n
=======
    private int totalStudents;
    private String[] names;
    private int[] ids;
    private float[] corte1;
    private float[] corte2;
    private float[] corte3;
    private float[] corte4;
    private float[] promedios;
    public void loadData(int totalStudents, int[] ids, float[] corte1, float[] corte2,float[] corte3,float[] corte4){

        Scanner sc = new Scanner(System.in);

        names = new String[totalStudents];

        for ( int i = 0; i< totalStudents; i++){
            System.out.println("Ingrese el nombre del estudiante #" +(i+1));
            names[i] = sc.next();
            System.out.println("Ingrese el número de Id del estudiante #" +(i+1));
            ids[i] = sc.nextInt();
            for (int j = 0; j<4; j++){
                System.out.println("Ingrese la nota del corte #"+(j+1)+" del estudiante #"+(i+1));
                switch (j){
                    case 0:
                        corte1[i]= sc.nextFloat();
                        break;
                    case 1:
                        corte2[i] = sc.nextFloat();
                        break;
                    case 2:
                        corte3[i] = sc.nextFloat();
                        break;
                    case 3:
                        corte4[i] = sc.nextFloat();
                }
            }
        }
>>>>>>> 9bee288762c220b2dc12f176c4c35e2940503a53
        return;
    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Cargar \n2. Ordenar\n3.Calcular Definitiva\n0. Salir");
        int option = sc.nextInt();
        return option;
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
        int totalStudents;
        String[] names;
        int[] ids;
        float[] corte1;
        float[] corte2;
        float[] corte3;
        float[] corte4;
        float[] promedios;

        Scanner sc = new Scanner(System.in);



        int option = menu();

        if (option == 1){
            System.out.println("Ingrese la cantidad total de estudiantes");
            totalStudents = sc.nextInt();
            names = new String[totalStudents];
            ids = new int[totalStudents];
            corte1 = new float[totalStudents];
            corte2 = new float[totalStudents];
            corte3 = new float[totalStudents];
            corte4 = new float[totalStudents];

            //data = loadData(totalStudents, names, ids, corte1, corte2, corte3, corte4);
        }

    }
}

        /*

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
*/

/*
       [
*      [1,2,3,3]
 *     [1,2,3,3]
*      ]
*
*
* */