package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo1;
        Circulo circulo1;
        int cont = 0, b = 0, a = 0, r = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 1 para operar con el rectangulo");
        System.out.println("Ingrese 2 para operar con el circulo");
        String num = scanner.nextLine();
        cont = Integer.parseInt(num);
        if (cont == 1) {
            System.out.print("ingrese base:  ");
            String valor = scanner.nextLine();
            b = Integer.parseInt(valor);

            System.out.print("ingrese altura : ");
            valor = scanner.nextLine();
            a = Integer.parseInt(valor);

            rectangulo1 = new Rectangulo(b, a);

            System.out.println("Su Perimetro es: " + rectangulo1.obtenerPerimetro());
            System.out.println("Su Area es: " + rectangulo1.obtenerArea());

        } else {
            if (cont == 2) {
                System.out.print("ingrese radio : ");
                String val = scanner.nextLine();
                r = Integer.parseInt(val);
                circulo1 = new Circulo(r);
                System.out.println("su perimetro es " + circulo1.obtenerPerimetroCirculo());
            }
else {System.out.println("Terminado");}

        }
    }
}


