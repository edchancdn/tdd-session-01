package ca.testautomation.session;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int sum = calculator.sum(2, 4);
        System.out.printf("calculator.sum(2, 4) = " + sum);

    }
}