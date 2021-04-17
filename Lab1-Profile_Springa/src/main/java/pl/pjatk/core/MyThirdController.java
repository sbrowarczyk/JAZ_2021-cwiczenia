package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MyThirdController {

    public MyThirdController(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent) {
        System.out.println("In myThirdController");
        myFirstComponent.printHelloFromMethod();
        mySecondComponent.printHelloFromMethod();
    }
}
