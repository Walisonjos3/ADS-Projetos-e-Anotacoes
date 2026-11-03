public class Main {

    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana", "ana@gmail.com");
        Cliente bruno = new Cliente("Bruno", "bruno@gmail.com");
        Cliente carla = new Cliente("Carla", "carla@gmail.com");

        Plataforma plataforma1 = new Plataforma(3);

        Assinatura assinaturaAna = new AssinaturaPremium(ana, "Premium", 50, 20);
        Assinatura assinaturaBruno = new AssinaturaEstudantil(bruno, "Estudantil", 40, 25);
        Assinatura assinaturaCarla = new AssinaturaPremium(carla, "Premium", 60, 30);

        System.out.println("   <  Cadastrando assinaturas!");
        System.out.println("Cadastrando Ana: " + plataforma1.cadastrar(assinaturaAna));
        System.out.println("Cadastrando Bruno: " + plataforma1.cadastrar(assinaturaBruno));
        System.out.println("Cadastrando Carla: " + plataforma1.cadastrar(assinaturaCarla));

        // Testes de cadastro repetido e quarta assinatura
        System.out.println("Cadastrar Ana novamente (repetido): " + plataforma1.cadastrar(assinaturaAna));
        Cliente daniel = new Cliente("Daniel", "daniel@email.com");
        Assinatura assinaturaDaniel = new AssinaturaEstudantil(daniel, "Estudantil", 30.0, 10.0);
        System.out.println("Cadastrar 4ª assinatura (vetor cheio): " + plataforma1.cadastrar(assinaturaDaniel));

        // Emitindo faturas de 3 meses e percorrendo com for-each
        System.out.println("\n--- Faturas Emitidas (3 meses) ---");
        Fatura[] faturas = plataforma1.gerarFaturas(3);
        double somaTotal = 0;

        for (Fatura fatura : faturas) {
            System.out.println(fatura.resumoFatura());
            somaTotal += fatura.getTotal();
        }
        System.out.println("Soma total: R$ " + String.format("%.2f", somaTotal));

        // Teste de Pagamento
        System.out.println("\n--- Teste de Pagamento ---");
        System.out.println("Pagar 1ª fatura (sucesso): " + faturas[0].pagar());
        System.out.println("Pagar 1ª fatura novamente (já paga): " + faturas[0].pagar());

        // Teste de meses inválidos (0 e -2)
        System.out.println("\n--- Teste Meses Inválidos ---");
        Fatura[] faturasZero = plataforma1.gerarFaturas(0);
        Fatura[] faturasNegativo = plataforma1.gerarFaturas(-2);
        System.out.println("Vetor gerado para 0 meses - Tamanho: " + faturasZero.length);
        System.out.println("Vetor gerado para -2 meses - Tamanho: " + faturasNegativo.length);

        // Cancelar Ana e reemitir faturas
        System.out.println("\n--- Após Cancelar Ana ---");
        assinaturaAna.cancelar();
        Fatura[] faturasAposCancelamento = plataforma1.gerarFaturas(3);
        double somaCancelada = 0;

        for (Fatura faturaCancelar: faturasAposCancelamento) {
            System.out.println(faturaCancelar.resumoFatura());
            somaCancelada += faturaCancelar.getTotal();
        }
        System.out.println("Soma após cancelamento: R$ " + String.format("%.2f", somaCancelada));
        System.out.println("Fatura antiga de Ana permanece intacta com total: R$ " + String.format("%.2f", faturas[0].getTotal()));
    }
}
