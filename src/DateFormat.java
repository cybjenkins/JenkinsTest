package com.test.nayan;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    /**
     * @param args
     */
    public static void main(String[] args) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyyhh");
	System.out.println("Formatted Date: "+dateFormat.format(new Date())); 

    }

}
