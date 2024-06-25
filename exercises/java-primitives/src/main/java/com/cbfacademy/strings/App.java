package com.cbfacademy.strings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
            return word1.concat(word2).concat(word3) ; 
        }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
       return String.format ("Item: %s. Price: £%.2f. Quantity: %d", item,price,quantity);
     }
}