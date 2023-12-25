public class start {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Serg", "Domoratskiy", "Vladimirovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Ivan", "Domoratskiy", "Vladimirovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[2] = new Employee("Petr", "Domoratskiy", "Vladimirovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[3] = new Employee("Fedor", "Domoratskiy", "Vladimirovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[4] = new Employee("Igor", "Domoratskiy", "Vladimirovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);

        empArray[1].employeeInfo();
    }




}
