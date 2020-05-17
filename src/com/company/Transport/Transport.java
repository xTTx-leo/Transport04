package com.company.Transport;

import java.util.Date;

public abstract class Transport {
    String ownership;
    String GPSPosition;
    String price;
    Date dataOfPurchase;
    String ID;

    public Transport() {

    }

    public abstract void DrivingMethod();

    public abstract void load();

    public abstract void maintain();

    public abstract void addGas();

    public Transport(String Transport){
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Date dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
