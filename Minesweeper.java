import java.util.Random;

public class Minesweeper
{
    private int numRows = 5;
    private int numCols = 5; 
    private int numMines;
    private Cell[][] grid = Cell[numCols][numRows];;
    
    public Minesweeper()
    {
        placeMines();
        setCounts();
    }
    private void setCounts()
    {
        for(int i = 0; i < numCols; i++)
        {
            for(int j = 0; i < numRows; i++)
            {
                if(grid[i][j].getMined() == false)
                {
                    grid[i][j].setAdjCount(getAdjMineCount(i, j));
                }
            }
        }
    }
    private void placeMines()
    {
        Random rand = new Random();
        int row;
        int col;

        for(int i = 0; i < numMines; i++)
        {
            row = rand.nextInt(numRows);
            col = rand.nextInt(numCols);

            grid[row][col].setMined(true);
        }
    }
    public int getAdjMineCount(int i, int j)
    {
        
        return Int;
    }
    public int getMarkCount()
    {
        return Int;
    }
    public void show()
    {
        for(int i = 0; i < numCols; i++)
        {
            for(int j = 0; j < numRows; j++)
            {
                cells[j][i].show();
            }
        }
    }
    public void uncoverAll()
    {

    }
    public Cell getAdjacentCell(int r, int c, int direction)
    {
        return Cell;
    }
    public boolean allNonMinesUncovered()
    {
        return true;
    }
    public boolean allMinesMarked()
    {
        return true;
    }
    public void game()
    {

    }
    public static void play()
    {
        Minesweeper mine = new Minesweeper();
        mine.game();
    }

}