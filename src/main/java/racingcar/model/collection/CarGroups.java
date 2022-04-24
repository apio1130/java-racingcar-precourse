package racingcar.model.collection;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.Car;

public class CarGroups {

    private final List<Car> cars;


    public CarGroups(String carNames) {
        cars = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

}
