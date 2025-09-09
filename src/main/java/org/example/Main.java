package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         //programa para cerrar un ciclo
        //crear programa para crear un ciclo y crear un menu de opciones

        Integer opcionseleccionada=0;
        while (opcionseleccionada != 5){
            System.out.println("menu de opciones");
            System.out.println("*************************");
            System.out.println("digita 1 para sumar➕");
            System.out.println("digita 2 para restar➖");
            System.out.println("digita 3 para multiplicar✖");
            System.out.println("digita 4 para dividir➗");
            System.out.println("digita 5 para salir del programa🚫");
            Scanner leerTeclado=new Scanner(System.in);

            System.out.println("selecciones una opcion por favor:☺");
            opcionseleccionada=leerTeclado.nextInt();

            //evaluando caminos segun opcion del usuario
            if (opcionseleccionada==1) {
                System.out.println("SUMANDO");
            } else if (opcionseleccionada==2) {
                System.out.println("RESTANDO");
            } else if (opcionseleccionada==3) {
                System.out.println("MULTIPLICANDO");
            } else if (opcionseleccionada==4) {
                System.out.println("DIVIDIENDO");
            } else if (opcionseleccionada==5) {
                System.out.println("SALIENDO");
            }else {
                System.out.println("INVALIDO");
            }

        }
        }
    }
