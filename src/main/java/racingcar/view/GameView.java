package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class GameView {

    public static final String MESSAGE_INPUT_CARNAMES = "경주할 자동차이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)\n";
    public static final String MESSAGE_INPUT_COUNTER = "시도할 회수는 몇회인가요?";

    public static String inputCarNames() {
        outputMessage(MESSAGE_INPUT_CARNAMES);
        return Console.readLine();
    }
    public static String inputCounter() {
        outputMessage(MESSAGE_INPUT_COUNTER);
        return Console.readLine();
    }
    public static void outputMessage(String message){
        System.out.println(message);
    }
}
