package S01T06N01Ex02;

public class Person {

     private String name;
     private String surname;
     private int age;

     public Person(String name, String surname, int age) {
          this.name = name;
          this.surname = surname;
          this.age = age;
     }

     @Override
     public String toString() {
          return "Person: " +
                  "{name= " + name +
                  ", surname= " + surname +
                  ", age= " + age +
                  '}';
     }
}
