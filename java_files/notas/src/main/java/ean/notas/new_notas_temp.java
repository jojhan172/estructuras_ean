package ean.notas;

import java.util.Scanner;

public class new_notas_temp {
    private String[] names;
    private int[] ids;
    private float[] corte1;
    private float[] corte2;
    private float[] corte3;
    private float[] corte4;
    private float[] promedios;
    public int menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Cargar \n2. Ordenar\n3.Calcular Definitiva\n0. Salir");
        int option = sc.nextInt();
        return option;
    }

    public static float check(float nota){
        Scanner sc = new Scanner(System.in);
        if (nota < 0 || nota > 100){
            System.out.println("Ingrese un número válido");
            float new_nota = sc.nextFloat();
            check(new_nota);
        }else{
            return nota;
        }
        return nota;
    }

    public void loadData(int totalStudents){
        float nota;

        Scanner sc = new Scanner(System.in);

        names = new String[totalStudents];
        ids = new int[totalStudents];
        corte1 = new float[totalStudents];
        corte2 = new float[totalStudents];
        corte3 = new float[totalStudents];
        corte4 = new float[totalStudents];

        for ( int i = 0; i< totalStudents; i++){
            System.out.println("Ingrese el nombre del estudiante #" +(i+1));
            names[i] = sc.next();
            System.out.println("Ingrese el número de Id del estudiante #" +(i+1));
            ids[i] = sc.nextInt();
            for (int j = 0; j<4; j++){
                System.out.println("Ingrese la nota del corte #"+(j+1)+" del estudiante #"+(i+1));
                switch (j){
                    case 0:
                        nota = sc.nextFloat();
                        float notaVerificada = check(nota);
                        corte1[i]= notaVerificada;
                        break;
                    case 1:
                        nota = sc.nextFloat();
                        notaVerificada = check(nota);
                        corte2[i] = notaVerificada;
                        break;
                    case 2:
                        nota = sc.nextFloat();
                        notaVerificada = check(nota);
                        corte3[i] = notaVerificada;
                        break;
                    case 3:
                        nota = sc.nextFloat();
                        notaVerificada = check(nota);
                        corte4[i] = notaVerificada;
                }
            }
        }
        return;
    }

    public static void quickSort(int[] numeros, String[] vector1, float[] vector2, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particionar(numeros, vector1, vector2, izquierda, derecha);
            quickSort(numeros, vector1, vector2, izquierda, indiceParticion - 1);
            quickSort(numeros, vector1, vector2, indiceParticion + 1, derecha);
        }
    }

    public static int particionar(int[] numeros, String[] vector1, float[] vector2, int izquierda, int derecha) {
        int pivote = numeros[derecha];
        int indiceMenor = (izquierda - 1);
        for (int i = izquierda; i < derecha; i++) {
            if (numeros[i] <= pivote) {
                indiceMenor++;
                intercambiarInt(numeros, indiceMenor, i);
                intercambiar(vector1, indiceMenor, i);
                intercambiarFloat(vector2, indiceMenor, i);

            }
        }
        intercambiarInt(numeros, indiceMenor + 1, derecha);
        intercambiar(vector1, indiceMenor + 1, derecha);
        intercambiarFloat(vector2, indiceMenor + 1, derecha);

        return indiceMenor + 1;
    }

    // Método genérico para intercambiar elementos en un vector
    public static <T> void intercambiar(T[] vector, int i, int j) {
        T temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
    public static <T> void intercambiarInt(int[] vector, int i, int j) {
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
    public static <T> void intercambiarFloat(float[] vector, int i, int j) {
        float temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }

    // Método para mostrar los vectores paralelos
    public static void mostrarVectoresParalelos(int[] numeros, String[] vector1, float[] vector2) {
        System.out.println("Números\tVector1\tVector2\tVector3\tVector4");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "\t" + vector1[i] + "\t" + vector2[i]);
        }
    }




    public static void main (String[] args) {

        new_notas_temp notas = new new_notas_temp(); // se instancia un nuevo objeto para poder usar los nuevos metodos

        int totalStudents;
        Scanner sc = new Scanner(System.in);

        int option = notas.menu();
        while (option != 0){
            switch (option) {
                case 1:
                    System.out.println("Ingrese la cantidad total de estudiantes");
                    totalStudents = sc.nextInt();
                    notas.loadData(totalStudents);
                case 2:
                    final int N = notas.ids.length;
                    notas.quickSort(notas.ids, notas.names, notas.corte1, 0, notas.ids.length);
                    System.out.println("Id     \tNombre     \tCorte 1");
                    notas.mostrarVectoresParalelos(notas.ids, notas.names, notas.corte1);
            }
            option = notas.menu();
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