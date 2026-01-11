import java.util.Scanner;
public class TASK2 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER YOU MARKS OF MATHS");
		int marks1 = sc.nextInt();
		
		System.out.println("ENTER YOU MARKS OF PHYSICS");
		int marks2 = sc.nextInt();
		
		System.out.println("ENTER YOU MARKS OF CHEMISTRY");
		int marks3 = sc.nextInt();
		
		System.out.println("ENTER YOU MARKS OF ENGLISH");
		int marks4 = sc.nextInt();
		
		System.out.println("ENTER YOU MARKS OF SCIENCE");
		int marks5 = sc.nextInt();
		
      int totalmarks = marks1+marks2+marks3+marks4+marks5;
      float percentage = (totalmarks/500.0f)*100;
      System.out.println("totalmarks"+totalmarks);
      System.out.println("percentage" + percentage + '%');
	  
      if (percentage>90) {
      System.out.println("you have grade A");
   }
      else if (percentage>80) {
          System.out.println("you have grade B");
    }
      else  if (percentage>70) {
          System.out.println("you have grade C");
    }
      else if (percentage>60) {
          System.out.println("you have grade D");
    }
      else if (percentage>50) {
          System.out.println("you have grade E");
    }
      else if (percentage>40) {
          System.out.println("you have grade F");
      }
      else {
    	  System.out.println("YOU ARE FAIL");
      }
	}
}

