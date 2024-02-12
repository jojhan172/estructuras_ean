package ean.POOBasics;
import ean.strings.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu \nElije un numero para cada clase \n1. Persona \n2. Triangulo\n3. Tabla de multiplicar  \nIngresa 0 para salir");
        int option = sc.nextInt();
        if (option == 0){
            System.out.println("Terminaste el programa.");
            return;
        } else if (option == 1){
            Persona persona1 = new Persona();
            persona1.inicializar();
            persona1.imprimir();
            persona1.esMayorEdad();

        } else if (option == 2) {
            Triangulo triangulo1=new Triangulo();
            triangulo1.inicializar();
            triangulo1.ladoMayor();
            triangulo1.esEquilatero();

        }else if (option == 3){
            TablaDeMultiplicar tabla;
            tabla=new TablaDeMultiplicar();
            tabla.cargarValor();

        }
    }
}