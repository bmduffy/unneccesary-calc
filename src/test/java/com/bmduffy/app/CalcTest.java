package com.bmduffy.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalcTest extends TestCase {

    public AppTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( CalcTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}
