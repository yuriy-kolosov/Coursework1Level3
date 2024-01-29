public class Main {

    public static void main(String[] args) {
        System.out.println("Курсовая работа 1. Техническое задание");
        System.out.println();
        System.out.println("        Уровень 3. Очень сложно");
        System.out.println();

        EmployeeBook employeeData = new EmployeeBook(10);
//                                                                          Данные сотрудников:
//                                                                          Имя
        String employeeName1 = "Иван";
        String employeeName2 = "Мария";
        String employeeName3 = "Петр";
        String employeeName4 = "Василий";
        String employeeName5 = "Анна";
        String employeeName6 = "Сидор";
        String employeeName7 = "Виктор";
        String employeeName8 = "Роман";
        String employeeName9 = "Кирилл";
        String employeeName10 = "Ольга";

        String employeeName11 = "Вера";                                     // Дополнительный сотрудник
        String employeeName12 = "Елена";                                    // Дополнительный сотрудник

//                                                                          Отчество
        String employeeMiddleName1 = "Иванович";
        String employeeMiddleName2 = "Семёновна";
        String employeeMiddleName3 = "Петрович";
        String employeeMiddleName4 = "Васильевич";
        String employeeMiddleName5 = "Николаевна";
        String employeeMiddleName6 = "Фёдорович";
        String employeeMiddleName7 = "Сергеевич";
        String employeeMiddleName8 = "Миронович";
        String employeeMiddleName9 = "Евгеньевич";
        String employeeMiddleName10 = "Георгиевна";

        String employeeMiddleName11 = "Анатольевна";                         // Дополнительный сотрудник
        String employeeMiddleName12 = "Алексеевна";                         // Дополнительный сотрудник
//                                                                          Фамилия
        String employeeLastName1 = "Иванов";
        String employeeLastName2 = "Сидорова";
        String employeeLastName3 = "Тихонов";
        String employeeLastName4 = "Павлов";
        String employeeLastName5 = "Кузнецова";
        String employeeLastName6 = "Топорков";
        String employeeLastName7 = "Седов";
        String employeeLastName8 = "Ветров";
        String employeeLastName9 = "Синцов";
        String employeeLastName10 = "Кедрова";

        String employeeLastName11 = "Рощина";                              // Дополнительный сотрудник
        String employeeLastName12 = "Платова";                              // Дополнительный сотрудник
//                                                                          Отдел
        char deptName1 = '1';
        char deptName2 = '2';
        char deptName3 = '3';
        char deptName4 = '4';
        char deptName5 = '5';
        char deptName6 = '1';
        char deptName7 = '2';
        char deptName8 = '3';
        char deptName9 = '4';
        char deptName10 = '5';

//                                                                          З/п
        int employeeSalary1 = 100000;
        int employeeSalary2 = 72000;
        int employeeSalary3 = 110000;
        int employeeSalary4 = 90000;
        int employeeSalary5 = 100000;
        int employeeSalary6 = 80000;
        int employeeSalary7 = 72000;
        int employeeSalary8 = 60000;
        int employeeSalary9 = 90000;
        int employeeSalary10 = 58000;

        int employeeSalary11 = 36000;                                       // Дополнительный сотрудник
        int employeeSalary12 = 43000;                                       // Дополнительный сотрудник

//                                                              Проверка до заполнения списка:
        employeeData.printEmployeeListAndData();                // 1-1 - Вывод всех данных о сотрудниках
        System.out.println();
//                                                                  Заполнение массива данных (EmployeeBook)
        employeeData.addEmployee(new Employee(employeeName1, employeeMiddleName1, employeeLastName1, deptName1, employeeSalary1));
        employeeData.addEmployee(new Employee(employeeName2, employeeMiddleName2, employeeLastName2, deptName2, employeeSalary2));
        employeeData.addEmployee(new Employee(employeeName3, employeeMiddleName3, employeeLastName3, deptName3, employeeSalary3));
        employeeData.addEmployee(new Employee(employeeName4, employeeMiddleName4, employeeLastName4, deptName4, employeeSalary4));
        employeeData.addEmployee(new Employee(employeeName5, employeeMiddleName5, employeeLastName5, deptName5, employeeSalary5));
        employeeData.addEmployee(new Employee(employeeName6, employeeMiddleName6, employeeLastName6, deptName6, employeeSalary6));
        employeeData.addEmployee(new Employee(employeeName7, employeeMiddleName7, employeeLastName7, deptName7, employeeSalary7));
        employeeData.addEmployee(new Employee(employeeName8, employeeMiddleName8, employeeLastName8, deptName8, employeeSalary8));
        employeeData.addEmployee(new Employee(employeeName9, employeeMiddleName9, employeeLastName9, deptName9, employeeSalary9));
        employeeData.addEmployee(new Employee(employeeName10, employeeMiddleName10, employeeLastName10, deptName10, employeeSalary10));
        System.out.println();
//                                                              Этап тестирования 3-1
//                                                              Проверка после заполнения списка:
        employeeData.printEmployeeListAndData();                // 1-1 - Вывод всех данных о сотрудниках
        System.out.println();

        employeeData.calculateAndPrintMonthSalary();            // 1-2 - Вывод суммы зарплаты всех сотрудников за месяц
        System.out.println();

        employeeData.findAndPrintMinSalaryEmployee();           // 1-3 - Вывод данных о сотруднике с минимальной зарплатой
        System.out.println();

        employeeData.findAndPrintMaxSalaryEmployee();           // 1-4 - Вывод данных о сотруднике с максимальной зарплатой
        System.out.println();

        employeeData.calculateAndPrintAverageMonthSalary();     // 1-5 - Вывод средней величины суммы зарплаты всех сотрудников за месяц
        System.out.println();

        employeeData.printEmployeeList();                        // 1-6 - Вывод списочного состава сотрудников (ФИО)
        System.out.println();

        employeeData.indexingSalary(10);                    // 2-7-1 - Индексация з/п сотрудников на 10%
        System.out.println();

        employeeData.printEmployeeListAndData();                // 2-1-3 - Вывод всех данных о сотрудниках с индексированной з/п
        System.out.println();

        employeeData.indexingSalary(10);                    // 2-7-2 - Индексация з/п сотрудников на 10% (пример)
        System.out.println();
        employeeData.printEmployeeListAndData();                // 2-1-5 - Вывод всех данных о сотрудниках с новым значением з/п
        System.out.println();

        employeeData.findAndPrintMinSalaryDeptEmployee('1');  // 2-12-1 - Вывод данных о сотруднике отдела 2 с минимальной з/п
        System.out.println();
        employeeData.findAndPrintMinSalaryDeptEmployee('5');  // 2-12-2 - Вывод данных о сотруднике отдела 5 с минимальной з/п
        System.out.println();
        employeeData.findAndPrintMinSalaryDeptEmployee('8');  // 2-12-3 - Вывод данных о сотруднике отдела 8 (отсутствует) с минимальной з/п
        System.out.println();
        employeeData.findAndPrintMaxSalaryDeptEmployee('3');  // 2-13-1 - Вывод данных о сотруднике отдела 2 с максимальной з/п
        System.out.println();
        employeeData.findAndPrintMaxSalaryDeptEmployee('5');  // 2-13-2 - Вывод данных о сотруднике отдела 5 с максимальной з/п
        System.out.println();
        employeeData.findAndPrintMaxSalaryDeptEmployee('7');  // 2-13-3 - Вывод данных по запросу о сотруднике отдела 10 (отсутствует) с максимальной з/п
        System.out.println();
        employeeData.calculateAndPrintDeptMonthSalary('2');   // 2-14-1 - Вывод суммарной з/п отдела 2
        System.out.println();
        employeeData.calculateAndPrintDeptMonthSalary('4');   // 2-14-2 - Вывод суммарной з/п отдела 4
        System.out.println();
        employeeData.calculateAndPrintDeptMonthSalary('9');   // 2-14-3 - Вывод суммарной з/п отдела 9 (отсутствует)
        System.out.println();
        employeeData.calculateAndPrintAverageDeptMonthSalary('1');   // 2-15-1 - Вывод средней з/п отдела 1
        System.out.println();
        employeeData.calculateAndPrintAverageDeptMonthSalary('3');   // 2-15-2 - Вывод средней з/п отдела 3
        System.out.println();
        employeeData.calculateAndPrintAverageDeptMonthSalary('6');   // 2-15-3 - Вывод средней з/п отдела 6 (отсутствует)
        System.out.println();
        employeeData.indexingDeptSalary(5, '2');                     // 2-7-3 - Индексация з/п сотрудников отдела 2 на 5%
        System.out.println();
        employeeData.printEmployeeListAndData();                                 // 2-1-6 - Вывод всех данных о сотрудниках с новым значением з/п
        System.out.println();
        employeeData.indexingDeptSalary(12, '5');                    // 2-16-1 - Индексация з/п сотрудников отдела 5 на 12%
        System.out.println();
        employeeData.printEmployeeListAndData();                                 // 2-1-7 - Вывод всех данных о сотрудниках с новым значением з/п
        System.out.println();
        employeeData.printDeptEmployeeListAndData('3');                   // 2-17-1 - Вывод всех данных о сотрудниках отдела 3
        System.out.println();
        employeeData.printDeptEmployeeListAndData('5');                    // 2-17-2 - Вывод всех данных о сотрудниках отдела 5
        System.out.println();
        employeeData.printDeptEmployeeListAndData('6');                    // 2-17-3 - Вывод всех данных о сотрудниках отдела 6 (отсутствует)
        System.out.println();
        employeeData.findAndPrintEmployeeWithSalaryMore(100000);     // 2-18-1 - Список сотрудников с з/п более или равной 100000 руб.
        System.out.println();
        employeeData.findAndPrintEmployeeWithSalaryMore(70000);     // 2-18-2 - Список сотрудников с з/п более или равной 70000 руб.
        System.out.println();
        employeeData.findAndPrintEmployeeWithSalaryMore(150000);     // 2-18-3 - Список сотрудников с з/п более или равной 150000 руб.
        System.out.println();
        employeeData.findAndPrintEmployeeWithSalaryLess(120000);     // 24-19-1- Список сотрудников с з/п менее 100000 руб.
        System.out.println();
        employeeData.findAndPrintEmployeeWithSalaryLess(80000);     // 2-19-2 - Список сотрудников с з/п менее 100000 руб.
        System.out.println();
        employeeData.findAndPrintEmployeeWithSalaryLess(50000);      // 2-19-3 - Список сотрудников с з/п менее 50000 руб.
        System.out.println();
//                                                                                  Этап тестирования 3-2
        Employee employee11 = new Employee(employeeName11, employeeMiddleName11, employeeLastName11, deptName5, employeeSalary11);
        Employee employee12 = new Employee(employeeName12, employeeMiddleName12, employeeLastName12, deptName3, employeeSalary12);
//
        employeeData.addEmployee(employee11);
        System.out.println();

        employeeData.deleteEmployee(employeeName5, employeeMiddleName5, employeeLastName5, deptName5);
        System.out.println();
//                                                                                  Проверка 1 после исключения сотрудника из списка:
        employeeData.printEmployeeListAndData();                                    // 3-1-1 - Вывод всех данных о сотрудниках
        System.out.println();

        employeeData.deleteEmployee(employeeName10, employeeMiddleName10, employeeLastName10, deptName10);
        System.out.println();
//                                                                                  Проверка 2 после исключения сотрудника из списка:
        employeeData.printEmployeeListAndData();                                    // 3-1-2 - Вывод всех данных о сотрудниках
        System.out.println();

        employeeData.deleteEmployee(employeeName1, employeeMiddleName1, employeeLastName1, deptName1);
        System.out.println();
//                                                                                  Проверка 3 после исключения сотрудника из списка:
        employeeData.printEmployeeListAndData();                                    // 3-1-3 - Вывод всех данных о сотрудниках
        System.out.println();

        employeeData.addEmployee(employee11);                                       // 3-2-1 - Новый сотрудник
        System.out.println();

        employeeData.printEmployeeListAndData();                                    // 3-1-4 - Вывод всех данных о сотрудниках
        System.out.println();
//                                                                                  Проверка изменения з/п:
        employeeData.changeEmployeeSalary(employeeName2, employeeMiddleName2, employeeLastName2, deptName2, 100000);
        System.out.println();
//                                                                                  Проверка после изменения з/п:
        employeeData.printEmployeeListAndData();                                    // 3-1-5 - Вывод всех данных о сотрудниках
        System.out.println();
//                                                                                  // 3-3-1 Вывод данных о сотрудниках по отделам
        employeeData.printAllDeptEmployeeListAndData();
        System.out.println();
//                                                                                  Проверка после изменения з/п:
        employeeData.printEmployeeListAndData();                                    // 3-1-7 - Вывод всех данных о сотрудниках
        System.out.println();

        employeeData.changeEmployeeDepartment(employeeName2, employeeMiddleName2, employeeLastName2, deptName2, '3');
        System.out.println();
//                                                                                  Проверка после изменения отдела:
        employeeData.printAllDeptEmployeeListAndData();                             // 3-3-2 Вывод данных о сотрудниках по отделам
        System.out.println();

        employeeData.printEmployeeListAndData();                                    // 3-1-8 - Вывод всех данных о сотрудниках
        System.out.println();

        employeeData.addEmployee(employee11);                                       // 3-2-2 - Попытка повторного вводв данных о сотруднике
        System.out.println();
//                                                                                  Проверка после добавления нового сотрудника:
        employeeData.printAllDeptEmployeeListAndData();                             // 3-3-3 Вывод данных о сотрудниках по отделам
        System.out.println();

        employeeData.printEmployeeListAndData();                                    // 3-1-9 - Вывод всех данных о сотрудниках
        System.out.println();

        employeeData.addEmployee(employee12);                                       // 3-2-3 - Новый сотрудник
        System.out.println();
//                                                                                  Проверка после добавления нового сотрудника:
        employeeData.printAllDeptEmployeeListAndData();                             // 3-3-4 Вывод данных о сотрудниках по отделам
        System.out.println();

        employeeData.printEmployeeListAndData();                                    // 3-1-10 - Вывод всех данных о сотрудниках
        System.out.println();

    }
}