package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String  quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] quoteAryy = quote.toCharArray();
        for (int i = 0; i < quoteAryy.length; i++){
          HashMap<Character, Integer> characterCount = new HashMap<>();
          characterCount.put(quoteAryy[i], +1);
        System.out.println(characterCount);
        }
    }
}