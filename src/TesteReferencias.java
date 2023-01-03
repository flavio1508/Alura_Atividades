public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta.saldo = 300;

        System.out.println("Saldo do primeiro:" + primeirConta.saldo);
        
        Conta segundConta = primeirConta;
        System.out.println("saldo da segunda conta" + segundConta.saldo);

        segundConta.saldo += 100;
        System.out.println(segundConta.saldo);

        System.out.println(primeirConta.saldo);

        if (primeirConta == segundConta) {// mesma referencia
            System.out.println("mesma conta");
        }
    }
    
}
