package day40_Encapsulation;

public class C01_EmoloyeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("",'p',30,32000);


        // System.out.println("employee1.age = " + employee1.age);
        //  employee1.age=22;
        //    employee1.name;   // get methodu olsada ancak methodla geğişkene erişebiliriz
        System.out.println("employee1.getName() = " + employee1.getName());
        //  private olduğu için data erişimine izin yok
        System.out.println("employee1.getGender() = " + employee1.getGender());

        Employee employee2=new Employee("umit",'A',-20,2500);
        System.out.println(employee2);
        employee2.setGender('M');
        employee2.setAge(38);
        employee2.setSalary(33000);
        System.out.println(employee2);
        Employee employee3=new Employee("",'A',-20,-2500);
        System.out.println(employee3);


    }
}
