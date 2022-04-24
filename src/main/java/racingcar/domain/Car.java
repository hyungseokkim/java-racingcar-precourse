package racingcar.domain;

import utils.ValidationUtils;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String name;
    private final int position = 0;

    public Car(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
