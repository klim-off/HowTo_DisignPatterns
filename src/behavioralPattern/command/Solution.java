package behavioralPattern.command;

/* 
Калькулиссимо
*/

public class Solution {

    public static void main(String[] args) {
       /* Processor processor = new Processor();
        processor.plus(3, 9);
        processor.minus(3, 9);
        processor.multiply(3, 9);
        processor.divide(3, 9);
        processor.divide(-234, 12);
        processor.plus(123, -631);*/

        Calculator calculator = new Calculator();
        calculator.calculate(3, "+", 9);
        calculator.calculate(3, "-", 9);
        calculator.calculate(3, "*", 9);
        calculator.calculate(3, "/", 9);
        calculator.calculate(-234, "/", 12);
        calculator.calculate(123, "+", -631);
        calculator.calculate(123, "&", -631);
    }
}
