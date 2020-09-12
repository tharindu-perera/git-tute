package hello;

import org.joda.time.LocalTime;

public class HelloWorldA {
  public static void main(String[] args) {


    GreeterC  greeter = new GreeterC();
    GreeterB  greeterB = new GreeterB();
    System.out.println(greeter.sayHello());
  }
}