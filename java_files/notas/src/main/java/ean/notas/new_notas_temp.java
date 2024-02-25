package ean.notas;

import java.util.Scanner;

public class new_notas_temp {

    private String[] names;
    private int[] ids;
    private float[] corte1;
    private float[] corte2;
    private float[] corte3;
    private float[] corte4;
    private float[] definitivas;
    public int menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Cargar \n2. Ordenar\n3.Calcular Definitiva\n0. Salir");
        int option = sc.nextInt();
        return option;
    }

    /* La función check verifica que la nota ingresada por el usuario cumpla
    *  con los parametros establecidos es decir que la nota este solo entre 0 y 100
    */
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
        // Se instancian los distintos arrays con el tamaño indicado por el usuario
        names = new String[totalStudents];
        ids = new int[totalStudents];
        corte1 = new float[totalStudents];
        corte2 = new float[totalStudents];
        corte3 = new float[totalStudents];
        corte4 = new float[totalStudents];
        definitivas = new float[totalStudents];

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

    public void swap(float[] array, int i, int j){
        float temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /*
    Los swap son para ordenar los ids de menor a mayor, se tienen 3 con float, String, int para que
    estos puedan ser leídos correctamente según el tipo de dato
     */

    private void sortById() {
        for (int i = 0; i < ids.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ids.length; j++) {
                if (ids[j] < ids[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(ids, i, minIndex);
                swap(names, i, minIndex);
                swap(corte1, i, minIndex); // Usa la versión del método swap para float[]
                swap(corte2, i, minIndex); // Usa la versión del método swap para float[]
                swap(corte3, i, minIndex); // Usa la versión del método swap para float[]
                swap(corte4, i, minIndex); // Usa la versión del método swap para float[]
                swap(definitivas,i ,minIndex);
            }
        }
    }

    /*
    Este método se busca el el número de ID más bajo dentro de los elementos del array, se hacen comparaciones según los
    datos ingresados y se guarda el número más bajo dentro del minIndex, con le método swap se intercambian los elementos
    del array.
     */

    private void calcularDefinitiva(int i){
        /* Se usaron las ponderaciones que usa la EAN
         * ponderaciones
         * corte 1 = 20%
         * corte 2 = 30%
         * corte 3 = 30%
         * corte 4 = 20%
         * total = 100%
         */
        definitivas[i] = (float) ((corte1[i]*(0.2)) + (corte2[i]*(0.3)) + (corte3[i]*(0.3)) + (corte4[i]*(0.2)));
        // Expresion regular para el formateo de strings en java, los numeros significan el espacio entre los datos
        // y las letras el tipo de dato
        System.out.printf("%-12d%-12s%-12.2f%-12.2f%-12.2f%-12.2f%-12.2f%n", ids[i], names[i], corte1[i], corte2[i], corte3[i], corte4[i], definitivas[i]);
    }

    private float calcularPromedioCurso(float[] definitivas){
        float contador = 0;
        for (float i: definitivas){
            contador += i;
        }
        return contador/definitivas.length;

    }

    public static void main (String[] args) {

        new_notas_temp notas = new new_notas_temp(); // se instancia un nuevo objeto para poder usar los nuevos metodos

        int totalStudents;
        Scanner sc = new Scanner(System.in);

        int option = notas.menu();

        // Ingresar 0 permite al usuario salir del programa
        while (option != 0){
            switch (option) {
                case 1:
                    System.out.println("Ingrese la cantidad total de estudiantes");
                    totalStudents = sc.nextInt();
                    notas.loadData(totalStudents);
                case 2:
                    final int N = notas.ids.length;
                    System.out.println("Id          Nombre      Corte 1     Corte 2     Corte 3     Corte 4");
                    for (int i = 0; i < N; i++){
                        // Expresion regular para el formateo de strings en java, los numeros significan el espacio entre los datos
                        // y las letras el tipo de dato
                        System.out.printf("%-12d%-12s%-12.2f%-12.2f%-12.2f%-12.2f%n", notas.ids[i], notas.names[i], notas.corte1[i], notas.corte2[i], notas.corte3[i], notas.corte4[i]);
                    }

                    notas.sortById();

                    break;
                case 3:
                    int n = notas.ids.length;
                    System.out.println("Id          Nombre      Corte 1     Corte 2     Corte 3     Corte 4     Definitiva");
                    for (int i = 0; i < n; i++){
                        notas.calcularDefinitiva(i);
                    }
                    System.out.println("\nEl promedio del curso es de: " + notas.calcularPromedioCurso(notas.definitivas));

            }
            option = notas.menu();
        }
    }
}