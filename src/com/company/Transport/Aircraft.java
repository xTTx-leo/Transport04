package com.company.Transport;

public class Aircraft extends AirTransport {
    public Aircraft(String Transport) {
        super(Transport);
    }

    public Aircraft() {
    }

    public void DrivingMethod(){
        super.DrivingMethod();
        System.out.println("drive plane");
    }

}
