package featureAbduwali.Animal;

public class Cat extends Animal {
    public Cat(String name, String bread, String color, int age, int size, char gender) {
        super(name, bread, color, age, size, gender);
    }
  public void eat(){
      System.out.println(name+ " eat cat food");
  }
}
