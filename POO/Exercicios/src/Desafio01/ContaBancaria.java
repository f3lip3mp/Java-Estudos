package Desafio01;

public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBancaria() {
        setSaldo(0);
        setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        if (this.isStatus()) {
            System.out.println("Conta já existente");
        } else {
            System.out.println("Conta criada com sucesso!");
            setStatus(true);
        }
        if (getTipo() == "cc") {
            setSaldo(getSaldo() + 50);
        } else if (getTipo() == "cp") {
            setSaldo(getSaldo() + 150);
        }
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Não é possível encerrar sua conta - saldo disponível: " + getSaldo());
        } else if (getSaldo() < 0) {
            System.out.println("Não é possível encerrar sua conta - saldo devedor: " + getSaldo());
        } else {
            System.out.println("Conta encerrada!");
            setStatus(false);
        }
    }

    public void depositar(double v) {
        if (this.isStatus()) {
            setSaldo(getSaldo()+v);
            System.out.println("Saldo atualizado! Novo saldo: R$" + getSaldo());
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    public void sacar(double v) {
        if (this.isStatus() && getSaldo() - v >= 0) {
            setSaldo(getSaldo() - v);
            System.out.println("Saldo atualizado! Novo saldo: R$" + getSaldo());
        } else if (this.isStatus() && getSaldo() - v < 0) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    public void pagarMensal() {
        if (this.isStatus() && getTipo() == "cc") {
            setSaldo(getSaldo() - 12);
            System.out.println("Pagamento de mensalidade realizado! Novo saldo: R$" + getSaldo());
        } else if (this.isStatus() && getTipo() == "cp") {
            setSaldo(getSaldo() - 20);
            System.out.println("Pagamento de mensalidade realizado! Novo saldo: R$" + getSaldo());
        }
    }

    public void infomacoes() {
        System.out.println("Bem vindo, " + getDono());
        System.out.println("Seu saldo atual é: R$" + getSaldo());
        System.out.println("Nº de conta: " + getNumConta());
        System.out.println("Status: " + isStatus());
        if (getTipo() == "cc") {
            System.out.println("Seu tipo de conta bancária é CORRENTE");
        } else if (getTipo() == "cp") {
            System.out.println("Seu tipo de conta bancária é POUPANÇA");
        }
    }
}