/*
The game of Josephus goes as follows:

n individuals sit in a circle. Each individual that is in the circle takes a turn and eliminates the person to his left,
until only one person remains. An eliminated individual cannot take an action as they are eliminated.

Let's start with the first individual.  The first individual eliminates the person to his left.  The second individual is eliminated.
The third individual eliminates the person to his left.  The fourth individual is eliminated.
We circle back to the first person in the circle, and he eliminates the third individual. So and so forth.

This process continues until there is only one person remaining in the original circle.  This is the winning position.
It is important to note that we are NOT indexing by zero, but starting with position no. 1.

Your job is to edit just the function such that when provided with an n for the total number of individuals in the circle,
the function outputs the winning position.*/


import java.util.Scanner;


public class Josephus {
    public static void main(String[] args) {
        int n;
        System.out.println("How many people in the circle?\n");
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        System.out.println("Choose Position: " + josephus(n));
    }
    static double josephus(int n) {




        return -1;
    }
}
