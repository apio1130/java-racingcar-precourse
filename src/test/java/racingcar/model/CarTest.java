package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 자동차_이름_추가_정상() {
        Car car = new Car();
        car.setName("베뉴");
        assertThat(car.getName()).isEqualTo("베뉴");
    }

    @Test
    void 자동차_이름_추가_실패() {
        Car car = new Car();
        assertThatThrownBy(() ->
                car.setName(null)
        ).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() ->
                car.setName("")
        ).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() ->
                car.setName("자동차자동차")
        ).isInstanceOf(IllegalArgumentException.class);
    }

}