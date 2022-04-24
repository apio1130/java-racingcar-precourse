package racingcar.model;

public class Car {

    private String name;

    public Car() {
    }

    public Car(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validation(name);
        this.name = name;
    }

    private void validation(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름에 대한 값이 없습니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5글자를 초과할 수 없습니다");
        }
    }

}
