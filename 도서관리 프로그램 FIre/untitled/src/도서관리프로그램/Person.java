package 도서관리프로그램;

/**
 * Created by dl579 on 2017-05-23.
 */
class Student extends Person
{
    String major;
    int studentNumber;
    public Student(String name, int age, String major, int studentNumber) {
        super(name, age);
        this.major = major;
        this.studentNumber = studentNumber;
    }
}

class Guest extends Person {
    String job;
    public Guest(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }
}

class Staff extends Person
{
    String roll;
    public Staff(String name, int age, String roll) {
        super(name, age);
        this.roll = roll;
    }
}

public class Person
{
    String name ;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}