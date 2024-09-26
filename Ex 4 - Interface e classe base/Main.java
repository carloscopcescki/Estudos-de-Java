import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        float valor = 100; 

        ArrayList <MeioDePagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new BoletoBancario());
        pagamentos.add(new CartaoDeCredito());
        pagamentos.add(new Pix());

        for (MeioDePagamento pagamento : pagamentos) {
            pagamento.autorizarPagamento();
            pagamento.processarPagamento(valor);
        }
    }
}