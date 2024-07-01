package org.example.xperi;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(1, 1);// smallSpot, mediumSpot

        Car car = new Car("KA05-MT-1000");
        Bike bike = new Bike("KA05-MT-2000");

        System.out.println(parkingLot.mediumSpot);
        System.out.println(parkingLot.smallSpot);
        System.out.println(parkingLot.availableMediumSpot);
        System.out.println(parkingLot.availableSmallSpot);
        System.out.println();

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        System.out.println();

        System.out.println(parkingLot.availableMediumSpot);
        System.out.println(parkingLot.availableSmallSpot);
//        parkingLot.removeVehicle(bike);//repeat
        parkingLot.parkVehicle(bike);//repeat
//        parkingLot.parkVehicle(bike);
//        System.out.println();
//
//        parkingLot.removeVehicle(car);
//        parkingLot.removeVehicle(bike);
//        System.out.println();

        parkingLot.removeVehicle(car);//repeat
        parkingLot.removeVehicle(bike);
        System.out.println();
    }
}
