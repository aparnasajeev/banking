/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;


class bank {
    
      float balance;;

  
      bank(float amount) {
        balance = amount;
     }

      void create(int acc_no,int ph_no,String name)
      {
           System.out.println("accounted created");
      }

      void deposit(float amount) {
        balance += amount;
      }

      void withdraw(float amount) {
        if (amount < 500) {
            System.out.println("Insufficient bal");
        } else {
            balance -= amount;
        }
    }

    void display() {
        System.out.println("Balance is:" + balance);
    }
}

    
    
    
    

