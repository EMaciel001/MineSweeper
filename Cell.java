import java.util.*;

public class Cell
{
    private int row, col;
    private boolean covered, marked, mined;
    private int adjcount;

    Random rand = new Random();

    public Cell(int r, int c)
    {
        row = r;
        col = c;
        covered = true;
        marked = false;
        mined = false;
        adjcount = 0;
    }
    public void show()
    {
        if(covered == true)
        {
            if(marked == true)
            {
                System.out.print("X");
            }
            else if(marked == false)
            {
                System.out.print("?");
            }
        }
        else
        {
            if(mined == true)
            {
                System.out.print("*");
            }
            else if(mined == false)
            {
                if(adjcount == 0)
                {
                    System.out.print("_");
                }
                else if(adjcount > 0)
                {
                    System.out.print(rand.nextInt(8) + 1);
                }
            }
        }
    }
    public boolean getMined()
    {
        return mined;
    }
    public void setMined(boolean m)
    {
        mined = m;
    }
    public boolean getCovered()
    {
        return covered;
    }
    public void setUncovered()
    {
        if(covered == true){
            if(marked == false){
                covered = false;
            }
            else{
                return;
            }
        }
        else{
            return;
        }
    }
    public boolean getMarked()
    {
        return marked;
    }
    public void setMarked(boolean m)
    {
        if(covered == true){
            marked = m;
        }
        else{
            return;
        }
    }
    public int getAdjCount()
    {
        return adjcount;
    }
    public void setAdjCount(int c)
    {
        adjcount = c;
    }
    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
}