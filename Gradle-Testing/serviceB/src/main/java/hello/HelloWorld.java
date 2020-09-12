package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {


    Greeter greeter = new Greeter();
    GreeterC greeterC = new GreeterC();
    System.out.println(greeter.sayHello());
  }
}