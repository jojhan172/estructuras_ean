package ean.notas;

import java.lang.*;
import java.text.DecimalFormat;
import java.util.*;
public class notas_arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la nota que deseas sacar este semestre\n");
        float goal = sc.nextFloat();
        System.out.print("Ingresa la catidad de notas totales\n");
        int notesQuantity = sc.nextInt();
        float[] grades = new float[0];
        for (int i = 0; i<notesQuantity; i++){
            System.out.println("Ingresa la nota " + (i+1) + "\n");
            float grade = sc.nextFloat();
            int oldArrayLength = grades.length;
            grades = addToArray(oldArrayLength, grades, grade);
        }
        System.out.println(Arrays.toString(grades));

        necessaryGrade(grades, goal, notesQuantity);
    }

    static float[] addToArray(int oldArrayLength, float[] oldArray, float newElement){
        float[] newArray = new float[oldArrayLength+1];

        for (int i = 0; i<oldArrayLength; i++){
            newArray[i] = oldArray[i];
        }
        newArray[oldArrayLength] = newElement;
        return newArray;
    }

    static float necessaryGrade(float[] grades, float goal, int notesQuantity){
        DecimalFormat df = new DecimalFormat("#.00");
        //float totalActualGrades = 0;
        //for (int i = 0; i< notesQuantity; i++){
        //  totalActualGrades = (grades[0]*(0.1)) - (grade2*per2) - (grade3*per3) - (grade4*per4);
        //}

        float gradeNeeded = (float) ((goal - (grades[0]*(0.1)) - (grades[1]*(0.15)) - (grades[2]*(0.2)) - (grades[3]*(0.25))) /  (0.3));

        System.out.println("Necesitas sacar minimo: " + df.format(gradeNeeded));
        return gradeNeeded;
    }
}
