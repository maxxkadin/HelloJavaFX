package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator theCalculator;

    @BeforeEach
    void createCalculator() {
        theCalculator = new Calculator();
    }

    @Test
    void appendToMainNumber() {
        assertEquals("0",theCalculator.getMainNumber());
        theCalculator.appendToMainNumber("0");
        assertEquals("00",theCalculator.getMainNumber());
    }

    @Test
    void resetMainNumber() {
        theCalculator.appendToMainNumber("0");
        assertEquals("00",theCalculator.getMainNumber());
        theCalculator.resetMainNumber();
        assertEquals("0",theCalculator.getMainNumber());
    }

    @Test
    void getMainNumber() {
        assertEquals("0",theCalculator.getMainNumber());
    }

    @Test
    void add() {
        theCalculator.appendToMainNumber("1");
        theCalculator.storeAndResetMainNumber();
        theCalculator.add("1");
        assertEquals("10",theCalculator.getMainNumber());
    }

    @Test
    void storeAndResetMainNumber() {
        theCalculator.appendToMainNumber("1");
        theCalculator.storeAndResetMainNumber();
        assertEquals("0",theCalculator.getMainNumber());
    }
}