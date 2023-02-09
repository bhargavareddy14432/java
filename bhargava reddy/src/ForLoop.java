import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	System.out.print("Welcome");
	int g=s.nextInt();
	for(; g<=15; g++) {
		if(g>=16)
			System.out.println("Limit excedes");
		else
			System.out.println(g);
		

	}

}}
