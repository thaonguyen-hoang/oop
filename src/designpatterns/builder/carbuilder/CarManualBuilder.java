package designpatterns.builder.carbuilder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    public Builder reset() {
        manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        manual.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        manual.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
        manual.setGpsNavigator(gpsNavigator);
        return this;
    }

    public Manual getProduct() {
        Manual product = this.manual;
        reset();
        return product;
    }
}
