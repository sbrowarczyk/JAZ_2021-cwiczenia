package pl.pjatk.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {


  public MyFirstComponent(@Value("${my.custom.property:property}") String property,
      @Value("${my.custom.random:custom}") String random) {
    System.out.println("Hello from MyFirstComponent");
    System.out.println(property);
    System.out.println(random);
  }

  public void printHelloFromMethod() {
    System.out.println("Hello from myFirstComponent.printHelloFromMethod");
  }

}
