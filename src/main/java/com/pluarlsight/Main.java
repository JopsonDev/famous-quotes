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
        System.out.print("Play Quote Me: Pick a Number 1 to 10 -> ");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
            case 1 -> System.out.println(quotes[0]);
            case 2 -> System.out.println(quotes[1]);
            case 3 -> System.out.println(quotes[2]);
            case 4 -> System.out.println(quotes[3]);
            case 5 -> System.out.println(quotes[4]);
            case 6 -> System.out.println(quotes[5]);
            case 7 -> System.out.println(quotes[6]);
            case 8 -> System.out.println(quotes[7]);
            case 9 -> System.out.println(quotes[8]);
            case 10 -> System.out.println(quotes[9]);
            default -> System.out.println("Whoa bud sorry that input doesnt work");


        }
    }
}
