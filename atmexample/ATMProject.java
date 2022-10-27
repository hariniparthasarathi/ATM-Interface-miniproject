package atmexample;
import java.util.Scanner; 
public class ATMProject {   
	    public static void main(String args[] )  
	    {  
	        //declare and initialize balance, withdraw, and deposit  
	        int balance = 10000, withdraw, deposit;  
	          
	        //create scanner class object to get choice of user  
	        Scanner sc = new Scanner(System.in);  
	          
	        while(true)  
	        {  
	            System.out.println("ATM");  
	            System.out.println("Choose 1 to Withdraw");  
	            System.out.println("Choose 2 to Deposit");  
	            System.out.println("Choose 3 to Check Balance");  
	            System.out.println("Choose 4 to EXIT");  
	            System.out.print("Choose any operation to perform:");  
	              
	            //get choice from user  
	            int choice = sc.nextInt();  
	            switch(choice)  
	            {  
	                case 1:  
	        System.out.print("Enter money to  withdraw:");  
	                      
	        //get the withdrawl money from user  
	        withdraw = sc.nextInt();  
	                      
	        //check whether the balance is greater than or equal to the withdrawal amount  
	        if(balance >= withdraw)  
	        {  
	            //remove the withdrawl amount from the total balance  
	            balance = balance - withdraw;  
	            System.out.println("Please collect your money");  
	        }  
	        else  
	        {  
	            //show custom error message   
	            System.out.println("Insufficient Balance");  
	        }  
	        System.out.println("");  
	        break;  
	   
	                case 2:  
	                      
	        System.out.print("Enter money to deposit:");  
	                      
	        //get deposite amount from te user  
	        deposit = sc.nextInt();  
	                      
	        //add the deposit amount to the total balanace  
	        balance = balance + deposit;  
	        System.out.println("Your Money has been successfully depsited");  
	        System.out.println("");  
	        break;  
	   
	                case 3:  
	        //displaying the total balance of the user  
	        System.out.println("Balance : "+balance);  
	        System.out.println("");  
	        break;  
	   
	                case 4:  
	        //exit from the menu  
	        System.exit(0);  
	            }  
	        }  
	    }  
	}  



