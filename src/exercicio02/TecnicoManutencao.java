package exercicio02;

public class TecnicoManutencao extends Funcionario {

    private double insalubridademensal;

    public TecnicoManutencao(String nome, double salarioMensal, double bonusAnual,  double insalubridademensal) {
        this.nome = nome;
        this.insalubridademensal = insalubridademensal;
    }

    @Override
    public void salario() {
        super.salario();
        salarioAnual = salarioMensal + bonusAnual + insalubridademensal;
    }

    // TODO: implemente o código desta classe

}
