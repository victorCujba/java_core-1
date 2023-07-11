package lambdas;

public class LambdaExample {

    public static void main(String[] args) {

        CalculatorOperation calculator = new CalculatorOperation() {
            @Override
            public int add(int a, int b) {
                return 0;
            }

            @Override
            public int sub(int a, int b) {
                return 0;
            }

            @Override
            public int mul(int a, int b) {
                return 0;
            }

            @Override
            public int div(int a, int b) {
                return 0;
            }
        };

        AddOperation addOperation = new AddOperation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        AddOperation lambdaAddOperation0 = (int x, int y) -> { return x + y; };

        AddOperation lambdaAddOperation1 = (int x, int y) -> Math.addExact(x, y);

        AddOperation lambdaAddOperation2 = Math::addExact;

        System.out.printf("addOperation: %s\n", addOperation.add(1, 2));
        System.out.printf("lambdaAddOperation0: %s\n", lambdaAddOperation0.add(1, 2));
        System.out.printf("lambdaAddOperation1: %s\n", lambdaAddOperation1.add(1, 2));
        System.out.printf("lambdaAddOperation2: %s\n", lambdaAddOperation2.add(1, 2));
    }

}
