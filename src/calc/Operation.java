package calc;
public class Operation {
    double result;

    public double addition(double num1, double num2){
        result = num1 + num2;
        return result;
    }
    public double subtraction(double num1, double num2){
        result = num1 - num2;
        return result;
    }
    public double multiplication(double num1, double num2){
        result = num1 * num2;
        return result;
    }
    public double division(double num1, double num2){
        result = num1 / num2;
        return result;
    }
}