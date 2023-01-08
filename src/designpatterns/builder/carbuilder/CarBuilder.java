package designpatterns.builder.carbuilder;

public class CarBuilder implements Builder {
    private Car car;

    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        car.setTripComputer(tripComputer);
        tripComputer.setCar(car);
        return this;
    }

    @Override
    public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
        car.setGpsNavigator(gpsNavigator);
        return this;
    }

    public Car getProduct() {
        Car product = this.car;
        reset();
        return product;
    }
}
