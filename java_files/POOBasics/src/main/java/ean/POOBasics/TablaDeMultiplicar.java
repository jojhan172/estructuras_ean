package ean.POOBasics;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public void cargarValor() {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese valor ó elija -1 para cancelar: ");
            valor=teclado.nextInt();
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1);
    }

    public void calcular(int v) {
        for(int f=v;f<=v*10;f=f+v) {
            System.out.print(f+"-");
        }
    }

    public static void main(String[] ar) {
        TablaDeMultiplicar tabla;
        tabla=new TablaDeMultiplicar();
        tabla.cargarValor();
    }
}
