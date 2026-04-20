package com.pluarlsight;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = {"Be yourself; everyone else is already taken.",
                "In the end, we only regret the chances we didn’t take.",
                "Do what you can, with what you have, where you are.",
                "Success is not final, failure is not fatal: it is the courage to continue that counts.",
                "Believe you can and you're halfway there.",
                "The only way to do great work is to love what you do.",
                "Life is what happens when you're busy making other plans.",
                "You miss 100% of the shots you don’t take.",
                "Act as if what you do makes a difference. It does.",
                "Hardships often prepare ordinary people for an extraordinary destiny."};
        boolean isDone = false;
        while (!isDone) {
            System.out.print("Play Quote Me:\nPick a Number 1 to 10\nYou can also enter R for random -> ");
            String input = scanner.nextLine();
            String answer;
            int numberInput;
            try {
                if (input.equalsIgnoreCase("r")){
                    numberInput = (int)(Math.random() * (10 - 1 + 1)) + 1;
                } else {
                    numberInput = Integer.parseInt(input);
                    numberInput--;
                }
                System.out.println(quotes[numberInput]);
            } catch (Exception A) {
                System.out.println("Whoa bud that numbers not going to work");
            }
            System.out.println("Want another quote? Y or N: ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("N")){
                isDone = true;
            }
        }
    }
}
