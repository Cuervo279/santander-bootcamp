import java.util.Scanner;

public class ContaTerminal {
    private String account;
    private String agency;
    private String name;
    private Double balance;
    public static void main(String[] args) throws Exception {
        ContaTerminal account = new ContaTerminal();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Agência: ");
            account.setAgency(scan.next());

            System.out.print("Por favor, digite o número da Conta: ");
            account.setAccount(scan.next());

            System.out.print("Por favor, digite o seu nome: ");
            account.setName(scan.next());

            System.out.print("Por favor, digite o saldo inicial: ");
            account.setBalance(scan.nextDouble());
        }
        System.out.println("Olá " + account.getName() + ", obrigado por criar uma conta em nosso banco, sua agência é " + account.getAgency()+ ", conta " + account.getAccount() + " e seu saldo de " + account.getBalance() + " já está disponível para saque");
    }
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
