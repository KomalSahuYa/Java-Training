package module_1_test_lab_question_2;

public class umlmain {
    public static void main(String[] args) {

        Date d1 = new Date(10, 5, 2002);
        Owner o1 = new Owner("Komal", d1, "NIC123");

        Account a1 = new SavingAccount(o1, 5000, "SA1001", 5.5f);
        Account a2 = new CurrentAccount(o1, 8000, "CA2001", 1000);

        a1.deposit(1000);
        a1.withdraw(500);
        a1.print();

        a2.deposit(2000);
        a2.withdraw(1000);
        a2.print();
    }
}
