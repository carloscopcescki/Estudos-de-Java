public class App {
    public static void main(String[] args) {
        ParteCarro motor = new ParteCarro("Motor V8");
        ParteCarro[] portas = { new ParteCarro("Porta dianteira esquerda"), new ParteCarro("Porta dianteira direita") };
        ParteCarro[] pneus = { new ParteCarro("Pneu dianteiro esquerdo"), new ParteCarro("Pneu dianteiro direito"),
                new ParteCarro("Pneu traseiro esquerdo"), new ParteCarro("Pneu traseiro direito") };

        Carro meuCarro = new Carro(2023, 50.0f, portas, pneus, motor);

        System.out.println("Ano de Fabricação: " + meuCarro.getAnoFabricacao());
        System.out.println("Quantidade de Gasolina: " + meuCarro.getQuantidadeGasolina() + " litros");
        meuCarro.andar();
    }
}
