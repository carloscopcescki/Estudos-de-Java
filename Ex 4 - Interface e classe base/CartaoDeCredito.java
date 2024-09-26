public class CartaoDeCredito extends Pagamento {
    @Override
    public void autorizarPagamento(){
        System.out.println("Autorizando pagamento via cartão de crédito");
    }

    public void processarPagamento(float valor){
        System.out.println("Processando pagamento no valor de R$ " + valor + " via cartão de crédito");
    }
}