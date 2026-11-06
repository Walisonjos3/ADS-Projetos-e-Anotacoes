public class Main {

    public static void main(String[] args) {
        System.out.println("=== 1. TESTE DE CÁLCULO DE PREÇO E PLANEJAMENTO ===");

        Endereco end1 = new Endereco("Rua das Flores", 123, "São Paulo");
        Ambiente amb1 = new Ambiente(101, 15.0, end1);
        Planejamento plan1 = new Planejamento(60, 50.0); // custoBase = (60 * 1) + 50 = 110.0

        System.out.println("Custo base do planejamento: " + plan1.custoBase() + " (Esperado: 110.0)");

        // Limpeza Econômica: custoBase (110) + 2 * area (30) + 0.20 * duracao (12) = 152.0
        // Como area >= 10 (15), aplica 10% de desconto -> 152.0 - 15.2 = 136.8
        LimpezaEconomica limEco = new LimpezaEconomica(amb1, plan1, 3, "Unidade Centro");
        double precoEco = limEco.calcularPreco();
        System.out.println("Preço da Limpeza Econômica: " + precoEco + " (Esperado: 136.8)");

        // Limpeza Urgente:
        Endereco end2 = new Endereco("Av. Paulista", 1000, "São Paulo");
        Ambiente amb2 = new Ambiente(102, 20.0, end2);
        Planejamento plan2 = new Planejamento(120, 30.0); // custoBase = (120 * 1) + 30 = 150.0
        // custoBase (150) + 2 * area (40) + 1.5 * duracao (180) + taxa extra p/ prazo <= 6h (10) = 380.0
        LimpezaUrgente limUrg = new LimpezaUrgente(amb2, plan2, 4, "Carlos Silva");
        double precoUrg = limUrg.calcularPreco();
        System.out.println("Preço da Limpeza Urgente: " + precoUrg + " (Esperado: 380.0)");

        // Teste de consulta não alterar estado
        boolean statusConcluidoAntes = limEco.isConcluida();
        System.out.println("Limpeza econômica concluída antes de concluir()? " + statusConcluidoAntes + " (Esperado: false)");


        System.out.println("\n=== 2. TESTES DA CENTRAL DE LIMPEZA E RESTRIÇÕES ===");

        CentralLimpeza central = new CentralLimpeza(3);

        boolean add1 = central.adicionar(limEco);
        boolean add2 = central.adicionar(limUrg);
        System.out.println("Adicionar Limpeza Econômica (Código 101): " + add1 + " (Esperado: true)");
        System.out.println("Adicionar Limpeza Urgente (Código 102): " + add2 + " (Esperado: true)");

        // Teste de código de ambiente duplicado
        Ambiente ambDup = new Ambiente(101, 10.0, end1);
        Planejamento planDup = new Planejamento(30, 10.0);
        LimpezaEconomica limDup = new LimpezaEconomica(ambDup, planDup, 5, "Unidade Sul");
        boolean addDup = central.adicionar(limDup);
        System.out.println("Adicionar limpeza com código duplicado (101): " + addDup + " (Esperado: false)");

        // Teste de valor total pendente (136.8 + 380.0 = 516.8)
        double pendentesInicial = central.totalPendentes();
        System.out.println("Valor total pendente inicial: " + pendentesInicial + " (Esperado: 516.8)");

        // Teste de finalização válida
        boolean finalizou101 = central.finalizar(101);
        System.out.println("Finalizar limpeza com código 101: " + finalizou101 + " (Esperado: true)");
        System.out.println("Status de conclusão da limpeza econômica: " + limEco.isConcluida() + " (Esperado: true)");

        // Teste de finalizar novamente o mesmo código já concluído
        boolean finalizouDeNovo = central.finalizar(101);
        System.out.println("Tentar finalizar limpeza 101 novamente: " + finalizouDeNovo + " (Esperado: false)");

        // Teste de valor total pendente após conclusão (deve restar apenas 380.0 da urgente)
        double pendentesApos = central.totalPendentes();
        System.out.println("Valor total pendente após conclusão: " + pendentesApos + " (Esperado: 380.0)");

        // Teste de código inexistente
        boolean finalizouInexistente = central.finalizar(999);
        System.out.println("Finalizar código inexistente (999): " + finalizouInexistente + " (Esperado: false)");

        System.out.println("\n[Exibição de Descrição Completa]");
        System.out.println("--- Limpeza Urgente ---");
        System.out.println(limUrg.gerarDescricao());
    }
}