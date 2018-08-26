package A_Java.Date;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by mdrahman on 8/21/18.
 * Spring 2018
 */
public class Date_Problems {

    @Test
    public void dateNOthers(){

        LocalDate ld = new LocalDate().now();
        System.out.println(ld);

        LocalDate pastDate = new LocalDate(1880,12,12);
        System.out.println(pastDate);

        boolean dd = new LocalDate().now().isAfter(pastDate);
        System.out.println(dd);

       LocalDate ldt = new LocalDate();
       System.out.println(ldt);


       LocalDate ldt0 = new LocalDate(1886,6,01);
       LocalDate ldt1 = LocalDate.now();

       Years age = Years.yearsBetween(ldt0, ldt1);
       Days ageInDays = Days.daysBetween(ldt0, ldt1);
       System.out.println(age);
       System.out.println(ageInDays);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please Enter your Birth Year");
//        int birthYear = scanner.nextInt();
//
//        System.out.println("Please Enter your Birth Month");
//        int birthMonth = scanner.nextInt();
//
//        System.out.println("Please Enter your Birth Day");
//        int birthDays = scanner.nextInt();

        LocalDate birthDay = new LocalDate(1981,11,20);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.fieldDifference(birthDay,currentDate);
        System.out.println(age);

        System.out.println(LocalDate.now());
    }

    @Test
    public void maximumDays(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
    @Test
    public void AddedDaysMonths (){
        LocalDate ld = LocalDate.now().plusDays(5);
        System.out.println(ld);
        LocalDate ld1 = LocalDate.now().plusMonths(5);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.now().plusYears(5);
        System.out.println(ld2);

    }

    @Test
    public void checkLeapYear(){
        int year = 2018;

        if ( year % 400 ==0 || year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a Leap Year ");
        }else{
            System.out.println(year + " is not a Leap Year ");
        }
    }

    @Test
    public void stringConvertToDate(){
        String string = "May 1, 2016";
        DateTimeFormatter sdf = DateTimeFormat.forPattern("MMMM d, YYYY");
        LocalDate ldt = LocalDate.parse(string,sdf);
        System.out.println(ldt);
    }





}
