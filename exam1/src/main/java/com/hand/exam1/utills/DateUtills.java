package com.hand.exam1.utills;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtills {

    public static Date getDate(String date){
        Date date1=null;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd");
        try {
            date1=simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }

    public static void main(String[] args) {
        System.out.println(getDate("1994-11-10"));
    }
}
