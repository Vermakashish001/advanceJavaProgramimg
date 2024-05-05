import java.util.*;
import java.util.stream.*;
public class stream{
    static public void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(8);
        al.add(5);
        al.add(2);
        al.add(5);
        al.add(1);
        al.add(5);
        //print all the non duplicate integers of arraylist in ascending order 
        Stream<Integer> str = al.stream();
        // str = str.distinct().sorted();
        //str = str.distinct().sorted((x,y)->x>y?-1:1);//descending order
        //str = str.distinct().sorted((x,y)->x>y?1:-1);//ascending order
        //str = str.sorted();

        //print all the non duplicate Odd integers of arraylist in ascending order
        str = str.distinct().filter((x)->x%2==1).sorted((x,y)->x>y?1:-1);

        str.forEach(a->System.out.println(a));

        //filter method




    }
}