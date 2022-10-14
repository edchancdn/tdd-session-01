package ca.testautomation.session;

public class Calculator {

    public int sum(int a, int b) {
        // System.out.println("value of " + (a=0));
        return a + b;
    }

    public int sum(int...a) {
        int sum = 0;
        for (int i :a) {
            sum += i;
        }
        return sum;
    }

    public int divide(int a, int b) throws BadDivisorException {
        if (b == 0) {
            throw new BadDivisorException("Do not provide zero divisor");
        }
        return a / b;
    }

    public long multiply(int a, int b) {
        //if (a<0 || b<0) {
        //    a = 1;
        //    b = 1;
        //}
        return a * b;
    }

    public String getName() {
        return null;
    }
}
