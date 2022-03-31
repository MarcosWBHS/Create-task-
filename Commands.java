import java.util.ArrayList;
import java.util.Collections;
public class Commands
{
  private static String red = "\u001B[31m";
  private static String yellow = "\u001B[33m";
  private static String green = "\u001B[32m";
  private static String end = "\u001B[0m";
  
  public static void getStudents(ArrayList<String> list)
  {
    System.out.println();
    for(String printStudent : list)
    {
      System.out.print(printStudent + ", ");
    }
  }

  public static void getGrade(ArrayList<Integer> list)
  {
    System.out.println("\nGrades of the class: ");
    for(int printGrade : list)
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
  public static double getMean(ArrayList<Integer> list)
  {
    double temp = 0.0;
    for(int i = 0; i < list.size(); i++)
      {
        temp = list.get(i) + temp;
      }
    return (double) temp/list.size();
  }
  public static void getMedian(ArrayList<Integer> list)
  {
    Collections.sort(list);
    if(list.size()%2==0)
    {
      System.out.println((list.get((list.size()/2)) + list.get((list.size()/2)-1))/2);
    }
    if(!(list.size()%2==0))
    {
      System.out.println(list.get((list.size()/2)));
    }
  }
  public static void getRange(ArrayList<Integer> list)
  {
    Collections.sort(list);
    System.out.println(list.get(0) + " - " + list.get(list.size()-1));
  }
}