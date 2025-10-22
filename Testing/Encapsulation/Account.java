public class Account {
    private double balance;

    public void deposit(double ammount) {
        if (ammount > 0) {
            balance += ammount;
        } else {
            System.out.println("Сумма депозита должна быть положительной.");
        }
    }

    public void withdraw(double ammount) {
        if (ammount <= balance && ammount >0) {
            balance -= ammount;
        } else {
            System.out.println("Недостаточно средств для снятия.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account lox = new Account();
        lox.deposit(10);
        lox.withdraw(2.25);
        System.out.println("Баланс: " + lox.getBalance());
}
}

class Person {
    public static void main(String[] args) {
        Account Bless = new Account();
        Bless.deposit(10);
        Bless.withdraw(32.25);
        System.out.println("Баланс: " + Bless.getBalance());
    } 
}