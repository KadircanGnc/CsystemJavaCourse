package homeworks;

import java.util.Random;
import java.util.Scanner;

/**
 * Mastermind
 */
public class Mastermind {

    public static int prizeNumber;
    public static void main(String[] args) {    
        setNumber();
        System.out.println(prizeNumber);    
        play();
    }

    public static void setNumber() {
        Random rnd = new Random();
        prizeNumber = rnd.nextInt(1000,9999);
    }

    public static void play() {        
        Scanner scan = new Scanner(System.in);
        int guessCount = 1;
        int guess;
        do {            
            System.out.printf("%d%s", guessCount, ".tahmini giriniz: ");
            guess = scan.nextInt();
            System.out.println(compareGuess(guess));
            if(guess == prizeNumber) {
                System.out.printf("%s", "KAZANDINIZZZZ");
                break;
            }
            guessCount++;
        } while (guessCount < 11);
    }

    public static String compareGuess(int number) {
        Character[] prizeNumberArr = new Character[3];
        Character[] guessNumberArr = new Character[3];
        String guess = "";
        
        for (int i = 0; i < prizeNumberArr.length; i++) {
            prizeNumberArr[i] = Integer.toString(prizeNumber).charAt(i);
            guessNumberArr[i] = Integer.toString(number).charAt(i);
        }

        for (int i = 0; i < prizeNumberArr.length; i++) {
            for (int j = 0; j < prizeNumberArr.length; j++) {
                if(guessNumberArr[i].equals(prizeNumberArr[j]) && i == j) {
                    guess += "+";
                }
                else if (guessNumberArr[i].equals(prizeNumberArr[j])) {
                    guess += "-";
                }
            }
        }
        return guess;
    }
}