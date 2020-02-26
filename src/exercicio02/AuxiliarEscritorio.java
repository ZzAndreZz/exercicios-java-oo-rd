package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    public AuxiliarEscritorio(String nome, double salarioMensal, double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public void salario() {
        super.salario();
        salarioAnual = salarioMensal * 13 + bonusAnual;
    }
}