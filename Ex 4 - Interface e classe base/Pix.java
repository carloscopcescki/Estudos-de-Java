public class Pix extends Pagamento {
    @Override
    public void autorizarPagamento(){
        System.out.println("Autorizando pagamento via Pix");
    }

    public void processarPagamento(float valor){
        System.out.println("Processando pagamento no valor de R$ " + valor + " via Pix");
    }
}