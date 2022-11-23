import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        int difModel = car1.getModel().compareTo(car2.getModel());
        int difFullSpeed = car1.getFullSpeed() - car2.getFullSpeed();
        int difFuelConsumption = car1.getFuelConsumption() - car2.getFuelConsumption();


        if(difFuelConsumption != 0){
            return difFuelConsumption;
        }
        if(difFullSpeed != 0){
            return difFullSpeed;
        }

        return difModel;

    }
}
