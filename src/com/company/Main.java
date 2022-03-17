package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inpuData = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("========OPCIONES===========");
        System.out.println("==  1: Hamburguesa  10000==");
        System.out.println("==  2: Perros  8000      ==");
        System.out.println("==  3: Salchipapas  6000 ==");
        System.out.println("==  4: Chorizos   7000   ==");
        System.out.println("===========================");

        int groupoPeople;
        int dish = 0, cont = 0, subtotal = 0, contPlato1 = 0, contPlato2 = 0, contPlato3 = 0, contPlato4 = 0;
        double total = 0, descuento = 0;
        String propina = "";

        System.out.print("Introduce el número de personas que van a comer: ");
        groupoPeople = inpuData.nextInt();

        while (cont < groupoPeople) {
            System.out.print("ingrese el nombre del plato del cliente segun el menu: ");
            dish = inpuData.nextInt();


            if (dish == 1) {
                subtotal += 10000;
                contPlato1++;
            } else if(dish == 2) {
                subtotal += 8000;
                contPlato2++;
            } else if(dish == 3) {
                subtotal += 6000;
                contPlato3++;
            } else if(dish == 4) {
                subtotal += 7000;
                contPlato4++;
            } else {
                System.out.println("Opcion no valida");
            }

            cont++;

        }
        System.out.print("Desea incluir propina(s/n): ");
        propina = inpuData.next();

        total = subtotal;

        if(propina.equals("S") || propina.equals("s")) {
            total = subtotal + (subtotal*0.10);
        }

        if(contPlato1 >= 2 || contPlato2 >= 2 || contPlato3 >= 2 || contPlato4 >= 2){
            descuento = subtotal * 0.05;
            total = subtotal - descuento;
        }

        if (subtotal > 20000) {

            descuento = total * 0.10;
            total -= descuento;
            System.out.println("se le realizó un descuento por compras superiores a 20000 pesos de " + descuento);
        }

        System.out.println("Total a pagar " + total);


    }
}
