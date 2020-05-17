package com.company.person;

import com.company.Transport.Transport;

public class Person {
    int p_Age;
    String p_Sex;
    String id;
    String p_Name;

    public Person() {
    }

    public Person(String string) {
    }

    public void driveTransport(Transport transport){
        transport.DrivingMethod();
    }
}
