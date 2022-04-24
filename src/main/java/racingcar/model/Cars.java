package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;


    public Cars(String carNames) {
        cars = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

}
