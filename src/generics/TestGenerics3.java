package generics;

import java.util.ArrayList;
import java.util.List;

class TestGenerics3{
public static void main(String args[]){  
MyGen<Integer> m=new MyGen<Integer>();  
m.add(2);  
//m.add("vivek");//Compile time error  
System.out.println(m.get());

    List list = new ArrayList();
    list.add(10);
    list.add("10");
  //  With Generics, it is required to specify the type of object we need to store.
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(10);
   // list1.add("10");// compile-time error


}
}