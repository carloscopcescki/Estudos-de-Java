public class BoletoBancario extends Pagamento {
    @Override
    public void autorizarPagamento(){
        System.out.println("Autorizando pagamento via boleto");
    }

    public void processarPagamento(float valor){
        System.out.println("Processando pagamento no valor de R$ " + valor + " via boleto bancário");
    }
}