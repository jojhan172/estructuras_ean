package ean.notas;

import java.util.Scanner;

public class Classtests {

    public static void notas() {
        float porcentajes[] = {0.3f, 0.2f, 0.2f, 0.3f}; // establecer los porcentajes
        float corte1[]; // notas de cada corte
        float corte2[];
        float corte3[];
        float corte4[];
    }

    public static float[] calcularNota(float[] corte1, float[] corte2, float[] corte3, float[] corte4, float[][] porcentajes, int totalStudents) {
        float[] finalNote = new float[totalStudents];
        
        for(int i = 0; i < totalStudents; i++){
            finalNote[i] = (corte1[i] * porcentajes[i][0]) + (corte2[i] * porcentajes[i][1]) + (corte3[i] * porcentajes[i][2]) + (corte4[i] * porcentajes[i][3]);
        }
        
        return finalNote;
    }
}

