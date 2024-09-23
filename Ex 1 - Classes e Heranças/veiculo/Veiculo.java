public abstract class Veiculo {
    protected int anoFabricacao;
    protected float quantidadeGasolina;

    public Veiculo(int anoFabricacao, float quantidadeGasolina) {
        this.anoFabricacao = anoFabricacao;
        this.quantidadeGasolina = quantidadeGasolina;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public float getQuantidadeGasolina() {
        return quantidadeGasolina;
    }

    public abstract void andar();
}
