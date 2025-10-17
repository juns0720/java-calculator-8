package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {

    private static final String INPUT = "덧셈할 문자열을 입력해 주세요.";
    private static final String RESULT = "결과 : ";

    public static void main(String[] args) {
        // 문자열 입력
        System.out.println(INPUT);
        String input = Console.readLine();


        //계산기 객체 생성
        Calculator calculator = new Calculator();

        //문자열 파싱
        List<String> parsedNumber = calculator.parse(input);

        //숫자 덧셈
        int result = calculator.add(parsedNumber);

        //결과 출력
        System.out.println(RESULT + result);

    }
}
