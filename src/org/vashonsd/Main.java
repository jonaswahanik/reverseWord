package org.vashonsd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //puts scanner in

        System.out.println("enter a single word to be reversed");
        //asks for input

        String startingWord = scan.next();
        //scans input

        StringBuffer reversedWord = new StringBuffer(startingWord);
        //changes startingWord to a string buffer so it can be modified

        reversedWord.reverse().toString();
        // reverses the work

        String paliCheck = reversedWord.toString();
        //Makes a new string from the String Buffer reversedWord, so it can work with the original String startingWord

        if (startingWord.equals(paliCheck)) {
            System.out.println("you silly goose, that is a palindrome, it will be the same backwards ;(");
        }
        //checks to see if word is a palindrome
        else

        System.out.println("Your word reversed is " + reversedWord);
        //prints final answer


    }
}
