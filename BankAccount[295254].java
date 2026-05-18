public class BankAccount {

    private String ownerName;
    private String accountNumber;
    private double balance;
    private String accountType;
    private boolean isActive;

    public BankAccount() {
        this.ownerName = "Unknown";
        this.accountNumber = "000000";
        this.balance = 0.0;
        this.accountType = "Хадгаламж";
        this.isActive = false;
    }

    public BankAccount(String ownerName, String accountNumber, double balance, String accountType, boolean isActive) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.isActive = isActive;
    }

    private double calculateInterest() {
        if (accountType.equals("Хадгаламж")) {
            return balance * 0.08;
        } else {
            return balance * 0.05;
        }
    }

    private void evaluateBalance() {
        if (balance >= 10_000_000) {
            System.out.println("Зэрэглэл: 💎 Platinum");
        } else if (balance >= 1_000_000) {
            System.out.println("Зэрэглэл: 🥇 Gold");
        } else if (balance >= 100_000) {
            System.out.println("Зэрэглэл: 🥈 Silver");
        } else {
            System.out.println("Зэрэглэл: 🥉 Bronze");
        }
    }

    public void displayInfo() {
        System.out.println("=== Банкны данс ===");
        System.out.println("Эзэмшигч: " + ownerName);
        System.out.println("Дансны дугаар: " + accountNumber);
        System.out.println("Үлдэгдэл: " + balance + "₮");
        System.out.println("Дансны төрөл: " + accountType);
        System.out.println("Идэвхтэй эсэх: " + (isActive ? "Тийм" : "Үгүй"));
        System.out.println("Хүү: " + calculateInterest() + "₮");
        evaluateBalance();
    }

    public static void showBankInfo() {
        System.out.println("=== Монголын Банкны Систем ===");
        System.out.println("Валют: MNT (Төгрөг)");
    }
}