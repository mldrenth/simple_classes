import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(5,2);
        assertEquals(40, printer.getPaper());
    }

    @Test
    public void cannotPrintIfNotEnoughPaper(){
        Printer lowPaperPrinter = new Printer(5, 100);
        lowPaperPrinter.print(5,2);
        assertEquals(5, lowPaperPrinter.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void tonerIsReducedBy10(){
        printer.print(5,2);
        assertEquals(90, printer.getToner());

    }

    @Test
    public void cannotPrintIfNotEnoughToner(){
        Printer lowTonerPrinter = new Printer(100, 5);
        lowTonerPrinter.print(5,2);
        assertEquals(5, lowTonerPrinter.getToner());
    }

}
