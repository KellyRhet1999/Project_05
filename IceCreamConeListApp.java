import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
/**
* Rhet Kelly
* 10/02/19
* Project_05
* Prints out ice cream cone list.
*/

public class IceCreamConeListApp
{
/**
* Prints information on a cone list.
* @param args Command line arguments(not used).
* @throws FileNotFoundException for file
*/

   public static void main(String[] args) throws FileNotFoundException
   {
      String coneListName = "";
      String labelIn = "";
      double radiusIn = 0;
      double heightIn = 0;
      
      ArrayList<IceCreamCone> myList = 
         new ArrayList<IceCreamCone>();
      Scanner scan = new Scanner(System.in);
   
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      coneListName = scanFile.nextLine();
      
      while (scanFile.hasNext())
      {
         labelIn = scanFile.nextLine();
         radiusIn = Double.parseDouble(scanFile.nextLine());
         heightIn = Double.parseDouble(scanFile.nextLine());
      
         IceCreamCone newCone = 
            new IceCreamCone(labelIn, radiusIn, heightIn);
         myList.add(newCone);
      }
      
      IceCreamConeList coneList1 = 
         new IceCreamConeList(coneListName, myList);
      
      System.out.println(coneList1.toString());
      
      System.out.println("");
      
      System.out.println(coneList1.summaryInfo());
      
   
   
   }

}