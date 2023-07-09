import java.io.Serializable;

class Employee implements Serializable {

    int id;
    String name;
    float salary;
    long contact;

    public Employee(int id, String name,float salary,long contact) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.contact = contact;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", contact=" + contact +
                '}';
    }
}
