package Java_9_17;

sealed class Person permits Doctor, Teacher {
    void display(){
        System.out.println("Person is A sealed class.");
    }
}

final class Doctor extends Person{}

sealed class Teacher extends Person permits MathsTeacher{}

non-sealed class MathsTeacher extends Teacher{
    void display(){
        System.out.println("Maths Teachers are Great.");
    }
}

public class Example12 {
    public static void main(String[] args) {
        MathsTeacher mathsTeacher = new MathsTeacher();
        mathsTeacher.display();
    }

}
