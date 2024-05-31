import java.util.Scanner;
import java.time.LocalDate;
class Result{
	public static String findDay(int day,int month,int year){
	LocalDate lt = LocalDate.of(year,month,day);
	return lt.getDayOfWeek().name();
	
	
	}

}

public class dateAndTime{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
String []date=new String[20];
//inputs for the day month and year using string arr
System.out.println("Enter the day");
date[0]=s.nextLine();
System.out.println("Enter the month");
date[1]=s.nextLine();
System.out.println("Enter the year");
date[2]=s.nextLine();

//now converting the string value to int value 
int d=Integer.parseInt(date[0]);
int m=Integer.parseInt(date[1]);
int y=Integer.parseInt(date[2]);

String res =Result.findDay(d,m,y);
System.out.println(res);
}
}