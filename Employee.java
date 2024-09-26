import java.util.*;
public class Employee{
    String fName;
    String lName;
    String address;
    int age;
    long phone;

    Employee(EmployeeBulilder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.address = builder.address;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    static class EmployeeBulilder{
        String fName;
        String lName;
        String address = "";
        int age = 0;
        long phone = 0;

        EmployeeBulilder( String fName, String lName){
            this.fName = fName;
            this.lName = lName;
        }
        EmployeeBulilder setaddress(String address){
            this.address = address;
            return this;
        }
        EmployeeBulilder setage(int age){
            this.age = age;
            return this;
        }
        EmployeeBulilder setphone(long phone){
            this.phone = phone;
            return this;
        }
        Employee addEmployee(){
            return new Employee(this);
        }
    }

    public static void main(String[] args){
        Employee e1 = new Employee.EmployeeBulilder("kashish","verma").setaddress("bihar")
        .addEmployee();
        System.out.println("name is : "+ e1.fName+" "+ e1.lName);
        System.out.println("Address : "+ e1.address);
    }
}