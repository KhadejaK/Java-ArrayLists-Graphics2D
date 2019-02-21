import java.util.ArrayList;

public class UtilTester
{

   public static void main(String[] args)
   {
      //testing min method
      int[] numbers = {5, 8, 4, 6, 2, 1, 7, 3};
      System.out.println(Util.min(numbers));
      System.out.println("Expected: 1");

      int[] numbers2 = {2, 9, 4, 6, 5, 8, 7, 3};
      System.out.println(Util.min(numbers2));
      System.out.println("Expected: 2");

      int[] numbers3 = {10, 9, 4, 6, 5, 8, 7, 3};
      System.out.println(Util.min(numbers3));
      System.out.println("Expected: 3");

      //testing first contains
      String[] javaIdentifiers = {"Integer", "Double", "Float", "Char",
            "boolean", "long", "short", "byte"};
      System.out.println(Util.contains(javaIdentifiers,"c"));
      System.out.println("Expected: true");
      System.out.println(Util.contains(javaIdentifiers, "x"));
      System.out.println("Expected: false");
      System.out.println(Util.contains(javaIdentifiers,"B"));
      System.out.println("Expected: true");
      
      //testing second contains
      ArrayList<String> words = new ArrayList<String>();
      System.out.println(Util.contains(words, 'b'));
      System.out.println("Expected: []");
      words.add("Big");
      words.add("Java");
      words.add("is");
      words.add("best");
      words.add("Be");
      words.add("the");
      words.add("computer");
      words.add("CS46A/B");
      System.out.println(Util.contains(words, 'e'));
      System.out.println("Expected: [best, Be, the, computer]");
      System.out.println(Util.contains(words, 'B'));
      System.out.println("Expected: [Big, best, Be, CS46A/B]");
      System.out.println(Util.contains(words, 'a'));
      System.out.println("Expected: [Java, CS46A/B]");
      System.out.println(Util.contains(words, 'k'));
      System.out.println("Expected: []");

   }

}