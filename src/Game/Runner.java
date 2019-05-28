package Game;

import Board.Map;
import People.Player;

import java.util.Scanner;

public class Runner {
    public static Map[][] layOut = null;
    boolean gameOn = true;
    boolean fight = false;
    boolean run = false;
    int clues = 5;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean pChoice = false;
        while(pChoice == false)
        {
            System.out.println("Do you want a small, medium, or a large board? Remember the larger the board the more difficult.");

            String answer = in.nextLine();
            if(answer.toLowerCase().equals("small"))
            {
                layOut = new Map[4][4];
                pChoice = true;

            }
            if(answer.toLowerCase().equals("medium"))
            {
                layOut = new Map[5][5];
                pChoice = true;
            }
            if(answer.toLowerCase().equals("large"))
            {
                layOut = new Map[6][6];
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

        for(int x = 0; x < layOut.length; x++)
        {
            for(int y = 0; y < layOut[x].length; y++ )
            {
                if(eSpawn == 2) {
                    layOut[x][y] = new Map(x, y,2);
                }
                else if(eSpawn == 3)
                {
                    layOut[x][y] = new Map(x, y,3);
                }
                else
                {
                    layOut[x][y] = new Map(x,y,4);
                }
            }
        }

        boolean con = false;
        while(!con)
        {
            System.out.println("Please pick a character: Investigator or Sister. Enter the character name.");
            String a = in.nextLine();
            if(a.equalsIgnoreCase("investigator"))
            {
                System.out.println("");
            }
        }



    }

}
