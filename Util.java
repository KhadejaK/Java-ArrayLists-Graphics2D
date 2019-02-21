import java.util.ArrayList;

/**
 * Several static methods to work with arrays and ArrayLists. 
 * @author KhadejaKhalid
 *
 */
public class Util
{
   
   /**
    * Gets the minimum value in the array
    * @param array : pass the array of ints
    * @return minimum value
    */
   public static int min(int[] array) 
   {
      int min = array[0];
      for(int val : array)
      {
         if (val < min)
            min = val;
      }
      return min;
   }
   
   /**
    * Determines if the array contains a word that starts with the given letter. 
    * Returns true if it does, otherwise returns false. The comparison is case-insensitive. 
    * 'A' and 'a' are counted as the same letter
    * @param array : array of words
    * @param letter : word to be found
    * @return if word found in array
    */
   public static boolean contains(String[] array, String letter)
   {
      boolean found = false;
      for(String val : array)
      {
         if (val.toLowerCase().contains(letter.toLowerCase()))
            found = true;
      }
      return found;
   }
   
   /**
    * Gets an ArrayList of all the strings in the given ArrayList that contain with the given letter. 
    * The comparison is case-insensitive. 'A' and 'a' are counted as the same letter
    * @param list : list of words
    * @param letter : letter to be found
    * @return if found or not
    */
   public static ArrayList<String> contains(ArrayList<String> list, char letter)
   {
      ArrayList<String> yes = new ArrayList<String>();
      for(String val : list)
      {
         if (val.toLowerCase().contains(String.valueOf(letter).toLowerCase()))
            yes.add(val);
      }
      return yes;
   }
}
