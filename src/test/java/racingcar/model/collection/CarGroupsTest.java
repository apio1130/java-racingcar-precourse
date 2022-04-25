package racingcar.model.collection;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CarGroupsTest {

    @Test
    void 자동차_다건_생성_확인() {
        String carNames = "자동차1,자동차2,자동차3";
        CarGroups cars = new CarGroups(carNames);
        assertThat(cars.getCars()).hasSize(3);
    }

    @Test
    void 자동차_다건_생성_확인_최소() {
        String carNames = "자동차1";
        CarGroups cars = new CarGroups(carNames);
        assertThat(cars.getCars()).hasSize(1);
    }


}