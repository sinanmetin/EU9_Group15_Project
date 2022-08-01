package featureAbduwali.Animal;

public class Animal {

        public String name, bread, color;
        public int age,size;
        public char gender;

        public Animal(String name, String bread, String color, int age, int size, char gender) {
            this.name = name;
            this.bread = bread;
            this.color = color;
            this.age = age;
            this.size = size;
            this.gender = gender;
        }

        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", bread='" + bread + '\'' +
                    ", color='" + color + '\'' +
                    ", age=" + age +
                    ", size=" + size +
                    ", gender=" + gender +
                    '}';
        }
        public void eat(){
            System.out.println(name+ " is eating.");
        }

    }


