package A_Java.String;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by mdrahman on 8/21/18.
 * Spring 2018
 */
public class String_Problem {


    @Test
        public void stringProblem() {
        // 1 . character count in a string ?
        String string = "Sahaba Rahman Liyana Rahman";
        String lowercaseString = string.toLowerCase();


        for (char Char = 'a'; Char <= 'z'; Char++) {
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                if (Char == lowercaseString.charAt(i)) {
                    count++;
                }

            }
            if (count > 0) {
                System.out.println(Char + " : " + count);
            }
        }


    }

    // 2 . character count in a string ?
    @Test
    public void stringProblem1() {

        String string = "The Capital of NewYork State is Albany";
        String lowStr = string.toLowerCase();
        int count = 0;
        char Char ;

        System.out.println("The occurrences are  - ");
        for (Char = 'a'; Char <= 'z'; Char ++) {
            count = 0;
            for (int i = 0; i < lowStr.length(); i++) {
                if (Char == lowStr.charAt(i)) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println( Char + " : " + count);
            }
        }
    }

    // 3 . How many occurence of 'a' in a String?
    @Test
    public void stringProblem2() {
        String string = "The Capital of NewYork State is Albany";
        String lowStr = string.toLowerCase();
        char Char = 'a';
        int count =0;
        for (int i = 0; i < lowStr.length(); i++ ){
            if (Char == lowStr.charAt(i)){
                count++;
            }
        }
        System.out.println("The oocurence of a is " + count);
    }

    // 4 . Write a program to delete all the whitespace in a string?
    @Test
    public void deleteWhiteSpaces() {
        String string    = "  N e w Y  o r   K  ";
        String newString = string.replaceAll("\\s+","");
        System.out.println(newString);
        }

    // 5 . Write a program to delete all the whitespace in a string?
    // make sure No spaces before & after the String
    @Test
    public void wordCount() {
        String string    = "The New  Horizon.";
        int wordCount = string.split("\\W+").length;
        System.out.println( wordCount);


        if (string.isEmpty()|| string.trim().length() == 0){
            System.out.println(false);
        } else{
            System.out.println(string.trim().split("\\s+").length);
        }
    }


    @Test
    public void conversion() {
        double myDouble = 23.30;
        String myString = Double.toString(myDouble);
        String myString1 = String.valueOf(myDouble);


        String string = null;
        int myInt = 0;

        myInt    = 250;
        myString = Integer.toString(myInt);
        myString = new Integer(myInt).toString();
        myString = String.valueOf(myInt);

        StringBuilder sb = new StringBuilder(myString);
        System.out.println(sb);



    myInt = Integer.parseInt(myString);
        System.out.println(myInt);


        Date date = new Date();
        SimpleDateFormat SDF = new SimpleDateFormat("MMM/YY");
        String stringDate = SDF.format(date);
        System.out.println(stringDate);


        Calendar calendar = Calendar.getInstance();
        String   cal      = calendar.getTime().toString();

        String ldt = LocalDateTime.now().toString();

               ldt = LocalDate.now().toString();

               ldt = LocalTime.now().toString();
    }

    @Test
    public void ternaryOperators(){

        int a1 = 10;
        int b2 = 20;

        String c = (b2>a1) ? "b2 is greater than a1" : "a1 is greater than b2";
        System.out.println(c);
    }













}
