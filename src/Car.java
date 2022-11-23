public class Car {
    String model;
    Integer fullSpeed;
    Integer fuelConsumption;

    public Car(String model, Integer fullSpeed, Integer fuelConsumption) {
        this.model = model;
        this.fullSpeed = fullSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public Integer getFullSpeed() {
        return fullSpeed;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fullSpeed=" + fullSpeed +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
