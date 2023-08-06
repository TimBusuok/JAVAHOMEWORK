package homework;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
class Number{
    String Num;
    Number(String number){
        Num = number;
    }
}

class Name{
    String Titles;
    Name(String name){
        Titles = name;
    }
}

public class program {
    public static Number AddNumber(){
        Scanner num = new Scanner(System.in);
        System.out.println("Введите номер");
        String number = num.nextLine();

        Number temp = new Number(number);
        num.close();
        return temp;
    }

    public static Name AddName(){
        Scanner name = new Scanner(System.in);
        System.out.println("Введите имя контакта: ");
        String title = name.nextLine();

        Name temp = new Name(title);
        return temp;
    }
    

    public static void main(String[] args) {
        Map<LinkedList<Name>, LinkedList<Number>> program = new HashMap<>();
        LinkedList<Name> name = new LinkedList<Name>();
        LinkedList<Number> num = new LinkedList<Number>();
        name.add(AddName());
        num.add(AddNumber());
        
        program.put(name, num);


        for(Map.Entry<LinkedList<Name>, LinkedList<Number>> item : program.entrySet()){
                for(Name x :item.getKey()){
                    System.out.printf("Name: %s", x.Titles);    
                }
                for(Number x :item.getValue()){
                    System.out.printf("  Number: %s", x.Num);
                }
        }
    }
}
