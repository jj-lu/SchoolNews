package core05_13;

import java.lang.reflect.*;
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
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printConstructors(Class cl){
        Constructor[] constructors = cl.getConstructors();

        for(Constructor constructor : constructors){
            String name = constructor.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(constructor.getModifiers());
            if(modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            Class[] parameter = constructor.getParameterTypes();
            for(int j = 0; j < parameter.length; j++){
                if (j > 0){
                    System.out.print(", ");
                }
                System.out.print(parameter[j].getName());
            }
            System.out.println(");");
        }
    }

    private static void printMethods(Class cl){
        Method[] methods = cl.getMethods();

        for(Method method : methods){
            String name = method.getName();
            Class retType = method.getReturnType();

            System.out.printf("     ");
            String modifiers = Modifier.toString(method.getModifiers());
            if(modifiers.length() > 0){
                System.out.printf(modifiers + " ");
            }
            System.out.printf(retType.getName() + " " + name + " (");
            Class[] paramTypes = method.getParameterTypes();
            for (int j = 0;j < paramTypes.length; j++){
                if(j > 0){
                    System.out.printf(", ");
                }
                System.out.printf(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    private static void printFields(Class cl){
        Field[] fields = cl.getFields();

        for (Field field : fields){
            Class type = field.getType();
            String name = field.getName();
            System.out.printf("     ");
            String modifies = Modifier.toString(field.getModifiers());
            if(modifies.length() > 0){
                System.out.print(modifies + "");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
