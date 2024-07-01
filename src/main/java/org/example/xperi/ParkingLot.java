package org.example.xperi;

public class ParkingLot {
    public int availableSmallSpot = 0;
    public int availableMediumSpot = 0;
    public int smallSpot;
    public int mediumSpot;

    public ParkingLot(int smallSpot, int mediumSpot) {
        this.smallSpot = smallSpot;
        this.mediumSpot = mediumSpot;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            if (mediumSpot > availableMediumSpot) {
                availableMediumSpot++;
            } else {
                throw new IndexOutOfBoundsException("There is no space to park");
            }
        }

        if (vehicle instanceof Bike) {
            if (smallSpot > availableSmallSpot) {
                availableSmallSpot++;
            } else {
                throw new IndexOutOfBoundsException("There is no space to park");
            }
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            availableMediumSpot--;
        }

        if (vehicle instanceof Bike) {
            availableSmallSpot--;
        }
    }
}
