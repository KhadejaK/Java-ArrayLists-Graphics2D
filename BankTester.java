public class BankTester
{
   public static void main(String[] args)
   {
      Bank accounts = new Bank();
      
      //test empty bank
      accounts.largestFirst();
      System.out.println(accounts.list());
      System.out.println("Expected: []");
      accounts.largestFirst();
      System.out.println(accounts.list());
      System.out.println("Expected: []");
      System.out.println(accounts.contains("abc123"));
      System.out.println("Expected: false");
      System.out.println(accounts.list(10000));
      System.out.println("Expected: []");
      
      accounts.add(new BankAccount(10000.0, "def333"));    
      accounts.add(new BankAccount(20000.0, "abc123")); 
      accounts.add(new BankAccount(15000.0, "pqr456")); 
      accounts.add(new BankAccount(20000.0, "xyz789"));
      accounts.add(new BankAccount(9500.0, "abc111")); 
      
      accounts.largestFirst();
      System.out.println(accounts.list());
      System.out.println("Expected: [abc123, def333, pqr456, xyz789, abc111]");
      
      System.out.println(accounts.contains("abc123"));
      System.out.println("Expected: true");
      System.out.println(accounts.contains("aaa999"));
      System.out.println("Expected: false");
      System.out.println(accounts.list(10000));
      System.out.println("Expected: [abc123, pqr456, xyz789]");
      System.out.println(accounts.list(100000));
      System.out.println("Expected: []");
      
//      accounts.add();          
   }
}