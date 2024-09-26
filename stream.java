// import java.util.*;
// import java.util.stream.*;
// public class stream{
//     static public void main(String args[]){
//         ArrayList<Integer> al = new ArrayList<Integer>();
//         al.add(8);
//         al.add(5);
//         al.add(2);
//         al.add(5);
//         al.add(1);
//         al.add(5);
//         //print all the non duplicate integers of arraylist in ascending order 
//         Stream<Integer> str = al.stream();
//         // str = str.distinct().sorted();
//         //str = str.distinct().sorted((x,y)->x>y?-1:1);//descending order
//         //str = str.distinct().sorted((x,y)->x>y?1:-1);//ascending order
//         //str = str.sorted();

//         //print all the non duplicate Odd integers of arraylist in ascending order
//         str = str.distinct().filter((x)->x%2==1).sorted((x,y)->x>y?1:-1);

//         str.forEach(a->System.out.println(a));

//     }
// } 


import java.util.*;
import java.util.stream.*;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
}
public class stream{
    public static void main(String args[]){
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Ram",1000)); 
        al.add(new Employee("Shyam",2000));
        al.add(new Employee("Ghanshyam",3000));
        al.add(new Employee("Radha",4000));
        al.add(new Employee("Sita",5000));
        al.add(new Employee("Gita",6000));
        // print  the name of all the employees whose salary is less than 3000 in the sorted oder of their names

        Stream<Employee> str = al.stream().filter(e->e.salary<3000).sorted((x,y)->x.name.compareTo(y.name));
        str.forEach(e->System.out.println(e.name+"\t"+e.salary));
          
    }
}