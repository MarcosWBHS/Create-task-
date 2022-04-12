import java.util.ArrayList;
import java.util.Collections;
public class Commands
{
  private static String red = "\u001B[31m";
  private static String yellow = "\u001B[33m";
  private static String green = "\u001B[32m";
  private static String end = "\u001B[0m";
  
  public static void getStudents(ArrayList<String> studentList)
  {
    System.out.println();
    for(String printStudent : studentList)
    {
      System.out.print(printStudent + ", ");
    }
  }

  public static void getGrade(ArrayList<Integer> gradelist)
  {
    System.out.println("\nGrades of the class: ");
    for(int printGrade : gradelist)
    {
      if(printGrade > 79)
      {
        System.out.print(green + printGrade + end + ", ");
      }
      else if(printGrade > 64)
      {
        System.out.print(yellow + printGrade + end + ", ");
      }
      else
      {
        System.out.print(red + printGrade + end + ", ");
      }
    }
  }
  public static double getMean(ArrayList<Integer> gradelist)
  {
    double temp = 0.0;
    for(int i = 0; i < gradelist.size(); i++)
      {
        temp = gradelist.get(i) + temp;
      }
    return (double) temp/gradelist.size();
  }
  public static void getMedian(ArrayList<Integer> gradelist)
  {
    Collections.sort(gradelist);
    if(gradelist.size()%2==0)
    {
      System.out.println((gradelist.get((gradelist.size()/2)) + gradelist.get((gradelist.size()/2)-1))/2);
    }
    if(!(gradelist.size()%2==0))
    {
      System.out.println(gradelist.get((gradelist.size()/2)));
    }
  }
  public static void getRange(ArrayList<Integer> gradelist)
  {
    Collections.sort(gradelist);
    System.out.println(gradelist.get(0) + " - " + gradelist.getgradelist.size()-1));
  }
}