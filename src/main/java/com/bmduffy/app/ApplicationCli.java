package com.bmduffy.app;

public class ApplicationCli {

    public static void main( String[] args ) {

        double x = 2.0;
        double y = 1.0;

        System.out.println( "Hello World!" );
        System.out.println( "Add      = " + (Calculator.add(x, y)) );
        System.out.println( "Subtract = " + (Calculator.subtract(x, y)) );
    }
}
