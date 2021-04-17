package pl.pjatk.core;

public class POJO {

  private Integer integer;
  private String string;

  public POJO(Integer integer, String string) {
    this.integer = integer;
    this.string = string;
    System.out.println("Hello from POJO ");
  }

  public Integer getInteger() {
    return integer;
  }

  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }
}
