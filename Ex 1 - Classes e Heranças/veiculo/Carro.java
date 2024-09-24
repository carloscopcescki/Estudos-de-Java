public class Carro extends Veiculo {
    private final ParteCarro[] portas;
    private final ParteCarro[] pneus;
    private final ParteCarro motor;

    public Carro(int anoFabricacao, float quantidadeGasolina, ParteCarro[] portas, ParteCarro[] pneus, ParteCarro motor) {
        super(anoFabricacao, quantidadeGasolina);
        this.portas = portas;
        this.pneus = pneus;
        this.motor = motor;
    }

    public ParteCarro[] getPortas() {
        return portas;
    }

    public ParteCarro[] getPneus() {
        return pneus;
    }

    public ParteCarro getMotor() {
        return motor;
    }

    @Override
    public void andar() {
        if (quantidadeGasolina > 0) {
            System.out.println("O carro está andando.");
        } else {
            System.out.println("O carro não pode andar, sem gasolina.");
        }
    }
}
