package Game;

import Board.Map;

import java.util.Scanner;

public class Runner {
    public static Map[][] layOut;
    boolean gameOn = true;
    boolean fight = false;
    boolean run = false;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean pChoice = false;
        while(pChoice == false)
        {
            System.out.println("Do you want a small, medium, or a large board? Remember the larger the board the more difficult.");

            String answer = in.nextLine();

        }

    }
}
