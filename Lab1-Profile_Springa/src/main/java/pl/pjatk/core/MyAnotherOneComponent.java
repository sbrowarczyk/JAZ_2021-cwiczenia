package pl.pjatk.core;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
    value = "my.boolean.value",
    havingValue = "true"
)
public class MyAnotherOneComponent {

  public MyAnotherOneComponent() {
    System.out.println("I should be initialized only in JAZ profile");
  }
}
