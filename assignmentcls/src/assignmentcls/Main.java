package assignmentcls;
import java.util.Scanner;
class book{
	String title;
	String author;
	int numberOfpages;
}


public class Main {

	public static void main(String[] args) {
		book s=new book();
		Scanner in=new Scanner(System.in);
        System.out.println("Please Enter the title of the book");
		s.title=in.nextLine();
		System.out.println("Please Enter the authors name");
		s.author=in.next();
		System.out.println("Please Enter the number of pages");
		s.numberOfpages=in.nextInt();
		System.out.println("The book title is\t"+s.title);
		System.out.println("The book author is\t"+s.author);
		System.out.println("The book has\t"+s.numberOfpages+"pages");
		

	}

}
