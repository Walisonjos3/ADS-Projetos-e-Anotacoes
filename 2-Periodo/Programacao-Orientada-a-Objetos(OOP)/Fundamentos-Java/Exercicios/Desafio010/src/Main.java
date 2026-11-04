public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. TESTE DE DANO E RECURSOS ===");

        // Personagem de treino (vida 300)
        Personagem treino = new Personagem("Boneco Treino", 300, 0, new Arma("Nenhuma", 0, 0)) {};

        Guerreiro guerreiro = new Guerreiro("Thor", 100, 10, new Arma("Espada", 2, 2), 8);
        Mago mago = new Mago("Gandalf", 100, 10, new Arma("Cajado", 2, 2), 15, 10);
        Arqueiro arqueiro = new Arqueiro("Legolas", 100, 10, new Arma("Arco", 2, 2), 1, 6);
        Guardiao guardiao = new Guardiao("Braum", 100, 10, new Arma("Martelo", 2, 2), 5);

        Personagem[] atacantes = { guerreiro, mago, arqueiro, guardiao };

        for (Personagem personagem : atacantes) {
            int dano = personagem.calcularDano();
            System.out.println(personagem.getNome() + " calculou dano: " + dano);
            personagem.atacarAlvo(treino);
        }

        System.out.println("\n[Validação Pós-Ataque Inicial]");
        System.out.println("Vida do alvo de treino: " + treino.getVida() + " (Esperado: 223)");
        System.out.println("Durabilidade arma Guerreiro: " + guerreiro.getArma().getDurabilidade() + " (Esperado: 1)");
        System.out.println("Durabilidade arma Mago: " + mago.getArma().getDurabilidade() + " (Esperado: 1)");
        System.out.println("Durabilidade arma Arqueiro: " + arqueiro.getArma().getDurabilidade() + " (Esperado: 1)");
        System.out.println("Durabilidade arma Guardião: " + guardiao.getArma().getDurabilidade() + " (Esperado: 1)");
        System.out.println("Mana do Mago: " + mago.getMana() + " (Esperado: 0)");
        System.out.println("Flechas do Arqueiro: " + arqueiro.getFlechas() + " (Esperado: 0)");

        // Mago ataca de novo
        System.out.println("\n--- Segundo Ataque do Mago ---");
        System.out.println("Próximo calcularDano() do Mago (sem mana, durabilidade 1): " + mago.calcularDano() + " (Esperado: 12)");
        mago.atacarAlvo(treino);
        System.out.println("Durabilidade da arma do Mago após o ataque: " + mago.getArma().getDurabilidade() + " (Esperado: 0)");
        System.out.println("Próximo calcularDano() do Mago (sem mana, durabilidade 0): " + mago.calcularDano() + " (Esperado: 10)");

        // Guardião recebe dano
        System.out.println("\n--- Teste de Dano no Guardião ---");
        Guardiao guardiaoTeste = new Guardiao("Guardião Teste", 100, 10, new Arma("Escudo", 0, 0), 5);
        guardiaoTeste.receberDano(20);
        System.out.println("Vida do Guardião (inicial 100, recebeu 20 com armadura 5): " + guardiaoTeste.getVida() + " (Esperado: 85)");

        // Teste de consultas não alterarem estado
        int danoConsulta = guerreiro.calcularDano();
        System.out.println("Consulta calcularDano() não altera estado. Valor: " + danoConsulta);


        System.out.println("\n=== 2. TESTES DA ARENA E RESTRIÇÕES ===");

        Equipe equipeA = new Equipe("Alpha", 2);
        Equipe equipeB = new Equipe("Beta", 2);

        equipeA.adicionar(guerreiro);
        equipeA.adicionar(mago);

        equipeB.adicionar(arqueiro);
        equipeB.adicionar(guardiao);

        Arena arena = new Arena(equipeA, equipeB);
        System.out.println("Status inicial da Arena: " + arena.resultado() + " (Esperado: EM_ANDAMENTO)");

        // Teste 1: Ataque aliado (Thor tenta atacar Gandalf)
        boolean ataqueAliado = arena.executarTurno(guerreiro, mago);
        System.out.println("Ataque aliado (Thor -> Gandalf): " + ataqueAliado + " (Esperado: false)");

        // Teste 2: Duas jogadas seguidas da mesma equipe (Alpha joga, depois Mago tenta jogar na vez de Beta)
        boolean ataqueValido1 = arena.executarTurno(guerreiro, arqueiro); // Turno A ataca B -> Sucesso, vira turno B
        boolean ataqueDuplicado = arena.executarTurno(mago, guardiao);   // Alpha tenta jogar de novo na vez de Beta -> Falha
        System.out.println("Primeiro ataque válido (Thor -> Legolas): " + ataqueValido1 + " (Esperado: true)");
        System.out.println("Segunda jogada consecutiva da Equipe A: " + ataqueDuplicado + " (Esperado: false)");

        // Teste 3: Ataque contra si mesmo (Agora é turno B, Legolas tenta atacar a si mesmo)
        boolean ataquesi = arena.executarTurno(arqueiro, arqueiro);
        System.out.println("Ataque contra si mesmo (Legolas -> Legolas): " + ataquesi + " (Esperado: false)");

        // Teste 4: Alvo morto (Vamos matar o alvo de teste reduzindo sua vida a 0 e tentar atacá-lo)
        Personagem alvoMorto = new Personagem("Morto", 0, 0, null) {};
        boolean ataqueMorto = arena.executarTurno(arqueiro, alvoMorto);
        System.out.println("Ataque contra alvo morto: " + ataqueMorto + " (Esperado: false)");

        System.out.println("\n--- Teste de Empate e Vitória ---");
        // Simulando zerar os membros para testar Empate
        guerreiro.receberDano(1000);
        mago.receberDano(1000);
        arqueiro.receberDano(1000);
        guardiao.receberDano(1000);
        System.out.println("Resultado com todos mortos: " + arena.resultado() + " (Esperado: EMPATE)");

        // Nova arena para testar vitória de Alpha
        Equipe equipeA2 = new Equipe("Guerreiros de Luz", 1);
        Equipe equipeB2 = new Equipe("Sombras", 1);
        Guerreiro luz = new Guerreiro("Paladino", 100, 50, new Arma("Espada Sagrada", 10, 5), 20);
        Guerreiro sombra = new Guerreiro("Orc", 10, 10, new Arma("Machado", 2, 1), 0);
        equipeA2.adicionar(luz);
        equipeB2.adicionar(sombra);

        Arena arenaVitoria = new Arena(equipeA2, equipeB2);
        arenaVitoria.executarTurno(luz, sombra); // Paladino mata Orc
        System.out.println("Resultado da arena após vitória: " + arenaVitoria.resultado() + " (Esperado: Guerreiros de Luz)");

        System.out.println("\n[Exibição final de Vida e Recursos]");
        System.out.println("Paladino - Vida: " + luz.getVida() + ", Durabilidade Arma: " + luz.getArma().getDurabilidade());
        System.out.println("Orc - Vida: " + sombra.getVida());
    }
}