package racingcar.domain;

import utils.ValidationUtils;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    public static final String REGEX = ",";

    public List<Car> makeCars(String input){
        List<Car> cars = new ArrayList<>();
        List<String> carNameList = new ArrayList<>(makeCarNameList(input));
        ValidationUtils.validationCarNameList(carNameList);
        for(String each : carNameList){
            cars.add(new Car(each));
        }
        return cars;
    }
    public List<String> makeCarNameList(String input){
        List<String> carNames = new ArrayList<>();
        for(String each : input.split(REGEX)){
            String trimEach = each.trim();
            ValidationUtils.validationCarName(trimEach);
            carNames.add(trimEach);
        }
        return carNames;
    }
}
