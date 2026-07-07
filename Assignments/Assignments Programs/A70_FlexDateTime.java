package assignments;

import java.text.SimpleDateFormat;
import java.util.*;

public class A70_FlexDateTime 
{
    public static void main(String[] args) 
    {
        Date today = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("EEE, dd MMM yyyy");

        Calendar cal = Calendar.getInstance();
        cal.setTime(today);

        cal.add(Calendar.DAY_OF_MONTH, -5);
        Date past = cal.getTime();

        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, 17);
        Date future = cal.getTime();

        System.out.println("Today : " + fmt.format(today));
        System.out.println("5 days in the past : " + fmt.format(past));
        System.out.println("17 days in the future: " + fmt.format(future));
    }
}