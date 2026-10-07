public class Main {

    public static void main(String[] args) {
        // Criando objetos das subclasses de Pessoa
        Aluno a1 = new Aluno("Walison", 19, 'M', 1111, "Análise e Desenvolvimento de Sistemas");
        AlunoBolsista b1 = new AlunoBolsista("Maria", 20, 'F', 2222, "Engenharia de Software", 50.0);
        AlunoTecnico t1 = new AlunoTecnico("João", 18, 'M', 3333, "Informática", "REG-12345");

        // Testando métodos de Aluno
        a1.pagarMensalidade();

        // Testando sobrescrita de método (Override) em AlunoBolsista
        b1.pagarMensalidade();
        b1.renovarBolsa();

        // Testando métodos específicos de AlunoTecnico
        t1.praticar();
        System.out.println("Registro Profissional: " + t1.getRegistroProfissional());

        // Método herdado da classe mãe (Pessoa)
        a1.fazerAniversario();
        System.out.printf("Nova idade de %s: %d anos%n", a1.getNome(), a1.getIdade());
    }
}