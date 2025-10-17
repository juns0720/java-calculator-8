package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    private static final String INPUT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";

    public static void main(String[] args) {
        // 문자열 입력
        System.out.println(INPUT_MESSAGE);
        String input = Console.readLine();
        if (input.isBlank()){
            throw new IllegalArgumentException();
        }



    }
}
