package com.bmduffy.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CalculatorTest extends TestCase {

    public CalculatorTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( CalculatorTest.class );
    }

    @Test public void testAdd(){
      assertEqual( Calculator.add(1.0, 2.0), 3.0 );
    }

    @Test public void testSubtract() {
      assertEqual( Calculator.subtract(2.0, 1.0), 1.0);
      assertEqual( Calculator.subtract(1.0, 2.0), -1.0);
    }

    @Test public void testCalculate() {
      assertEqual(Calculator.compute("2 + 2"), 4.0);
      assertEqual(Calculator.compute("(3-9) + 2", -4.0);
    }
}
