package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    private List<String> separators = new ArrayList<String>(Arrays.asList(",",":"));

    public void addCustomSeparator(String separator) {
        separators.add(separator);
    }

    public List<String> parse(String input){

        //커스텀 구분자 검사
        if (input.startsWith("//")){
            int endIndex = input.indexOf("\\n");
            if (endIndex == -1){
                throw new IllegalArgumentException();
            }

            String customSeparator = input.substring(2,endIndex);
            addCustomSeparator(customSeparator);
            input = input.substring(endIndex+2);
        }
        //구분자를 통해 숫자 파싱
        return List.of(input.split(String.join("|", separators)));



    }




}
