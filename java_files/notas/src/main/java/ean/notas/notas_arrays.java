package ean.notas;

import java.lang.*;
import java.text.DecimalFormat;
import java.util.*;
public class notas_arrays {
    public static void main(String[] args){

        float[] notas = {};


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa las notas");
        float grade1 = sc.nextFloat();
        float grade2 = sc.nextFloat();
        float grade3 = sc.nextFloat();
        float grade4 = sc.nextFloat();
        System.out.println("Ahora ingresa los porcentajes de cada nota");
        float per1= sc.nextFloat();
        float per2= sc.nextFloat();
        float per3= sc.nextFloat();
        float per4= sc.nextFloat();
        System.out.println("Ahora ingresa la nota que deseas sacar al final del curso");
        float final_grade = sc.nextFloat();

        find_grade(grade1, grade2, grade3, grade4, per1, per2, per3, per4, final_grade );
    }
    static void find_grade(float grade1, float grade2, float grade3, float grade4, float per1, float per2, float per3, float per4, float final_grade) { // the way to find the grade u need to aprove your course
        float per5 = 1 - (per1 + per2 + per3 + per4);
        float goal_grade = (final_grade - (grade1*per1) - (grade2*per2) - (grade3*per3) - (grade4*per4)) / per5;

        System.out.println("Necesitas sacar " + goal_grade + " para poder aprobar la materia con una nota final de: " + final_grade);
    }
}
