package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
public class Quote {
    public static void main(String[] args) {
        //count number of times each character occurs and print
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        ArrayList<Character> character = new ArrayList<>();
        for (int i = 0;i < quote.length(); i++) {
            character.add(quote.charAt(i));
        }
        HashMap<Character, Integer> counts = new HashMap<>();
        for(int i = 0;i < quote.length();i++) {
            counts.putIfAbsent(character.get(i), Collections.frequency(character, character.get(i)));
        }
        for (Map.Entry<Character, Integer> end : counts.entrySet()) {
            System.out.println(end.getKey() + ":" + end.getValue());



        }
    }
}
