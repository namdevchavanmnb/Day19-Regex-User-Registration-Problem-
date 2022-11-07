package com.bridgelabz;

import com.sun.tools.javac.Main;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Validation validation=new Validation();
        validation.checkFirstName();
        validation.checkLastName();
    }
}
