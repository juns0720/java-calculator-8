package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    private List<String> separators = new ArrayList<String>(Arrays.asList(",",";"));

    public void addCustomSeparator(String separator) {
        separators.add(separator);
    }

}
