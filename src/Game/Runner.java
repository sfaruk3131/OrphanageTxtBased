package Game;

import Board.Map;
import People.Player;

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
            if(answer.toLowerCase().contains("small"))
            {
                layOut = new layOut[4][4];
                pChoice = true;

            }
            if(answer.toLowerCase().contains("medium"))
            {
                layOut = new layOut[5][5];
                pChoice = true;
            }
            if(answer.toLowerCase().contains("large"))
            {
                layOut = new layOut[6][6];
                pChoice = true;
            }
        }
        int eSpawn = 0;
        pChoice = true;
        while(pChoice == true)
        {
            System.out.println("Choose a difficulty easy, medium, or hard?");
            String answer = in.nextLine();
            if(answer.toLowerCase().contains("easy"))
            {
                System.out.println("Easy it is.");
                eSpawn = 2;
                pChoice = false;
            }
            if(answer.toLowerCase().contains("medium"))
            {
                System.out.println("Medium it is.");
                eSpawn = 3;
                pChoice = false;
            }
            if(answer.toLowerCase().contains("hard"))
            {
                System.out.println("Hard it is");
                eSpawn = 4;
                pChoice = false;
            }
        }
        System.out.println("In order to move type in n,s,e,w for North,South,East ,and West respectively");


    }

}
