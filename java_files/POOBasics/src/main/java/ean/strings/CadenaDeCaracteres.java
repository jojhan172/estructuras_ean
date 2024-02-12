package ean.strings;

import java.util.Scanner;
public class CadenaDeCaracteres {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        String nombre1,nombre2;
        int edad1,edad2;

        System.out.print("Ingrese el nombre: ");
        nombre1=teclado.next();

        System.out.print("Ingrese edad: ");
        edad1=teclado.nextInt();

        System.out.print("Ingrese el nombre: ");
        nombre2=teclado.next();

        System.out.print("Ingrese edad: ");
        edad2=teclado.nextInt();

        if (edad1>edad2) {
            System.out.print("La persona de mayor edad es: ");
            System.out.print(nombre1);
        } else if (edad1 == edad2){
            System.out.print("Ambas personas tienen la misma edad");
        }else{
            System.out.print("La persona de mayor edad es: ");
            System.out.println(nombre2);
        }
    }
}