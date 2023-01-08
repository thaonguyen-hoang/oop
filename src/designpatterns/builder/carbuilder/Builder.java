package designpatterns.builder.carbuilder;

public interface Builder {
    Builder reset();
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
