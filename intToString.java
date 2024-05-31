import java.util.Scanner;
public class intToString{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String b=Integer.toString(a);
		boolean c=b.contains(b);
		if(c=true){
			System.out.println("Good job");

	}	

}
}