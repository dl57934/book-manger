package 도서관리프로그램;

import java.util.Scanner;

/**
 * Created by dl579 on 2017-05-23.
 */
public class function {
    Student student;
    Staff staff;
    Guest guest;
    void BookLental()
    {

    }
    void AddBook()
    {

    }
    void AddPerson()
    {
        Scanner key = new Scanner(System.in);
        int info,age,studentNum;
        String name,job,roll,major;
        System.out.print("정보 입력: ");
        info=key.nextInt();
        System.out.println("이름을 입력하세요");
        name = key.nextLine();
        System.out.println("나이를 입력하세요");
        age = key.nextInt();
        if(info == 1)
        {
            System.out.println("직업을 입력하세요");
            job = key.nextLine();
           guest = new Guest(name,age,job);
        }
        else if(info == 2)
        {
            System.out.println("역활을 입력하세요");
             roll= key.nextLine();
            staff = new Staff(name,age,roll);
        }
        else if(info == 3)
        {
            System.out.println("전공을 입력하세요");
            major= key.nextLine();
            System.out.println("학번을 입력하세요");
            studentNum= key.nextInt();
            student = new Student(name,age,major,studentNum);
        }
    }
}
