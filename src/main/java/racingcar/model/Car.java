package racingcar.model;

public class Car {

    private String name;

    private final DrivingDistance drivingDistance;

    public Car() {
        this.drivingDistance = new DrivingDistance();
    }

    public Car(String name) {
        this.setName(name);
        this.drivingDistance = new DrivingDistance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름에 대한 값이 없습니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5글자를 초과할 수 없습니다");
        }
    }

    public DrivingDistance getDrivingDistance() {
        return this.drivingDistance;
    }

    public void move(int randomNumber) {
        validateMoveNumber(randomNumber);
        if (randomNumber >= 4) {
            this.drivingDistance.add();
        }
    }

    private void validateMoveNumber(int randomNumber) {
        if (randomNumber > 9 || randomNumber < 0) {
            throw new IllegalArgumentException("유효하지 않은 숫자 값입니다.");
        }
    }

}
