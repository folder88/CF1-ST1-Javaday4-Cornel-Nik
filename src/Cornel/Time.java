package Cornel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {

    int hour;
    int minutes;
    int seconds;



    public void method(){



        Date date = new Date();

        SimpleDateFormat formatTime = new SimpleDateFormat(("dd.MM.yyyy"));

        Calendar c = Calendar.getInstance();


        System.out.println(formatTime.format(date));
        System.out.println(c.get(Calendar.HOUR) + " hours " +  c.get(Calendar.MINUTE) + " minutes " + c.get(Calendar.SECOND) + " seconds ");

    }

    public void array(){

        Calendar c = Calendar.getInstance();
        this.hour = c.get(Calendar.HOUR);
        this.minutes = c.get(Calendar.MINUTE);
        this.seconds = c.get(Calendar.SECOND);

        int [] array2 = { this.hour,this.minutes,this.seconds};

       for( int i = 0; i < array2.length;i++){

           System.out.println(array2[i]);
       }

    }
}
