package javaeight.b.lambda.b.examples.b.increment;

public class IncrementByFiveTraditional implements IncrementByFiveInterface{
    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(2));
    }
}
