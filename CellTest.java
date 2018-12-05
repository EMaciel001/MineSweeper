import java.util.*;

public class CellTest
{
    public static void trace(String msg, Cell c)
    {
        System.out.print(msg + ":\t\t");
        c.show();
        System.out.println();
    }
    public static void main(String[] args)
    {
        Cell c = new Cell(1, 3); trace("initial", c);
        c.setMined(true);        trace("mined", c);
        c.setMarked(true);       trace("marked", c);
        c.setMarked(false);      trace("unmarked", c);
        c.setUncovered();        trace("uncovered", c);
        System.out.println();
        
        Cell d = new Cell(2, 5); trace("initial", d);
        d.setMined(false);        trace("mined", d);
        d.setAdjCount(3);        trace("adj ct 3", d);
        d.setMarked(true);       trace("marked", d);
        d.setMarked(false);      trace("unmarked", d);
        d.setUncovered();        trace("uncovered", d);
        System.out.println();
        
        Cell e = new Cell(2, 5); trace("initial", e);
        e.setMined(false);        trace("mined", e);
        e.setAdjCount(0);        trace("adj ct 3", e);
        e.setMarked(true);       trace("marked", e);
        e.setMarked(false);      trace("unmarked", e);
        e.setUncovered();        trace("uncovered", e);
    }
}