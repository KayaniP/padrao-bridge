public class TecnicoAutoma extends Cargo {

    private int numFuncoes;

    public TecnicoAutoma(float salarioBase) {
        super(salarioBase);
    }

    public void setNumFuncoes(int numFuncoes) {
        this.numFuncoes = numFuncoes;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numFuncoes * (1 + this.escolaridade.percentualAumento());
    }
}