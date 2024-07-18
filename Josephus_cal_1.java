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
import java.util.ArrayList; 
import java.util.List;

/*

1 2 3 4 5 6 7 8 9 10
1   3   5   7   9
       5       9
        5    

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
1   3   5   7   9    11    13    15    17    19
1       5       9          13          17
1               9          13          
                9
*/ 


public class Josephus {
    public static void main(String[] args) {
        int n;
        // System.out.println("How many people in the circle?\n");
        // Scanner keyboard = new Scanner(System.in);
        // n = keyboard.nextInt();
        // System.out.println("Choose Position: " + josephus(n));
        System.out.println(josephus(1) == 1);
        System.out.println(josephus(2) == 1);
        System.out.println(josephus(3) == 3);
        System.out.println(josephus(4) == 1);
        System.out.println(josephus(10) == 5);
        System.out.println(josephus(100) == 73);
        System.out.println(josephus(20) == 9);
    }
    static double josephus(int n) {
        List<Integer> circle = new ArrayList<>();
        // create a circle
        for (int i = 1; i <=n ; i++){
            circle.add(i);
        }
        while(circle.size() > 1){
            //eliminate members in line
            for(int i = 0; i< circle.size(); i++){
                    if(i == (circle.size() - 1)){
                       circle.remove(0); 
                    }else{
                       circle.remove(i+1);
                    }
            }
        }
               return circle.get(0);
    }
    

}
