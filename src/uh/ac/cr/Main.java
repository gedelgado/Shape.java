package uh.ac.cr;

import uh.ac.cr.shape.Shape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //New object of shape.
        Scanner scanner;
        int option = 0;
        Shape shape = new Shape();
        scanner = new Scanner(System.in);

        do {
            //Asking What geometric figure do you want to make
            scanner = new Scanner(System.in);
            System.out.println("What geometric figure do you want to make: " +
                    "1-diamond" + "\n" + "2-heart shape" + "\n" + "3-square" + "\n" + "4-rectangle" + "\n" + "5-circle" + "\n" + "6-finish");
            System.out.println("Your answer");
            option = scanner.nextInt();
            switch (option) {
                case 1: // print Diamond
                    scanner = new Scanner(System.in);
                    System.out.println("Ingrese el alto, en términos de símbolos, de la figura rombo que desea imprimir. (El número debe ser par y natural)"+
                            "Su respuesta:");
                    int lengthDesired = scanner.nextInt();
                     //Print diamond
                    shape.printDiamond(lengthDesired);
                    break;

                case 2: //Print heart
                    scanner = new Scanner(System.in);
                    System.out.println("Ingrese el alto, en términos de símbolos, de la figura de corazon que desea imprimir. (El número debe ser par y natural)"+
                            "Su respuesta:");
                    System.out.println();
                    shape.printHeart();
                    break;

                case 3: // Print square
                    scanner = new Scanner(System.in);
                    System.out.println("Ingrese la longitud, en términos de símbolos, de la figura del cuadrado  que desea imprimir. (El número debe ser par y natural)");
                    int length = scanner.nextInt();
                    shape.printSquare(length);
                    break;

                case 4: //Print rectangle
                    scanner=new Scanner(System.in);


                    System.out.println("Ingrese la longitud, en términos de símbolos, de la figura rectangular que desea imprimir. (El número debe ser par y natural)");
                    int dec = 5;
                    shape.printRectangle(dec, 8);
                    break;

                case 5:// Print circle
                    shape.printCircle();
                    break;

                case 6: // finish
                    System.out.println("THE PROGRAM ENDED");

            }
        } while (option <6 );{
            System.out.println(option);
            option++;

        }

    }
}
