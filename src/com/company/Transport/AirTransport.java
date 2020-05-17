package com.company.Transport;

public class AirTransport extends Transport{
    public AirTransport(String Transport) {
        super(Transport);
    }

    public AirTransport() {
        super();
    }

    @Override
    public void DrivingMethod() {
        System.out.print("in the air ");
    }

    @Override
    public void load() {

    }

    @Override
    public void maintain() {

    }

    @Override
    public void addGas() {

    }
}
