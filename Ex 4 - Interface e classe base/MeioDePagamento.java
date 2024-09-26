public interface MeioDePagamento {
    public void autorizarPagamento();
    public void processarPagamento(float valor);
}