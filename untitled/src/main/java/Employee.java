public class Employee {
    private String firstName;
    private String secondName;
    private String patricName;
    private String position;
    private String email;
    private String telNumber;
    private Integer salary;
    private Integer age;

    public Employee(String firstName, String secondName, String patricName, String position, String email, String telNumber, Integer salary, Integer age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patricName = patricName;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    public void employeeInfo() {
        System.out.println("ФИО: " + secondName + " " + firstName + " " + patricName);
        System.out.println("Email: " + email);
        System.out.println("Должность: " + position);
        System.out.println("Телефон: " + telNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
