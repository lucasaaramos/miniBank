/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author lucas
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create people instanciating from the class 
        People p1 = new People("Lucas", "Ramos");
        People p2 = new People("Bianca", "Guedes");
        
        //create conta instanciating from the class 
        BankAccount ac1 = new BankAccount();
        ac1.setAccountNum(1111);
        ac1.setOwner(p1.name + " " + p1.surname);
        ac1.OpenAccount("CC");
        
        
        
        BankAccount ac2 = new BankAccount();
        ac2.setAccountNum(2222);
        ac2.setOwner(p2.name + " " + p2.surname);
        ac2.OpenAccount("CP");
        
        
        ac1.Deposit(100);
        ac2.Deposit(500);
        ac2.Draw(100);
        
        ac1.currentyAccount();
        ac2.currentyAccount();
        ac2.Draw(1000);
    }
    
}
