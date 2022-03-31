import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    // Initalizes the scanner inputs and welcomes the user
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    System.out.println("\033[31;1;4mWelcome to the Gradebook app.\033[0m");
    System.out.println("This is a program that will let you \u001B[32minput the grades\u001B[0m of your class.");
    System.out.println("Along with that, some \u001B[36mcommands are included\u001B[0m that will let you filter through the class.");
    System.out.println("Such as methods to see the \u001B[33mmean, median, and range\u001B[0m.");

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

    // Lets the user know that they can now enter grades and names of the class
    System.out.println("\n" + className + ", " + classSize + " Students, " + prefix + " " + teacherName);
    System.out.println("You can now input student names and grades");
    
    // Creates parallel Lists that store the student's names and grades
    ArrayList<String> studentList = new ArrayList<String>();
    ArrayList<Integer> gradeList = new ArrayList<Integer>();
    
    boolean canSubmitGrades = true;
    int count = 0;
    while(canSubmitGrades)
    {
      System.out.println("Enter Student Name");
      String studentName = inputString.nextLine();
      System.out.println("Enter " + studentName + "'s grade'");
      int studentGrade = inputInt.nextInt();
      count ++;

      studentList.add(studentName);
      gradeList.add(studentGrade);
      
      if(count == classSize)
      {
        System.out.println("You have entered the entire class");
        System.out.println("This is what you entered:");
        for(String printStudent : studentList)
          {
            System.out.print(printStudent + ", ");
          }
        System.out.println("");
        for(int printGrade : gradeList)
          {
            System.out.print(printGrade + ", ");
          }
        System.out.println("");
        canSubmitGrades = false;
      }
    }
    Commands.getGrade(gradeList);
    
    inputInt.close();
    inputString.close();
  }
}