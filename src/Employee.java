import java.util.Objects;

public class Employee {
    //                      Сотрудник
    private String name;
    private String middleName;
    private String lastName;

    private char departmentName;
    private int salary;
    private int id;                  // id сотрудника

    public Employee(String name, String middleName, String lastName, char departmentName, int salary) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.salary = salary;
        EmployeeBook.plusIdBoundary();
        this.id = EmployeeBook.getIdBoundary();
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getDepartmentName() {
        return departmentName;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentName(char departmentName) {
        this.departmentName = departmentName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                " номер: " + id + "; " +
                " имя: " + name + "; \t" +
                " отчество: " + middleName + "; \t" +
                " фамилия: " + lastName + "; \t" +
                " отдел: " + departmentName + "; \t" +
                " з/п: " + salary + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentName == employee.departmentName &&
                salary == employee.salary &&
                id == employee.id &&
                Objects.equals(name, employee.name)
                && Objects.equals(middleName, employee.middleName)
                && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middleName, lastName, departmentName, salary, id);
    }
}