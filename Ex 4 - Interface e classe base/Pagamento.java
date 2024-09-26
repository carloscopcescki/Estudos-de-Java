public class Pagamento implements MeioDePagamento {
    public float valor;

    @Override
    public void autorizarPagamento() {
        System.out.println("Autorizando pagamento");
    }

    @Override
    public void processarPagamento(float valor) {
        System.out.println("Processando pagamento" + valor);
    }

    public void mostrarDetalhes() {
        System.out.println("Realizando operações de pagamento");
    }
}