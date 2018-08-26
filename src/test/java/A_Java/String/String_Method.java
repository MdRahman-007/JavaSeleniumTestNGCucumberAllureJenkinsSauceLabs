package A_Java.String;

import org.junit.Test;

/**
 * Created by mdrahman on 8/20/18.
 * Spring 2018
 */

public class String_Method {

    @Test
    public void Java_Practice(){

        String string1 = "$ @ Arabian Peninsula  *";
        String string2 = "a";

        System.out.println((string1.compareTo(string2)));

        System.out.println((string1.contentEquals(string2)));

        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));

        System.out.println(string1==string2);

        System.out.println(string1.contains(string2));
        System.out.println(string1.matches("(.*)rab(.*)"));
        System.out.println(string1.contains(string2));

        System.out.println(string1.replace('a','s'));
        System.out.println(string1.replaceAll("Arabian","Soma"));
        System.out.println(string1.replaceAll("(.*)Arabian(.*)","Soma"));
        System.out.println(string1.replaceAll(" ",""));
        System.out.println(string1.replace("$ @",""));



        StringBuilder stringBuilder = new StringBuilder("Bangladesh");
        stringBuilder.append("  USA");
        stringBuilder.insert(15,"  NY NY");
        stringBuilder.replace(20,22, "PA");
        stringBuilder.delete(20,22);
        stringBuilder.reverse();


        System.out.println(string1);
        System.out.println(stringBuilder);
    }

}
