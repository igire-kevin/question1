import java.util.HashMap;
import java.util.Map;

public class Student{
    public int regNumber;
    public String name;
    public Student(int regNumber, String name) {
        this.regNumber = regNumber;
        this.name = name;
    }
    public void print() {
        System.out.println("Student " + this.regNumber + " " + this.name);
    }



    @Override
    public String toString() {
        return regNumber + " " + name;
    }
}

