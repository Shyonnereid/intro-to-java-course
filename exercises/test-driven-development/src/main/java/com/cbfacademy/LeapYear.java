package com.cbfacademy;

public class LeapYear {

    public static Boolean get(Integer number) {
        if (number % 400 == 0 ){
            return true;
        } else { 
            return false;
        }
}

}
