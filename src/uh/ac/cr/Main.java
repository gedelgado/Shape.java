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
            System.out.println("What geometric figure do you want to make: ");
            System.out.println("1-diamond" + "\n" + "2-heart shape" + "\n" + "3-square" + "\n" + "4-rectangle" + "\n" + "5-circle" + "\n" + "6-finish");

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
                    System.out.println("Ingrese la longitud, en términos de símbolos, de la figura de corazon que desea imprimir. (El número debe ser par y natural");
                    int magnitude = scanner.nextInt();
                    shape.printHeart(5);
                    break;

                case 3: // Print square
                    scanner = new Scanner(System.in);
                    System.out.println("Ingrese la longitud, en términos de símbolos, de la figura del cuadrado  que desea imprimir. (El número debe ser par y natural)");
                    int length = scanner.nextInt();
                    shape.printSquare(length);
                    System.out.println();
                    break;

                case 4: //Print rectangle
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese la altura y ancho, en términos de símbolos, de la figura rectangular que desea imprimir. (El número debe ser par y natural)");
                    int height=scanner.nextInt();
                    int width=scanner.nextInt();
                    shape.printRectangle(5, 8);
                    System.out.println();
                    break;

                case 5:// Print circle
                    scanner=new Scanner(System.in);
                    System.out.println("Ingrese el radio, en términos de símbolos, de la figura circular que desea imprimir. (El número debe ser par y natural)");
                    int radius=scanner.nextInt();
                    shape.printCircle(5);
                    break;

                case 6: // finish
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Valor incorrecto, por favor ingrese un valor dentro del rango 1 a 6");
                    break;

            }
        } while (option <6 );{
            System.out.println(option);
            option++;

        }

    }
}
