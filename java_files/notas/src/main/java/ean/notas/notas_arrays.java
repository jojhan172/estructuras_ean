package ean.notas;

import java.lang.*;
import java.text.DecimalFormat;
import java.util.*;
public class notas_arrays {
    public static void main(String[] args){
        // float[][] student_grades = new float[10][4];
        // student_grades[0] = new float[]{1, 2, 3, 4};


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad total de estudiantes -> ");
        int total_students = sc.nextInt();

        System.out.print("Ingresa la catidad de notas por estudiante -> ");
        int notesQuantity = sc.nextInt();

        float[][] student_grades = new float[total_students][notesQuantity + 1];

        float goal = 60f; // minimum grade to approve
        //float[] grades = new float[0];

        for (int i = 0; i<total_students; i++){
            float[] grades = new float[0];
            for (int j = 0; j<notesQuantity; j++){
                System.out.println("Ingresa la nota " + (j+1) + " para el estudiante " + (i+1) + " ");
                float grade = sc.nextFloat();
                int oldArrayLength = grades.length;
                grades = addToArray(oldArrayLength, grades, grade);
                student_grades[i] = grades;
            }
            System.out.println("La nota necesaria para que el estudiante número " + (i+1) + " saque 60 es: " + necessaryGrade(student_grades[i], 60, notesQuantity) + " \n");
        }
    }

    static float[] addToArray(int oldArrayLength, float[] oldArray, float newElement){
        float[] newArray = new float[oldArrayLength+1];

        for (int i = 0; i<oldArrayLength; i++){
            newArray[i] = oldArray[i];
        }
        newArray[oldArrayLength] = newElement;
        return newArray;
    }

    static String necessaryGrade(float[] grades, float goal, int notesQuantity){
        DecimalFormat df = new DecimalFormat("#.00");
        //float totalActualGrades = 0;
        //for (int i = 0; i< notesQuantity; i++){
        //  totalActualGrades = (grades[0]*(0.1)) - (grade2*per2) - (grade3*per3) - (grade4*per4);
        //}

        float gradeNeeded = (float) ((goal - (grades[0]*(0.1)) - (grades[1]*(0.15)) - (grades[2]*(0.2)) - (grades[3]*(0.25))) /  (0.3));

        //System.out.println("Necesitas sacar minimo: " + df.format(gradeNeeded));
        return df.format(gradeNeeded);
    }
}
