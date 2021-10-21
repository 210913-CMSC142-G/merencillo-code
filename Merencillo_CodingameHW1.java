import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        //these variables build a rectangle that minimizes the search area
        int X1 = 0;
        int Y1 = 0;
        int X2 = W - 1;
        int Y2 = H - 1;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            if (bombDir.contains("U") == true){
                Y2 = Y0 - 1;
                //takes the upper part of rectangle relative to current position
            }else if (bombDir.contains("D") == true){
                Y1 = Y0 + 1;
                //takes the lower part of rectangle relative to current position
            }

            if (bombDir.contains("L") == true){
                X2 = X0 - 1;
                //takes the left part of rectangle relative to surrent position
            }else if (bombDir.contains("R") == true){
                X1 = X0 + 1;
                //takes the right part of rectangle relative to surrent position
            }

            X0 = X1 + (X2 - X1) / 2;
            Y0 = Y1 + (Y2 - Y1) / 2;
            //calculates the middle of the rectangle that batman should jump to


            // the location of the next window Batman should jump to.
            //System.out.println("0 0");
            System.out.println(X0 + " " + Y0);
        }
    }
}