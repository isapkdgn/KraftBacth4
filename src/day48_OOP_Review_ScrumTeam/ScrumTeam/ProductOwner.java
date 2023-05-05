package day48_OOP_Review_ScrumTeam.ScrumTeam;

public class ProductOwner extends  Employee {
    public ProductOwner(String name, int age, char gender, double salary, int id, String departmentName) {
        super(name, age, gender, "Product Owner", salary, id, departmentName);
    }
}
