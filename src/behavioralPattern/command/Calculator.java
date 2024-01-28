package behavioralPattern.command;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operationMap = new HashMap<>();

    public Calculator() {
        Processor processor = new Processor();
        operationMap.put("+", processor::plus);
        operationMap.put("-", processor::minus);
        operationMap.put("*", processor::multiply);
        operationMap.put("/", processor::divide);
    }
    public void calculate(int argument1, String keyOperation, int argument2) {

        if (operationMap.get(keyOperation) == null){
            throw new IllegalStateException ("no operation registered for '" + keyOperation + "'");
        }
        operationMap.get(keyOperation).execute(argument1,argument2);
    }

}
