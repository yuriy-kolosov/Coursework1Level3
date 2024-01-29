import java.util.Arrays;

public class EmployeeBook {

    private Employee[] employeeArray;

    private static int idBoundary = 0;                      // Чтобы при удалении сотрудника из списка
    // id нового сотрудника не повторял id старого
    private static int employeeCounter = 0;                 // Число сотрудников в массиве данных

    public EmployeeBook(int employeeAmount) {
        this.employeeArray = new Employee[employeeAmount];
    }

    public static int getIdBoundary() {
        return idBoundary;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    public static void plusIdBoundary() {
        idBoundary++;
    }

    public static void plusEmployeeCounter() {
        employeeCounter++;
    }

    public static void minusEmployeeCounter() {
        employeeCounter--;
    }

    public void addEmployee(Employee aE) {

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] == aE) {
                System.out.printf("Сотрудник %s %s %s ранее уже был включен в массив данных\n",
                        employeeArray[i].getName(),
                        employeeArray[i].getMiddleName(),
                        employeeArray[i].getLastName());
                return;
            }
        }
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] == null) {
                employeeArray[i] = aE;
                plusEmployeeCounter();
                System.out.printf("Сотрудник %s %s %s добавлен в массив данных\n",
                        employeeArray[i].getName(),
                        employeeArray[i].getMiddleName(),
                        employeeArray[i].getLastName());
                return;
            }
        }
        System.out.println("Массив данных переполнен");
    }

    public void deleteEmployee(String n, String mN, String lN, char dN) {

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                if ((employeeArray[i].getName()).equals(n) &&
                        (employeeArray[i].getMiddleName()).equals(mN) &&
                        (employeeArray[i].getLastName()).equals(lN) &&
                        employeeArray[i].getDepartmentName() == dN) {
                    System.out.printf("Сотрудник %s %s %s исключен из массива данных\n",
                            employeeArray[i].getName(),
                            employeeArray[i].getMiddleName(),
                            employeeArray[i].getLastName());
                    employeeArray[i] = null;
                    minusEmployeeCounter();
                    return;
                }
            }
        }
        System.out.println("Сотрудник не найден");
    }

    public void changeEmployeeSalary(String n, String mN, String lN, char dN, int newSalary) {

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                if ((employeeArray[i].getName()).equals(n) &&
                        (employeeArray[i].getMiddleName()).equals(mN) &&
                        (employeeArray[i].getLastName()).equals(lN) &&
                        employeeArray[i].getDepartmentName() == dN) {
                    employeeArray[i].setSalary(newSalary);
                    System.out.printf("Сотруднику %s %s %s установлена з/п в размере %.2f рублей\n",
                            employeeArray[i].getName(),
                            employeeArray[i].getMiddleName(),
                            employeeArray[i].getLastName(),
                            (float) newSalary);
                    return;
                }
            }
        }
        System.out.println("Сотрудник не найден");
    }

    public void changeEmployeeDepartment(String n, String mN, String lN, char dN, char newDept) {

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                if ((employeeArray[i].getName()).equals(n) &&
                        (employeeArray[i].getMiddleName()).equals(mN) &&
                        (employeeArray[i].getLastName()).equals(lN) &&
                        employeeArray[i].getDepartmentName() == dN) {
                    employeeArray[i].setDepartmentName(newDept);
                    System.out.printf("Сотрудник %s %s %s переведен в отдел %s\n",
                            employeeArray[i].getName(),
                            employeeArray[i].getMiddleName(),
                            employeeArray[i].getLastName(),
                            newDept);
                    return;
                }
            }
        }
        System.out.println("Сотрудник не найден");
    }

    public void printEmployeeListAndData() {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            for (int i = 0; i < employeeArray.length; i++) {
                System.out.println(employeeArray[i]);
            }
        }
    }

    public void calculateAndPrintMonthSalary() {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i = 0;
            int sum = 0;
            for (Employee emp : employeeArray) {
                if ((employeeArray[i] != null) && (i++ < employeeArray.length)) {
                    sum = sum + emp.getSalary();
                } else break;
            }
            System.out.printf("Суммарное значение заработной платы сотрудников за месяц = %.2f руб.",
                    (double) sum);
            System.out.println();
        }
    }

    public void findAndPrintMinSalaryEmployee() {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j;
            int salary = 0;
            for (i = 0; i < employeeArray.length; i++) {
                if (employeeArray[i] != null) {
                    salary = employeeArray[i].getSalary();
                    break;
                }
            }
            for (i = j = 0; i < employeeArray.length - 1; i++) {
                if (employeeArray[i + 1] != null) {
                    if (salary > employeeArray[i + 1].getSalary()) {
                        salary = employeeArray[i + 1].getSalary();
                        j = i + 1;
                    }
                }
            }
            System.out.println("Сотрудник с минимальной з/п:\n" +
                    "номер: " + employeeArray[j].getId() +
                    ";\t имя: " + employeeArray[j].getName() +
                    ";\t отчеcтво: " + employeeArray[j].getMiddleName() +
                    ";\t фамилия: " + employeeArray[j].getLastName() +
                    ";\t отдел: " + employeeArray[j].getDepartmentName() +
                    ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
        }
    }

    public void findAndPrintMaxSalaryEmployee() {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j;
            int salary = 0;
            for (i = 0; i < employeeArray.length; i++) {
                if (employeeArray[i] != null) {
                    salary = employeeArray[i].getSalary();
                    break;
                }
            }
            for (i = j = 0; i < employeeArray.length - 1; i++) {
                if (employeeArray[i + 1] != null) {
                    if (salary < employeeArray[i + 1].getSalary()) {
                        salary = employeeArray[i + 1].getSalary();
                        j = i + 1;
                    }
                }
            }
            System.out.println("Сотрудник с максимальной з/п:\n" +
                    "номер: " + employeeArray[j].getId() +
                    ";\t имя: " + employeeArray[j].getName() +
                    ";\t отчеcтво: " + employeeArray[j].getMiddleName() +
                    ";\t фамилия: " + employeeArray[j].getLastName() +
                    ";\t отдел: " + employeeArray[j].getDepartmentName() +
                    ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
        }
    }

    public void calculateAndPrintAverageMonthSalary() {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i = 0;
            int sum = 0;
            double sumAverage = 0;
            for (Employee emp : employeeArray) {
                if ((employeeArray[i] != null) && (i++ < employeeArray.length)) {
                    sum = sum + emp.getSalary();
                } else break;
            }
            sumAverage = (double) sum / (employeeArray.length);
            System.out.printf("Среднее значение заработной платы сотрудников за месяц = %.2f руб.",
                    sumAverage);
            System.out.println();
        }
    }

    public void printEmployeeList() {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            for (int i = 0; i < employeeArray.length; i++) {
                if (employeeArray[i] != null) {
                    System.out.println("ФИО: " + employeeArray[i].getName() +
                            " " + employeeArray[i].getMiddleName() +
                            " " + employeeArray[i].getLastName());
                }
            }
        }
    }

    public void indexingSalary(int prc) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            for (int i = 0; i < employeeArray.length; i++) {
                if (employeeArray[i] != null) {
                    employeeArray[i].setSalary(employeeArray[i].getSalary() * (100 + prc) / 100);
                }
            }
            System.out.println("Выполнена индексация з/п сотрудников на " + prc + "%");
        }
    }

    public void findAndPrintMinSalaryDeptEmployee(char idDept) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j = -1;
            int salary = 0;
            for (i = 0; i < employeeArray.length; i++) {
                if (employeeArray[i] != null) {
                    if (employeeArray[i].getDepartmentName() == idDept) {
                        if (j < 0) {
                            salary = employeeArray[i].getSalary();
                            j = i;
                        } else if (salary > employeeArray[i].getSalary()) {
                            salary = employeeArray[i].getSalary();
                            j = i;
                        }
                    }
                }
            }
            if (j < 0) {
                System.out.println("Отдел " + idDept + " отсутствует");
            } else {
                System.out.println("Сотрудник отдела " + idDept + " с минимальной з/п:\n" +
                        "номер: " + employeeArray[j].getId() +
                        ";\t имя: " + employeeArray[j].getName() +
                        ";\t отчеcтво: " + employeeArray[j].getMiddleName() +
                        ";\t фамилия: " + employeeArray[j].getLastName() +
                        ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
            }
        }
    }

    public void findAndPrintMaxSalaryDeptEmployee(char idDept) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j = -1;
            int salary = 0;
            for (i = 0; i < employeeArray.length; i++) {
                if ((employeeArray[i] != null) && (employeeArray[i].getDepartmentName() == idDept)) {
                    if (j < 0) {
                        salary = employeeArray[i].getSalary();
                        j = i;
                    } else if (salary < employeeArray[i].getSalary()) {
                        salary = employeeArray[i].getSalary();
                        j = i;
                    }
                }
            }
            if (j < 0) {
                System.out.println("Отдел " + idDept + " отсутствует");
            } else {
                System.out.println("Сотрудник отдела " + idDept + " с максимальной з/п:\n" +
                        "номер: " + employeeArray[j].getId() +
                        ";\t имя: " + employeeArray[j].getName() +
                        ";\t отчеcтво: " + employeeArray[j].getMiddleName() +
                        ";\t фамилия: " + employeeArray[j].getLastName() +
                        ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
            }
        }
    }

    public void calculateAndPrintDeptMonthSalary(char idDept) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i = 0;
            int j = -1;
            int sum = 0;

            for (Employee emp : employeeArray) {
                if ((employeeArray[i] != null) &&
                        (emp.getDepartmentName() == idDept) &&
                        (i < employeeArray.length)) {
                    sum = sum + emp.getSalary();
                    j = i++;
                }
            }
            if (j < 0) {
                System.out.println("Отдел " + idDept + " отсутствует");
            } else {
                System.out.printf("Суммарное значение заработной платы сотрудников отдела %c за месяц = %.2f руб.",
                        idDept, (double) sum);
                System.out.println();
            }
        }
    }

    public void calculateAndPrintAverageDeptMonthSalary(char idDept) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i = 0;
            int j = -1;
            int sum = 0;
            double sumAverage = 0;
            for (Employee emp : employeeArray) {
                if ((employeeArray[i] != null) &&
                        (emp.getDepartmentName() == idDept) &&
                        (i < employeeArray.length)) {
                    sum = sum + emp.getSalary();
                    j = i++;
                }
            }
            if (j < 0) {
                System.out.println("Отдел " + idDept + " отсутствует");
            } else {
                sumAverage = (double) sum / i;
                System.out.printf("Среднее значение заработной платы сотрудников отдела %c за месяц = %.2f руб.",
                        idDept, sumAverage);
                System.out.println();
            }
        }
    }

    public void indexingDeptSalary(int prc, char idDept) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {

            for (int i = 0; i < employeeArray.length; i++) {
                if ((employeeArray[i] != null) && (employeeArray[i].getDepartmentName() == idDept)) {
                    employeeArray[i].setSalary(employeeArray[i].getSalary() * (100 + prc) / 100);
                }
            }
            System.out.printf("Выполнена индексация з/п сотрудников отдела %c на %.2f процентов",
                    idDept, (double) prc);
            System.out.println();
        }
    }

    public void printDeptEmployeeListAndData(char idDept) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int j = -1;
            System.out.println("Сотрудники отдела " + idDept + ":");

            for (int i = 0; i < employeeArray.length; i++) {

                if ((employeeArray[i] != null) && (employeeArray[i].getDepartmentName() == idDept)) {
                    System.out.println("номер: " + employeeArray[i].getId() +
                            ";\t имя: " + employeeArray[i].getName() +
                            ";\t отчеcтво: " + employeeArray[i].getMiddleName() +
                            ";\t фамилия: " + employeeArray[i].getLastName() +
                            ";\t з/п: " + employeeArray[i].getSalary() + " руб.");
                    j = i;
                }
            }
            if (j < 0) {
                System.out.println("списочный состав отдела пуст");
            }
        }
    }

    public void printAllDeptEmployeeListAndData() {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            char[] deptNames = new char[getEmployeeCounter()];
            int deptNum = 0;
            for (int i = 0; i < employeeArray.length; i++) {
                if (employeeArray[i] != null) {

                    for (int j = 0; (j <= deptNum) && (j < deptNames.length); j++) {

                        if (deptNum == 0) {
                            deptNames[j] = employeeArray[i].getDepartmentName();
                            deptNum++;
                            break;
                        } else if (employeeArray[i].getDepartmentName() == deptNames[j]) {
                            break;
                        } else if (j == deptNum) {
                            deptNames[j] = employeeArray[i].getDepartmentName();
                            deptNum++;
                            break;
                        }
                    }
                }
            }
            char[] deptNamesTruncated = Arrays.copyOf(deptNames, deptNum);
            Arrays.sort(deptNamesTruncated);
            for (int n = 0; n < deptNum; n++) {
                printDeptEmployeeListAndData(deptNamesTruncated[n]);
            }
        }
    }

    public void findAndPrintEmployeeWithSalaryMore(int boundaryValue) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j = -1;
            System.out.println("Сотрудники с з/п большей или равной " + boundaryValue + " руб.:");

            for (i = 0; i < employeeArray.length; i++) {

                if ((employeeArray[i] != null) && (employeeArray[i].getSalary() >= boundaryValue)) {
                    System.out.println("номер: " + employeeArray[i].getId() +
                            ";\t имя: " + employeeArray[i].getName() +
                            ";\t отчеcтво: " + employeeArray[i].getMiddleName() +
                            ";\t фамилия: " + employeeArray[i].getLastName() +
                            ";\t отдел: " + employeeArray[i].getDepartmentName() +
                            ";\t з/п: " + employeeArray[i].getSalary() + " руб.");
                    j = i;
                }
            }
            if (j < 0) {
                System.out.println("таких нет");
            }
        }
    }

    public void findAndPrintEmployeeWithSalaryLess(int boundaryValue) {
        if (getEmployeeCounter() == 0) {
            System.out.println("Cписочный состав сотрудников пуст");
        } else {
            int i;
            int j = -1;
            System.out.println("Сотрудники с з/п меньшей " + boundaryValue + " руб.:");
            for (i = 0; i < employeeArray.length; i++) {
                if ((employeeArray[i] != null) && (employeeArray[i].getSalary() < boundaryValue)) {
                    System.out.println("номер: " + employeeArray[i].getId() +
                            ";\t имя: " + employeeArray[i].getName() +
                            ";\t отчеcтво: " + employeeArray[i].getMiddleName() +
                            ";\t фамилия: " + employeeArray[i].getLastName() +
                            ";\t отдел: " + employeeArray[i].getDepartmentName() +
                            ";\t з/п: " + employeeArray[i].getSalary() + " руб.");
                    j = i;
                }
            }
            if (j < 0) {
                System.out.println("таких нет");
            }
        }

    }
}