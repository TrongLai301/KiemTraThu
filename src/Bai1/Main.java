package Bai1;

public class Main {
    public static void main(String[] args) {
        People people = new People("Trọng", 20, "male", 1.67, 80);
        Teacher teacher = new Teacher("Tú anh", 24, "male", 1.7, 54, "ThS", "10 years", "IT");
        System.out.println(people.toString());
        System.out.println(teacher.toString());
    }
}
