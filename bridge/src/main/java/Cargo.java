public abstract class Cargo {

    protected Classificacao escolaridade;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setEscolaridade(Classificacao escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}