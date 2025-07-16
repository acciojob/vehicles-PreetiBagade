package com.driver;

public class Boat implements WaterVehicle{

    public String name;
    public int capacty;


    Boat(String name, int capacity){
        this.name=name;
        this.capacty=capacity;
    }
    //
    @Override
    public String getVehicleName() {
        return "";
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
