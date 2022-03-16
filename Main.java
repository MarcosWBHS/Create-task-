import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Welcome to the Gradebook app");

// Asks the user for the name of the class they are putting grades for
        System.out.println("Class name: ");  
        String className = input2.nextLine();
// Asks the user for the size of the class
        System.out.println("\nClass size: ");
        int classSize = input.nextInt();
// Asks the user for thier prefix
        System.out.println("\nPrefix: ");
        String prefix = input2.nextLine();
// Asks the user for their name
        System.out.println("\nName: ");
        String teacherName = input2.nextLine();

    System.out.println("\n" + className + ", " + classSize + " Students, " + prefix + " " + teacherName);
    
    System.out.println("You can now input student names and grades");

    boolean canSubmitGrades = true;

    while(canSubmitGrades)
      {
        
      }

  }
}