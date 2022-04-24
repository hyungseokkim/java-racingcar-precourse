package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.RacingCars;
import utils.ValidationUtils;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationTest {
    RacingCars racingCars = new RacingCars();
    @Test
    void 텍스트_사이즈_검사(){
        assertThat(ValidationUtils.validStringLength("테스트데이터")).isFalse();
        assertThat(ValidationUtils.validStringLength("테스트데이")).isTrue();
        assertThat(ValidationUtils.validStringLength("")).isFalse();
        assertThat(ValidationUtils.validStringLength("asfasfa")).isFalse();
    }
    @Test
    void split_test(){
        assertThat(racingCars.makeCarNameList(" 카1,카2,카3")).contains("카1");
        assertThat(racingCars.makeCarNameList("카1,카2 ,카3")).contains("카2");
        assertThat(racingCars.makeCarNameList("카1,카2,카3 ")).contains("카3");
        assertThat(racingCars.makeCarNameList("카1 ,카2,카3")).contains("카1");
    }
    @Test
    void split_test2(){
        assertThat(racingCars.makeCars("카1,카2,카3").get(0).getName()).contains("카1");
        assertThat(racingCars.makeCars(" 카1,카2,카3").get(0).getName()).contains("카1");
        assertThat(racingCars.makeCars("카1,카2 ,카3").get(1).getName()).contains("카2");
        assertThat(racingCars.makeCars(" 카1,카2 ,카3").get(2).getName()).contains("카3");
    }
}
