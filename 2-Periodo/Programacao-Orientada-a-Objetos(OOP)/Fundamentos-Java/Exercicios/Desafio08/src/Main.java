public class Main {
    public static void main(String[] args) {

        // 1. Criar a central com capacidade 3 conforme o cenário obrigatório
        CentralEntregas central = new CentralEntregas(3);

        // 2. Criar rotas de 10 km com pedágio de R$ 5,00
        Rota rota1 = new Rota(10.0, 5.0);
        Rota rota2 = new Rota(10.0, 5.0);
        Rota rota3 = new Rota(10.0, 5.0);

        // 3. Criar endereços
        Endereco endereco1 = new Endereco("Rua A", 100, "Cidade X");
        Endereco endereco2 = new Endereco("Rua B", 200, "Cidade X");
        Endereco endereco3 = new Endereco("Rua C", 300, "Cidade X");

        // 4. Criar as encomendas dos cenários
        // Encomenda 101: 10 kg
        Encomenda encomenda101 = new Encomenda(101, 10.0, endereco1);
        // Encomenda 102: 10 kg
        Encomenda encomenda102 = new Encomenda(102, 10.0, endereco2);
        // Encomenda 103: 1 kg
        Encomenda encomenda103 = new Encomenda(103, 1.0, endereco3);

        // 5. Criar as entregas específicas
        // 101: Expressa de 4h
        EntregaExpressa entregaExpressa1 = new EntregaExpressa(encomenda101, rota1, 4, "João");
        // 102: Económica de 3 dias
        EntregaEconomica entregaExpressa2 = new EntregaEconomica(encomenda102, rota2, 3, "CD Central");
        // 103: Expressa de 4h
        EntregaExpressa entregaExpressa3 = new EntregaExpressa(encomenda103, rota3, 4, "Maria");

        // 6. Adicionar à central
        central.adicionar(entregaExpressa1);
        central.adicionar(entregaExpressa2);
        central.adicionar(entregaExpressa3);

        // 7. Testar fretes individuais esperados
        System.out.println("--- Teste de Fretes Individuais ---");
        System.out.println("101 -> R$ " + entregaExpressa1.calcularFrete() + " (Esperado: 44,00)");
        System.out.println("102 -> R$ " + entregaExpressa2.calcularFrete() + " (Esperado: 33,30)");
        System.out.println("103 -> R$ " + entregaExpressa3.calcularFrete() + " (Esperado: 32,00)");

        // 8. Testar total de pendentes inicial
        System.out.println("\n--- Total Pendentes ---");
        System.out.println("Total inicial pendente: R$ " + central.totalPendentes() + " (Esperado: 109,30)");

        // 9. Testar finalização da entrega 101
        System.out.println("\n--- Teste de Finalização ---");
        boolean finalizou101 = central.finalizar(101);
        System.out.println("Finalizar 101: " + finalizou101 + " (Esperado: true)");

        // Tentar finalizar novamente para testar se retorna false
        boolean finalizou101Novamente = central.finalizar(101);
        System.out.println("Finalizar 101 de novo: " + finalizou101Novamente + " (Esperado: false)");

        // 10. Verificar total pendente após finalizar 101 (deve descontar os 44,00 e sobra 65,30)
        System.out.println("Total pendente após finalizar 101: R$ " + central.totalPendentes() + " (Esperado: 65,30)");

        // 11. Exibir descrição de uma das entregas usando polimorfismo
        System.out.println("\n--- Descrição da Entrega 101 ---");
        System.out.println(entregaExpressa1.gerarDescricao());
    }
}