import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.eng.ailton.rpncalculator.RPNCalculatorModel;

/**
 * Created by ailtonljr on 01/08/15.
 */
public class RPNCalculatorModelTest {

    @Test
    public void testDisplay(){

        RPNCalculatorModel calculator = new RPNCalculatorModel();

        calculator.NumberPressed("0");
        calculator.NumberPressed("0");
        calculator.NumberPressed("2");
        calculator.NumberPressed("0");
        calculator.NumberPressed("3");

        String expected = "203";

        String atual = calculator.getDisplay();

        assertEquals(expected,atual);


    }

    @Test
    public void testOperations(){

        RPNCalculatorModel calculator = new RPNCalculatorModel();

        calculator.NumberPressed("2");
        calculator.OperationPressed("=");
        calculator.NumberPressed("3");
        calculator.OperationPressed("=");
        calculator.NumberPressed("4");
        calculator.OperationPressed("=");
        calculator.OperationPressed("*");
        calculator.OperationPressed("+");
        String expected = "14";

        String atual = calculator.getDisplay();

        assertEquals(expected,atual);
    }

}
