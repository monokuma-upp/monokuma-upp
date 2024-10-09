package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    interface MyPredicate<T>{
        boolean test(T t);
    }

    public class Test{
        private List<Employee> list;

        Test(){
            list = Arrays.asList(
                    new Employee("zhangsan", 10, 3000),
                    new Employee("lisi", 20,5000),
                    new Employee("wangwu", 23, 5000),
                    new Employee("zhaoliu", 24, 7999)
            );
        }



        //过滤Employee
        public static List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp){
            List<Employee> elist = new ArrayList<>();
            for(Employee e: list){
                if(mp.test(e)){
                    elist.add(e);
                }
            }
            return elist;
        }


        //lambda表达式1
        public void test1(){//过滤employee中年龄大于15的employee
            List<Employee> list2 = filterEmployee(list, (e) -> e.getAge() >= 15);
            list2.stream().map(Employee::getName).forEach(System.out::println);
        }

        public void test2(){
            List<Employee> list3 =list.stream().filter((e) -> e.getAge() >= 15).collect(Collectors.toList());
            list3.stream().map(Employee::getName).forEach(System.out::println);
        }

        public static void main(String[] args) {
            Test t = new Test();
            t.test1();
            t.test2();
        }
    }


