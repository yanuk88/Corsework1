public class Employee {
    private final String name;
    private int department;
    private double wage;
    private final int id;
    private static int counter = 1;


    public Employee(String name, int department, double wage) {
        id = counter++;
        this.name = name;
        this.department = department;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    private String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getWage() {
        return wage;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return id + ". ФИО сотрудника: " + name + "; номер отдела - " + department + "; Ставка - " + wage;
    }

}






