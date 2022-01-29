public class Employee {
    String name;
    String job;
    String email;
    String phone;
    int pay_check;
    int age;

    public Employee(String name, String job, String email, String phone, int pay_check, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.pay_check = pay_check;
        this.age = age;
    }

    // Вывод информации о сотрудниках.
    public void displayInfo(){
        System.out.printf("ФИО: %s; Профессия: %s; Почта: %s; Телефон: %s; ЗП: %d; Возраст: %d\n",name, job, email, phone, pay_check, age);
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {

        Employee[] emp = new Employee[5];

        emp[0] = new Employee("Lavrov Nikita", "IT", "lavrov@mail.ru", "9251232332", 100000, 32);
        emp[1] = new Employee("Ivanov Ivan", "Data", "lavrov@mail.ru", "9251231444", 76000, 22);
        emp[2] = new Employee("Zhukova Tanya", "Banker", "lavrov@mail.ru", "9255115212", 70000, 41);
        emp[3] = new Employee("Le Mihail", "Security", "lavrov@mail.ru", "9251763312", 35000, 45);
        emp[4] = new Employee("Melik Dmitry", "Teacher", "lavrov@mail.ru", "9250014411", 50000, 55);

        for (Employee empOver40: emp) {
            if(empOver40.getAge()>40)
                empOver40.displayInfo();
        }
    }
}
