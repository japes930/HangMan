import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
    public static void main(String[] args){

        ArrayList<String> answers = new ArrayList<String>(
                Arrays.asList("tree", "rain", "bear", "encourage", "promise", "soup", "chess",
                        "insurance", "pancakes", "stream"));

        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();
        boolean correct = false;

        String key = answers.get(rnd.nextInt(answers.size()));
//        System.out.println(key); //answer
        ArrayList<Character> blankKey = new ArrayList<Character>();
        int chances = 5;


        for (int i = 0; i < key.length(); i++) {
            blankKey.add('_');
        }

        System.out.println("Welcome to hangman!");

        //prints out blank spaces for length of hidden word
        System.out.print("Here is the word I'm thinking of:");
        for (char space : blankKey) {
            System.out.printf("\t");
            System.out.print(space);
        }
        do {



            System.out.print(" (" + (key.length() + " letters)"));
            System.out.println("Pick a letter: ");
            char guess = keyboard.next().charAt(0);
            for (int i = 0; i < key.length(); i++) {
                if (guess == key.charAt(i)) {
                    System.out.println();
                    blankKey.set(i, guess);
                    correct = true;//use true for counter of chances
                } else {
                    continue;
                }
                System.out.println(correct);
                System.out.println(chances);
//
            }
            for (Character space : blankKey) {
                System.out.printf("\t");
                System.out.print(space);

            }

            if (correct != true){
                chances--;
                System.out.println("You have " + chances + " chances remaining.");
            }
            correct = false;

        System.out.println(chances);
        } while (chances>0 ); // or if they guess all the letters

        //Add guesses to new arraylist


    }
}
