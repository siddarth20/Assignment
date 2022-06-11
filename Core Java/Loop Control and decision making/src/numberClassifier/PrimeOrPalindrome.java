package numberClassifier;

import java.util.*;
public class PrimeOrPalindrome
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int choice,number;
       while(true)
       {
           System.out.println("01. Prime no");
           System.out.println("02. Palindrome no");
           System.out.println("03. Quit");
           System.out.print("Enter Your Choice : ");
           choice=sc.nextInt();
           switch(choice)
           {
               case 1:
                        System.out.print("Enter A Number:");
                        number=sc.nextInt();
                        int d=2;
                        boolean b=true; 
                        while(d<=number/2)
                        {
                            if(number%d==0)
                            {
                                   b=false;
                                   break;
                            }
                            d++;
                        }
                        if(b)
                        {
                            System.out.println(number + " is a prime number");
                        }
                        else
                        {
                            System.out.println(number + " is not a prime number");
                        }
                        break;    
               case 2:  
                        System.out.print("Enter a number:");
                        number=sc.nextInt();
                        int rev=0,temp=number;    
                        while(temp>0)
                        {
                                rev = (rev*10) + (temp%10);
                                temp /= 10;   
                        }
                        if(number==rev)
                        {
                            System.out.println(number + " is a palindrome number");
                        }
                        else
                        {
                            System.out.println(number + " is not a palindrome number");
                        }
                        break;
               case 3:System.exit(0);
               default: System.out.println("Wrong Entry");
            }
       }
   }
}