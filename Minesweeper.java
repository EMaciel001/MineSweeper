public class Minesweeper
{
    private int numRows = 5, numCols = 5, numMines;

    private Cell[][] cells = new Cell[numRows][numCols];
    
    public Minesweeper()
    {
        
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