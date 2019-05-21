package Board;

public class lostChild extends Enemy{
    public String[] names = {"Annie", "Daniel", "Stephanie", "Dirk", "Jerome", "Stacy", "Vivian"};
    public String name =  "Lost child " + names[(int) (Math.random() * Math.floor(7))];
    public static int hp = 1;
    public static int attk = 1;
    public static int def = 1;
}
