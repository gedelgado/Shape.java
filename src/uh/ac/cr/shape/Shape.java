package uh.ac.cr.shape;

import java.sql.SQLOutput;

public class Shape {

    public void printDiamond(int lengthDesired) {

        //Creating a new line, just an visual printing.
        System.out.println();

        //Calculating number of rows that should be printed.
        int rowsToPrint = lengthDesired / 2 + 1;

        //For loop to print all the blanks required before printing the * on the next for loop.
        for (int actualRow = 1; actualRow <= rowsToPrint; actualRow++) {
            //Blank spaces to print
            for (int blank = 1; blank <= rowsToPrint - actualRow; blank++) {
                System.out.print(" ");
            }
            //Printing all the * required.
            for (int symbol = 1; symbol <= (2 * actualRow) - 1; symbol++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Printing second half of the shape.
        rowsToPrint--;
        for (int actualRow = 1; actualRow <= rowsToPrint; actualRow++) {
            //For loop to print all the blanks required before printing the * on the next for loop.
            for (int blank = 1; blank <= actualRow; blank++) {
                System.out.print(" ");
            }
            //Printing all the * required.
            for (int symbol = 1; symbol <= (rowsToPrint - actualRow) * 2 + 1; symbol++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //TODO Analyze this code and check why significant variable names and internal documentation are important.
    //TODO - What does variable x, y, z, dist1 and dist2 are doing in this code?
    //Todo - Is it easiest to understand the code when it has internal documentation?

    public void printHeart(int size) {
        System.out.println();   //Creating a new line, just an visual printing.
        int magnitude = 4;
        // first part of the heart
        for (int x = 0; x < magnitude; x++) {  //x=rows
            for (int y = 0; y <= 4 * magnitude; y++) {  // y=element                             // dist1 and dist 2 determines if you have to put a space or an asterisk.
                double dist1 = Math.sqrt(Math.pow(x - magnitude, 2) + Math.pow(y - magnitude, 2));    // use methods that returns value of x to the power of y and Returns the square root of x
                double dist2 = Math.sqrt(Math.pow(x - magnitude, 2) + Math.pow(y - 3 * magnitude, 2));
                if (dist1 < magnitude + 0.5 || dist2 < magnitude + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        //second part of the heart triangulo invertido
        for (int x = 1; x < 2 * magnitude; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < 4 * magnitude + 1 - 2 * x; y++) {  //Printing all the * required.
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void printSquare(int size) {

        System.out.println(" ");   //Creating a new line, just an visual printing.

        //For loop to print all the blanks required before printing the * on the next for loop.
        for (int row = 0; row <= size; row++) {
            for (int point = 0; point <= size; point++) {
                if (point == size) {   //Printing all the * required.
                    System.out.print("*");
                } else {
                    System.out.print("*_");
                }
            }
            System.out.println("");
        }
    }
    public void printRectangle(int height, int width) { // Parametros altura y ancho.
        System.out.println(" ");   //Creating a new line, just an visual printing.

        //For loop to print all the blanks required before printing the * on the next for loop.
        for (int row = 0; row <= height; row++) {
            for (int point = 0; point <= width; point++) {
                if (point == width) {  //Printing all the * required.
                    System.out.print("*");
                } else {
                    System.out.print("*_");
                }
            }
            System.out.println("");
        }
    }
    public void printCircle(int radius){
        int diameter = radius % 2== 0 ? radius * 2 : radius * 2 - 1;
        int point = radius;
        int cont= 0;
        boolean allow = true;

        System.out.println("");

        for(int row= 0; row <= radius; row++){
            //bucle para imprimir los espacios antes de los puntos
            for(int slot =0; slot < (diameter-point)/2; slot++){
                System.out.print(" ");
            }
            //los puntos de una fila se imprimen
            for (int asterisk = 0; asterisk < point; asterisk++){
                System.out.print("*");
            }
            System.out.println("");
            //
            if (point!= diameter && allow){
                point+=2;
            }else if(cont<radius){
                //
                while (cont < radius){
                    for (int asterisk = 0; asterisk < point; asterisk++){
                        System.out.print("*");
                    }
                    System.out.println("");
                    cont++;
                }
            } else {
                allow = false;
                point-=2;
            }
        }
        System.out.println("");
    }

  }
    



