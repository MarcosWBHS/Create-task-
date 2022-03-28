import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    // Initalizes the scanner inputs and welcomes the user
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    System.out.println("Welcome to the Gradebook app.");
    System.out.println("This is a program that will let you input the grades of your class.");
    System.out.println("Along with that, some commands are included that will let you filter through the class.");
    System.out.println("Such as methods to see the mean, median, and range.");

    // Asks the user for the name of the class they are putting grades for
    System.out.println("\nClass name: ");  
    String className = inputString.nextLine();
        
    // Asks the user for the size of the class
    System.out.println("\nClass size: ");
    int classSize = inputInt.nextInt();
        
    // Asks the user for thier prefix
    System.out.println("\nPrefix: ");
    String prefix = inputString.nextLine();
        
    // Asks the user for their name
    System.out.println("\nName: ");
    String teacherName = inputString.nextLine();

    System.out.println("\n" + className + ", " + classSize + " Students, " + prefix + " " + teacherName);
    System.out.println("You can now input student names and grades");

    ArrayList<String> studentList = new ArrayList<String>();
    ArrayList<Integer> gradeList = new ArrayList<Integer>();
    
    boolean canSubmitGrades = true;
    while(canSubmitGrades)
    {
      System.out.println("Enter Student Name");
      String studentName = inputString.nextLine();
      System.out.println("Enter ");
    }
    
    inputInt.close();
    inputString.close();
  }
}