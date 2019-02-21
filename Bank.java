
import java.util.ArrayList;
/**
 *  A Bank uses an ArrayList to keep track of BankAccount objects
 *  @author KhadejaKhalid
 */
public class Bank
{
   private ArrayList<BankAccount> account; 
   
   /**
    * Constructs a bank of accounts
    */
   public Bank()
   {
      account = new ArrayList<BankAccount>();
   }
   
   /**
    * adds the specified BankAccount to the Bank
    * @param a : account to add
    */
   public void add(BankAccount a)
   {
      account.add(a);
   }
   
   /**
    * puts the BankAccount with the largest balance first in the list. 
    * If two have the same large balance, use the first one encountered in the list
    */
   public void largestFirst()
   {
      if (account.size() != 0)
      {
         double largestB = account.get(0).getBalance();
         BankAccount largest = account.get(0);
         
         for (BankAccount val : account)
         {
            if (val.getBalance() > largestB)
            {
               largestB = val.getBalance();
               largest = val;
            }
         }
         account.remove(account.indexOf(largest));
         account.add(0, largest);       
      }
   }
   
   /**
    * determines if a BankAccount with a given accountId is in the Bank. Return true is so, otherwise false
    * @param acc : account to check if found
    * @return if found or not
    */
   public boolean contains(String acc)
   {
      boolean found = false;
      
      for (BankAccount val : account)
      {
         if (val.getAccountId().equals(acc))
            found = true;
      }
      
      return found;
   }
   
   /**
    * gets an ArrayList of the BankAccount accountIds in the Bank that have balances over the specified amount.
    * @param amount : only add accounts over this amount
    * @return arraylist of accounts over amount
    */
   public ArrayList<String> list(double amount)
   {
      ArrayList<String> ids = new ArrayList<String>();
      for (BankAccount val : account)
      {
         if (val.getBalance() > amount)
            ids.add(val.getAccountId());
      }
      return ids;
   }
   
   /**
    * gets an ArrayList of the BankAccount accountIds in the Bank
    * @return an arraylist of account ids
    */
   public ArrayList<String> list()
   {
      ArrayList<String> ids = new ArrayList<String>();
      for (BankAccount val : account)
      {
         ids.add(val.getAccountId());
      }
      return ids;
   }

}
