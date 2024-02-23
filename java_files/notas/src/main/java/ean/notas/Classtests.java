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

    public static float calcularNota(float corte1, float corte2, float corte3, float corte4, float[] porcentajes) {
        float finalNote = (corte1 * porcentajes[0]) + (corte2 * porcentajes[1]) + (corte3 * porcentajes[2]) + (corte4 * porcentajes[3]);
        return finalNote;
    }
}

