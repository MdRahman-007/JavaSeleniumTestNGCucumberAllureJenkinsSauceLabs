package A_Java.Integer;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by mdrahman on 8/21/18.
 * Spring 2018
 */

public class Integer_Method {

    @Test
    public void conVersion() {
        int myInt;

        byte myByte = 23;
        myInt = (int) myByte;
        double myDouble = 23.20;
        myInt = (int) myDouble;
        short myShort = 23;
        myInt = (int) myShort;
        float myFloat = 23.5f;
        myInt = (int) myFloat;
        long myLong = 23090909L;
        myInt = (int) myLong;


        // Generating Random Number 3 ways
        Random ran = new Random();
        int random = ran.nextInt(50);
        double ranNum = Math.random() * 50;
        int rand = ThreadLocalRandom.current().nextInt();


        // number of iteration in a string

        int count = 0;
        for (char Char = 'a'; Char <= 'z'; Char++) {
            count++;
            System.out.println(Char + " :  " + "Iteration  " + count);
        }

        String string = "av8p";
        count = 0;
        for (int i = 0; i < string.length(); i++) {
            count++;

            System.out.println(string.charAt(i) + "; Iteration : "
                    + count + "; " + string.length());
        }
        System.out.println("\n");
        String[] myArray = {"a", "v", "8", "p"};
        count = 0;
        for (Object i : myArray) {
            count++;
            System.out.println(i + " " + count);
        }
    }


    // sum of first 100 digits
    @Test
    public void math() {
        int C = 0, sum = 0, i = 0;
//        for (i = 1; i <=100; i++ ){
//            C++;
//            sum = sum + i;
//        }
//        System.out.println(C +" ;  "+ sum);
//        System.out.println("\n");
//
//        sum = 0;
//        for (i = 1; i <=100; i++ ) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }System.out.println("Even " + sum);
//
//        sum = 0;
//        for (i = 1; i <=100; i++ ) {
//            if (i % 2 != 0) {
//                sum = sum + i;
//            }
//        }System.out.println("Odd " + sum);


        // Prime number Generator
        int num = 100;
//        boolean isPrime = true;
//        for (i = 2; i <= num; num++ ){
//            for (int j = 3; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                }
//            }
//    }if (isPrime){
//            System.out.println(i);
//        }

//        for(i = 1; i <= num; ++i) {
//            // checks if the number is a prime or not
//            boolean isPrime = true;
//            for(int check = 2; check < i; ++check) {
//                if(i % check == 0) {
//                    isPrime = false;
//                }
//            }
//            if(isPrime) {
//                System.out.println(i);
//            }
//        }


        num = 123;

        sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
            System.out.println(sum);

        }
        System.out.println(sum);
    }


    public static void main(String[] args) {


        Random random = new Random();
        int rndm = random.nextInt(45);
        System.out.println(rndm);
        Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("enter your number");
        int yn = scanner.nextInt();
        if (yn > rndm) {
            System.out.println("Try Smaller");
        } else if (yn < rndm) {
            System.out.println("Try Bigger");
        } else {
            System.out.println("Done");
            break;
        }
    }
}

    @Test
    public void pyramidShape (){
        int noOfRows = 5;
        int rowCount = 1;

        for (int i = noOfRows; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print( "*" + " ");
            }
            System.out.println();
            rowCount++;

            }

        }





}





































