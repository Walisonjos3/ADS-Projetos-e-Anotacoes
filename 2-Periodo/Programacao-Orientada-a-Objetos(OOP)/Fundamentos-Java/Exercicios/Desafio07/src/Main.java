public class Main {

    public static void main(String[] args) {

        Filme filmeAdulto = new Filme("O Poderoso Chefão", "Drama", 175, 18);
        Filme filmeLivre = new Filme("Divertida Mente", "Animação", 95, 0);

        // Teste Idade Insuficiente
        Cliente clienteNovo = new Cliente("Lucas", 15, 50.0);
        Sessao sessao1 = new Sessao(filmeAdulto, 1, "19:00", 20.0, 10);
        Ingresso ingresso1 = new Ingresso(clienteNovo, sessao1);
        System.out.println("--- Teste 1: Idade Insuficiente ---");
        ingresso1.confirmarCompra(); // Deve falhar

        // Teste Falta de Saldo
        Cliente clienteSemSaldo = new Cliente("Walison", 20, 5.0);
        Sessao sessao2 = new Sessao(filmeLivre, 2, "15:00", 25.0, 10);
        Ingresso ingresso2 = new Ingresso(clienteSemSaldo, sessao2);
        System.out.println("\n--- Teste 2: Saldo Insuficiente ---");
        ingresso2.confirmarCompra(); // Deve falhar

        // Teste Falta de Vagas
        Cliente clienteComSaldo = new Cliente("Maria", 25, 100.0);
        Sessao sessaoLotada = new Sessao(filmeLivre, 3, "21:00", 20.0, 0); // 0 vagas
        Ingresso ingresso3 = new Ingresso(clienteComSaldo, sessaoLotada);
        System.out.println("\n--- Teste 3: Sessão Lotada ---");
        ingresso3.confirmarCompra(); // Deve falhar

        // Teste Compra Bem-Sucedida
        Sessao sessaoValida = new Sessao(filmeLivre, 4, "18:00", 30.0, 50);
        Ingresso ingresso4 = new Ingresso(clienteComSaldo, sessaoValida);
        System.out.println("\n--- Teste 4: Compra Bem-Sucedida ---");
        ingresso4.confirmarCompra(); // Deve ter sucesso
        ingresso4.mostrarComprovante();

        // Teste Repetição da Confirmação do Mesmo Ingresso
        System.out.println("--- Teste 5: Re-confirmar mesmo ingresso ---");
        ingresso4.confirmarCompra(); // Deve falhar e não cobrar novamente
    }
}