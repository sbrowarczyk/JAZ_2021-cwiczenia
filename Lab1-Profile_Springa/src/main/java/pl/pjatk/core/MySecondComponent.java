package pl.pjatk.core;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

  public MySecondComponent(MyFirstComponent myFirstComponent, List<String> defaultData) {
    System.out.println("Hello from MySecondComponent");
    System.out.println(defaultData);
  }

  public void printHelloFromMethod() {
    System.out.println("Hello from mySecondComponent.printHelloFromMethod");
  }
}
