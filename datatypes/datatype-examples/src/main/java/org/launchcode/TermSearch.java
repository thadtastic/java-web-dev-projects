package org.launchcode;

import java.util.Scanner;

public class TermSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceInWonder = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        String AIW = aliceInWonder.toLowerCase();
        System.out.println("Search to see if a term is in the string");
//        String searchTerm = input.nextLine();

        if (aliceInWonder.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println(aliceInWonder.contains(searchTerm));
        }else{
            System.out.println(false);
        }
}
}
