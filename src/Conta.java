public class Conta {
    double saldo; //atributo
    int agencia;
    int numero;
    String titular;

    void deposita(double valor){// metodo void e falar que nao devolve mensagem so recebe e pronto
        this.saldo = this.saldo + valor;
    }
}// metodo siginifica comportamento
