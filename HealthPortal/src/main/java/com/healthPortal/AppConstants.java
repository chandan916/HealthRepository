package com.healthPortal;

public class AppConstants {
    /**
     * Phone number validation Regex(match 10 digits Phone number with Country Code Prefix)
     */
    public static final String PHONE_NUMBER_VALIDATION_REGEX = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";


    /**
     * Email Validation Regex
     */
    public static  final String EMAIL_VALIDATION_REGEX = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$" ;


    /**
     * Password Validation Regex
     */
    public static final String PASSWORD_VALIDATION_REGEX="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,15}$";
}
