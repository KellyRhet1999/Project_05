import java.text.DecimalFormat;
import java.util.ArrayList;
/**
* Rhet Kelly
* 10/02/19
* Project_05
*
* Displays a list of cones.
*/

public class IceCreamConeList
{
   private String listName;
   private ArrayList<IceCreamCone> coneList;

/**
* @param listNameIn input for the name
* @param coneListIn input for the list
*/

   public IceCreamConeList(String listNameIn, ArrayList<IceCreamCone>
      coneListIn) 
   {
      listName = listNameIn;
      coneList = coneListIn;               
   }

/**
* @return returns the name of the list
*/

   public String getName()
   {
      return listName;
   }
   
   /**
   * @return returns the list size
   */
   
   public int numberOfIceCreamCones()
   {
      return coneList.size();
   }

/**
* @return returns the surface area
*/

   public double totalSurfaceArea()
   {
      double total = 0;
      int index = 0;
      while (index < coneList.size())
      {
         total += coneList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   
   /**
   * @return returns the total volume
   */
   
   public double totalVolume()
   {
      double total = 0;
      int index = 0;
      while (index < coneList.size())
      {
         total += coneList.get(index).volume();
         index++;
      }
      return total;
   }
   
   /**
   * @return returns average surface area
   */
   
   public double averageSurfaceArea()
   {
      double total = 0;
      int index = 0;
      while (index < coneList.size())
      {
         total += coneList.get(index).surfaceArea();
         index++;
      }
      if (index == 0)
      {
         total = 0;
      }
      else
      {
         total = total / index;
      }
      return total;
   }
   
   /**
   * @return returns the average volume
   */
   
   public double averageVolume()
   {
      double total = 0;
      int index = 0;
      while (index < coneList.size())
      {
         total += coneList.get(index).volume();
         index++;
      }
      if (index == 0)
      {
         total = 0;
      }
      else
      {
         total = total / index;
      }
      return total;
   }
   
   /**
   * @return returns the string
   */
   
   public String toString()
   {
      String result = "\n" + listName + "\n";
      int index = 0;
      while (index < coneList.size())
      {
         result += "\n" + coneList.get(index) + "\n";
         index++;
      }
      return result;
   }
   
   /**
   * @return returns cone information
   */
   
   public String summaryInfo()
   {
      DecimalFormat dFmt = new DecimalFormat("#,##0.0##");
      String result = "";
      return ("----- Summary for " + getName() + " -----")
         + ("\nNumber of IceCreamCone Objects: " + numberOfIceCreamCones())
         + ("\nTotal Surface Area: ") + dFmt.format(totalSurfaceArea())
         + ("\nTotal Volume: ") + dFmt.format(totalVolume())
         + ("\nAverage Surface Area: ") + dFmt.format(averageSurfaceArea())
         + ("\nAverage Volume: ") + dFmt.format(averageVolume())
         + ("");
   }
   

}