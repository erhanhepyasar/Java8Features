package javaeight.b.lambda.b.examples.a.helloworld;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld Using Lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello World";


        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
