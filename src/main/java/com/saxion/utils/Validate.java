package com.saxion.utils;

public class Validate {
    public static boolean IsEmailValid(String email) {
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    public static boolean IsDateValid(String date) {
        return date.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-([0-9]{4})$");
    }

    public static boolean IsPhoneNumberValid(String phoneNumber) {
        return phoneNumber.matches("^\\+?[0-9]{3}-?[0-9]{6,12}$");
    }
}
