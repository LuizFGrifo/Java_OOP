package entities;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double deposit;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void deposit(double amount) {
        deposit += amount;
    }

    public void withdraw(double amount) {
        deposit -= amount + 5.0;
    }

    public String toString() {
    return "Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f", deposit);
    }
}
