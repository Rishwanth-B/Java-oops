class Employee{
    private String employeeid;
    private String name;
    private double salary;
    Employee(String employeeid,String name,double salary){
        this.employeeid=employeeid;
        this.name=name;
        if(salary<0) {
            System.out.println("Invalid Salary");
            this.salary = 0;
        }
        else{
            this.salary=salary;
        }
    }
    public void setSalary(double salary){
        if(salary<0){
            System.out.println("Salary Cannot be negative");
        }
        else{
            this.salary=salary;
        }
    }
    public double getSalary(){
        return this.salary;
    }
    public void IncrementSalary(double amount){
         this.salary+=amount;
    }
    public double newsalary(){
        return this.salary;
    }
    public void deduct(double amount){
        if(amount>this.salary){
            System.out.println("Insufficient Balance");
        }
        else{
            this.salary-=amount;
            System.out.println("After Deduction :"+this.salary);
        }
    }
    public  void displayDetails(){
        System.out.println("Employee_id : "+this.employeeid);
        System.out.println("Name : "+this.name);
        System.out.println(("Salary : "+this.salary));
    }

    public static void main(String[] args){
        Employee emp1=new Employee("798","Rishwanth",2000000);
        Employee emp2=new Employee("799","Pooja",2000000);
        emp1.displayDetails();
         System.out.println("After Increment");
        emp1.IncrementSalary(2000000);

        emp1.displayDetails();

        emp1.deduct(1000);

        emp1.displayDetails();

        emp2.displayDetails();
        System.out.println("After Increment");
        emp2.IncrementSalary(2000000);

        emp2.displayDetails();

        emp2.deduct(1000);

        emp2.displayDetails();

    }
}