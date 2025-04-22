package PetrolStation;

public class Station {

    public int gasAmount;

    public void refill(Car car) {
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }

}
