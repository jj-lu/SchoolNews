package lambda_test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GetPersonFirstName {
    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
                new Person("Yz","Z",25),
                new Person("Yg","L",30),
                new Person("C","M",29));

        checkAndExecute(persons,person -> person.getLastName().startsWith("Z"),person -> System.out.println("第一次优化："+person));
        checkAndExecute2(persons,person -> person.getLastName().startsWith("Z"),person -> System.out.println("第二次优化："+person));
        checkAndExecute3(persons,person -> person.getLastName().startsWith("Z"),person -> System.out.println("第三次优化："+person));
        /**
         * 第四次优化，使用stream()替代静态函数
         */
        persons.stream().filter(person -> person.getLastName().startsWith("Z")).forEach(person -> System.out.println("第四次优化："+person));
        /**
         * 第五次优化，使用lambda表达式引用方法替代System.out.println()方法
         */
        persons.stream().filter(person -> person.getLastName().startsWith("Z")).forEach(System.out::println);
    }

    /**
     * 第一次简化，使用自定义的函数式接口
     * @param personList
     * @param checker
     * @param executor
     */
    public static void checkAndExecute(List<Person> personList,NameChecker checker,Executor executor){
        for (Person person:personList){
            if (checker.check(person)){
                executor.executor(person);
            }
        }
    }

    /**
     * 第二次优化，使用函数式接口包，不需要自己创建函数式接口
     * @param personList
     * @param predicate
     * @param consumer
     */
    public static void checkAndExecute2(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person person : personList){
            if (predicate.test(person)){
                consumer.accept(person);
            }
        }
    }

    /**
     * 第三次优化，使用Iterable.forEach遍历集合
     * @param personList
     * @param predicate
     * @param consumer
     */
    public static void checkAndExecute3(List<Person> personList,Predicate<Person> predicate,Consumer<Person> consumer){
        personList.forEach(person -> {if (predicate.test(person)){
            consumer.accept(person);
        }});
    }

}
