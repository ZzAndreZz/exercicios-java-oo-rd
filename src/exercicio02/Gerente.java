package exercicio02;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioMensal, double bonusAnual) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.bonusAnual = bonusAnual;
    }

    @Override
    public void salario() {
        super.salario();
        salarioAnual = (salarioMensal * 13) + (bonusAnual * salarioMensal);
    }

    // TODO: implemente o código desta classe

}
