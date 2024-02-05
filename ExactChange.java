import java.util.Scanner;

public class ExactChange {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 Scanner scnr = new Scanner(System.in);

	      int dollar = 0;
	      int quarter=0;
	      int nickel=0;
	      int dime=0;
	      int penny=0;
	      
	      int change = scnr.nextInt();
	      
	      if (change == 0) {
	         System.out.println("No change");
	      }
	      
	      if (change >= 100) {
	         dollar = change/100;
	         change = change - (100*dollar);
	         if (dollar == 1) {
	            System.out.println(dollar + " Dollar");
	            }
	         else {
	            System.out.println(dollar + " Dollars");
	           
	         }
	      }

	      if (change >= 25) {
	       quarter = change/25;
	       change = change - (quarter*25);
	         if (quarter == 1) {
	            System.out.println(quarter + " Quarter");
	            }
	         else {
	            System.out.println(quarter + " Quarters");
	           
	         }
	      }

	      if (change >= 10) {
	       dime = change/10;
	       change = change - (dime*10);
	         if (dime == 1) {
	            System.out.println(dime + " Dime");
	            }
	         else {
	            System.out.println(dime + " Dimes");
	           
	         }
	      }
	  
	      if (change >= 5) {
	       nickel = change/5;
	       change = change - (nickel*5);
	         if (nickel == 1) {
	            System.out.println(nickel + " Nickel");
	            }
	         else {
	            System.out.println(dime + " Nickels");
	           
	         }
	      }
	  
	      penny = change;
	      if (penny == 1) {
	         System.out.println(penny + " Penny");
	      }
	      else if (penny > 1){
	         System.out.println(penny + " Pennies");  
	      }
	scnr.close();
	
	}
}
