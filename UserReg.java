package org.example;
import java.util.regex.Pattern;
public class UserReg{
    private static final String First_name="^[A-Za-z0-9]{1}$";
    private static final String Lastname="^[a-z]$";
    private static final String Email="^[0-9a-zA-Z]+[._+-][0-9]@[0-9A-Za-z]$";
    private static final String Phone_Num="^(0|91)?[6-90-9]$";
    private static final String PassWord="^[A-Za-z]@[1-3]$";
    private static final String Cap="^[A-Z]$";
     private static final String SplChar="^[A-Za-z][$]@[1-3]$";

 public boolean validateFirstName(String first_name){
        Pattern pattern=Pattern.compile(First_name);
        return pattern.matcher(first_name).matches();
    }
public boolean validateLastName(String Last_name){
        Pattern pattern=Pattern.compile(Last_name);
        return pattern.matcher(Last_name).matches();
}
    private boolean validateEmail(String email){
        Pattern pattern=Pattern.compile(Email);
        return pattern.matcher(email).matches();
    }
    public boolean validatePhoneNum(int Phone_Num){
        Pattern pattern=Pattern.compile(Phone_Num);
        return pattern.matcher(Phone_Num).matches();
    }
 public boolean validatePassword(String Password){
        Pattern pattern=Pattern.compile(Password);
        return pattern.matcher(Password).matches();
    }
 public boolean validateCap(String Cap){
        Pattern pattern=Pattern.compile(Cap);
        return pattern.matcher(Cap).matches();
    }
 public boolean validateSplChar(String SplChar){
        Pattern pattern=Pattern.compile(SplChar);
        return pattern.matcher(SplChar).matches();
    }
}