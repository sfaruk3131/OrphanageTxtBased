package People;

public class Player {
    public String name;
    public int hP;
    public int sttk;
    public int xLoc, yLoc;

    public int getxLoc()
    {
        return xLoc;
    }

    public void setxLoc(int xLoc)
    {
        this.xLoc = xLoc;
    }

    public int getyLoc()
    {
        return yLoc;
    }

    public void setyLoc(int yLoc)
    {
        this.yLoc = yLoc;
    }

    public Player (String name,int xLoc, int yLoc)
    {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.name = name;
    }


}
