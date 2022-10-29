
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Busra " , "Zenbilci" , 123));
        employeeList.add(new Employee("Kubra " , "Kaya" , 2365));
        employeeList.add(new Employee("Mary " , "Smith" , 365));
        employeeList.add(new Employee("Mike" , "Ledet" , 896));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty()); //false

        employeeList.set(2 , new Employee("Mehmet" , "Can" ,15));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());  //4

        employeeList.add(3 , new Employee("Simge" , "Boz" , 856));
        employeeList.forEach(employee -> System.out.println(employee));

        Employee [] employeeArray = employeeList.toArray(new Employee[(employeeList.size())]);
        for(Employee employee: employeeArray) {
           System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mike" , "Ledet" , 896)));
         // true

        System.out.println(employeeList.indexOf(new Employee("Kubra" , "Kaya" , 2365) ));
         // true

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
