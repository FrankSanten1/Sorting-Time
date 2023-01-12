/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    for (int i = 0; i < intList.size(); i++) {
      int minIndex = i;

      for (int j = i; j < intList.size(); j++) {
        if (intList.get(j) < intList.get(minIndex)) {
          minIndex = j;
        }
      }

      int tempSmall = intList.get(minIndex);
      int tempBeingSwapped = intList.get(i);

      intList.set(i, tempSmall);
      intList.set(minIndex, tempBeingSwapped);
    }
    
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    for (int i = 1; i < intList.size(); i++) {
      int valueBeingSorted = intList.get(i);
      intList.remove(i);

      int j = 0;
      while ( j < i) {
        if (intList.get(j) > valueBeingSorted) {
          break;
        }
        j++;
      }
      intList.add(j, valueBeingSorted);
    }
    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 0; i < doubleList.size(); i++) {
      int minIndex = i;
      for (int j = i + 1; j < doubleList.size(); j++) {
        if (doubleList.get(j) < doubleList.get(minIndex)) {
          minIndex = j;
        }
      }

      double tempSmall = doubleList.get(minIndex);
      double tempBeingSwapped = doubleList.get(i);
      doubleList.set(i, tempSmall);
      doubleList.set(minIndex, tempBeingSwapped);
    }
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 1; i < doubleList.size(); i++) {
      double valueBeingSorted = doubleList.get(i);
      doubleList.remove(i);

      int j = 0;
      while ( j < i) {
        if (doubleList.get(j) > valueBeingSorted) {
          break;
        }
        j++;
      }
      doubleList.add(j, valueBeingSorted);
    }
    
    return doubleList;
  }

}