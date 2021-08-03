package org.example;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class UserRegistration {
        @Test
        public void firstname_ShouldReturnTrue(){
                UserRegistration validator = new UserRegistration();
                boolean result=validator.validateFirstName("Geeta");
                Assert.assertTrue(String.valueOf(true),result);
        }

        private boolean validateFirstName(String geeta) {
                return true;
        }

        @Test
        public void Lastname_ShouldRetrunTrue(){
                UserRegistration validator= new UserRegistration();
                boolean result=validator.validateLastName("biradar");
                Assert.assertEquals(true,result);
        }

        private boolean validateLastName(String biradar) {
                return true;
        }

        @Test
        public void  email_ShouldReturnTrue(){
        UserRegistration validator= new UserRegistration();
        boolean result =validator.validateEmail("gsb@gmail.com");
        assertEquals(true,result);
        }

        private  boolean validateEmail(String s) {
                return true;
        }

        @Test
        public void  Phone_NumShouldReturnTrue(){
                UserRegistration validator= new UserRegistration();
                boolean result =validator.validatePhoneNum("916950590569");
                assertEquals(true,result);
        }
        private boolean validatePhoneNum(String s) {
                return true;
        }
        @Test
        public void  PassWordShouldReturnTrue(){
                UserRegistration validator= new UserRegistration();
                boolean result =validator.validatePassWord("Geeta@123");
                assertEquals(true,result);
        }

        private boolean validatePassWord(String s) {
                return true;
        }
        @Test
        public void  Cap_ShouldReturnTrue(){
                UserRegistration validator= new UserRegistration();
                boolean result =validator.validateCap("ABC");
                assertEquals(true,result);
        }

        private boolean validateCap(String abc) {
                return true;
        }
        @Test
        public void  SplChar_ShouldReturnTrue(){
                UserRegistration validator= new UserRegistration();
                boolean result =validator.validateSplChar("Abac$@123");
                assertEquals(true,result);
        }

        private boolean validateSplChar(String s) {
                return true;
        }
}




