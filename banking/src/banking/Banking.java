/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Banking {

    
    public static void main(String[] args) {
       
             int acc_no;
               int ph_no,amount;
               
               do {
                   
                    Scanner in;
                  in = new Scanner(System.in);
                      System.out.println("Enter initial deposit greater than 500:");
                   amount = (int) in.nextFloat();
               } while (amount <500);
              
             bank b1;
            b1 = new bank(amount);
            Exit:
         while(true)
         {
          Scanner in;
          in = new Scanner(System.in);
           
         System.out.println("1.add acc\n 2.deposit\n 3.withdraw\n4.transfer\n5.balance\n6.exit");
          System.out.println("enter the choice");
              int ch=in.nextInt();
              
              switch(ch)
              {
                  case 1: System.out.println("enter the account number: ");
                              acc_no =in.nextInt();
                               
                                
                                    System.out.println("enter your account no.:");
                                       acc_no= in.nextInt();
                                       System.out.println("enter your phone no.:");
                                       ph_no = in.nextInt();
                                       System.out.println("enter your name:");
                                       String name= in.next();
                                        b1.create(acc_no,ph_no,name);
                                        
                                       
                                       
                                       
                                
                 case 2:
                          System.out.println("Enter amt to be deposited:");
                          amount =  (int) in.nextFloat();
                          b1.deposit(amount);
                          break;

                case 3:
                       System.out.println("Enter amt to be withdrawn:");
                       amount = (int) in.nextFloat();
                       b1.withdraw(amount);
                          break;

               case 4:
                        b1.display();
                         break;

                case 5:
                        break Exit;

                default:
                    System.out.println("Invalid chouce");
                                   
              }
         }
    }
    
}
          
            
         
            
         
    
    


    