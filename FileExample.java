
package fileexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileExample {

    
    public static void main(String[] args) throws FileNotFoundException {
       File file =new File("src\\fileexample\\StudentsData.txt");
       Scanner scan=new Scanner(file);
       File f =new File("src\\fileexample\\newData.txt");
       PrintWriter pw =new PrintWriter(f);
       double highestAvg=0; int highestAge=0;
       double lowestAvg=0; int lowestAge=0;
       double avgGPA=0; int counter =0;
       while (scan.hasNext()){
       String unId =scan.next();
       scan.nextLine();
       String name =scan.nextLine();
       double avg =scan.nextDouble();
       int age =scan.nextInt();
       pw.printf("%-8s %-15s %-3f %-3d\n",unId, name,avg,age);
       if (counter==0){highestAvg=avg;highestAge=age;lowestAge=age;lowestAvg=avg;avgGPA+=avg;counter++;}
       else{
           if (avg>highestAvg){highestAvg=avg;}
       else if (avg<lowestAvg){lowestAvg=avg;}
       if (age>highestAge){highestAge=age;}
       else if (age<lowestAge){lowestAge=age;}
       avgGPA+=avg;
       counter++;
       }
       
       
       
       }
       avgGPA=(avgGPA/counter);
       pw.println("the highest avg ="+highestAvg);
       pw.println("the lower avg ="+lowestAvg);
       pw.println("the highest age ="+highestAge);
       pw.println("the lowest age ="+lowestAge);
       pw.println("the avarge GPA ="+String.valueOf(avgGPA));
       pw.close();
    }
    
}
