public class Main {
    public static void main(String[] args) {

        BankAccount.showBankInfo();

        System.out.println();

        BankAccount acc1 = new BankAccount();
        acc1.displayInfo();

        System.out.println();

        BankAccount acc2 = new BankAccount("Бат Болд", "MN10203040", 5_000_000, "Хадгаламж", true);
        acc2.displayInfo();

        System.out.println();

        BankAccount acc3 = new BankAccount("Номин Эрдэнэ", "MN50607080", 15_000_000, "Харилцах", true);
        acc3.displayInfo();
    }
}