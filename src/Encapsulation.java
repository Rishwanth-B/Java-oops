class Encapsulation{
    private String accountNumber;
    private double balance;
    Encapsulation(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>=0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient funds!");
        }
    }
    public void displayDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.printf("Balance : %.2f",balance);
    }
    public static  void main(String[] args){
        Encapsulation obj1=new Encapsulation("32932",9000);
        obj1.displayDetails();
        obj1.deposit(500);
        obj1.displayDetails();
    }
}