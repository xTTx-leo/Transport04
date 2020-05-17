package com.company;

import com.company.Transport.Aircraft;
import com.company.person.Person;

public class Main {

    public static void main(String[] args) {
        Person person=new Person();
        Aircraft aircraft=new Aircraft();
        person.driveTransport(aircraft);
    }
}
