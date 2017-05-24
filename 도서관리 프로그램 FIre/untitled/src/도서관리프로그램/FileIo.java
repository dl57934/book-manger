package 도서관리프로그램;

import java.io.*;

/**
 * Created by dl579 on 2017-05-23.
 */
public class FileIo  {
    BufferedWriter writeGuest = new BufferedWriter(new FileWriter("게스트목록"));
    BufferedWriter writeStaff = new BufferedWriter(new FileWriter("스태프목록"));
    BufferedWriter writeStudent = new  BufferedWriter(new FileWriter("학생목록"));
    BufferedReader readGuest = new  BufferedReader(new FileReader("게스트목록"));
    BufferedReader readStaff = new  BufferedReader(new FileReader("스태프목록"));
    BufferedReader readStudent = new BufferedReader(new FileReader("학생목록"));
    BufferedReader readBook = new  BufferedReader(new FileReader("책목록"));
    BufferedWriter writeBook = new  BufferedWriter(new FileWriter("책목록"));

    public FileIo() throws IOException {
    }

    public void read(BufferedReader Fire) throws IOException {
     String str;
     while(true)
     {
         str = Fire.readLine();
         if(str==null)
             break;
         System.out.println(str);
     }
     Fire.close();
 }
               }
