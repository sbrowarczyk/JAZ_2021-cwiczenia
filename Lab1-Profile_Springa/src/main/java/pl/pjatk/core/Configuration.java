package pl.pjatk.core;


import java.util.List;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {


  @Bean
  @ConditionalOnProperty(
      value = "my.boolean.value",
      havingValue = "true"
  )
  public POJO pojo() {
    return new POJO(1, "some string");
  }


  @Bean
  public List<String> defaultData() {
    return List.of("1", "2", "3", "4");
  }

  @Bean
  public List<String> otherDefaultData() {
    return List.of("5", "4", "3", "2", "1");
  }


}
