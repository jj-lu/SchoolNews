package core05_13;

import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        if(args.length > 0){
            name = args[0];
        }else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date):");
            name = sc.next();
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print("class" + name);
            if(supercl != null && supercl != Object.class){
                System.out.print(" extends" + supercl.getName());
            }
            System.out.print("\n{\n");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
