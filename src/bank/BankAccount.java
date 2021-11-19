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
public class BankAccount {
    
    /**
     * all attributes related to a bank account 
     * currentyAccount to see the bank account created
     * Creating the constructors 
     * creating classes
     * Setting conditions when open and close account
     * Setting conditions when depositing and drawing money
     * Setting monthly payment for each account
     * getter and setters
     */
    
    public int accountNum;
    protected String type;
    private String owner;
    private float balance;
    private boolean status;
    
    
    public void currentyAccount(){
        System.out.println("-------------------------------------");
        System.out.println("Account: " + this.getAccountNum());
        System.out.println("Type: " + this.getType());
        System.out.println("Owner: " + this.getOwner());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Status: " + this.getStatus());
        
    }
    
    

    public BankAccount() {
        this.balance = 0;
        this.status = false;
    }
    
    
    
    
    public void OpenAccount(String type){
        
        this.setType(type);
        this.setStatus(true);
        
        if (type == "CC"){
            this.setBalance(50);
        }else if (type == "CP"){
            this.setBalance(150);  
        }
        System.out.println("Account oppened!");
        
        
    }
    
    public void CloseAccount(){
        if(this.getBalance() > 0){
            System.out.println("There is balance, you can't close this account");
        }else if (this.getBalance() < 0){
            System.out.println("You have in debit! it is not possible to close this accout!");
        }else{
            this.status = false;
            System.out.println("Account closed!");
        }
    }
    public void Deposit(float value){
        
        if (this.getStatus() == true){
            //this.balance = this.balance + value;
            this.setBalance(this.getBalance() + value);
            System.out.println("Deposit done in " + this.getOwner() + " account!");
        }else{
            System.out.println("You need to open your account to deposit money in it!");
        }
    }
    public void Draw(float value){
        
        if (this.getStatus()){
        
        if(this.getBalance() >= value){
            this.setBalance(this.getBalance() - value);
            System.out.println("Draw done in " + this.getOwner() + " account!");
        }else{
            System.out.println("You don't have enough money!");
        }
        
        }else{
            System.out.println("Impossible to draw because you don't have money!");
        }
        
    }
    public void MontlyPay(){
        
        int value = 0;
        
        if (this.getType() == "CC"){
            value = 12;
        }else if(this.getType() == "CP"){
            value = 20;
        }
        
        if(this.getStatus()){
            this.setBalance(this.getBalance() - value);
            System.out.println("Montly payed!");        
        }else {
            System.out.println("Account is not open!");
        }
        
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

       
    
}
