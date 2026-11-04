public class Arena {

    private Equipe equipeA;
    private Equipe equipeB;
    private boolean turnoA;

    public Arena(Equipe equipeA, Equipe equipeB) {
        if (!verificarEquipes(equipeA, equipeB)) {
            return;
        }
        this.equipeA = equipeA;
        this.equipeB = equipeB;
        this.turnoA = true;
    }

    public boolean executarTurno(Personagem atacante, Personagem alvo) {
        if (this.getEquipeA() == null || this.getEquipeB() == null) {
            return false;
        }

        if (!resultado().equals("EM_ANDAMENTO")) {
            return false;
        }

        if (this.isTurnoA()) {
            if (!this.getEquipeA().contem(atacante) || !this.getEquipeB().contem(alvo)) {
                return false;
            }
        } else {
            if (!this.getEquipeB().contem(atacante) || !this.getEquipeA().contem(alvo)) {
                return false;
            }
        }

        boolean sucesso = atacante.atacarAlvo(alvo);

        if (sucesso) {
            this.turnoA = !this.isTurnoA();
        }

        return sucesso;
    }

    public boolean verificarEquipes(Equipe equipeA, Equipe equipeB) {
        if (equipeA == null || equipeB == null) {
            return false;
        }

        if (equipeA.getQuantidade() == 0 || equipeB.getQuantidade() == 0) {
            return false;
        }

        if (equipeA.getNome() == null || equipeA.getNome().equals(equipeB.getNome())) {
            return false;
        }

        for (Personagem personagem : equipeB.getMembros()) {
            if (personagem != null && equipeA.contem(personagem)) {
                return false;
            }
        }

        return true;
    }

    public String resultado() {
        if (this.getEquipeA() == null || this.getEquipeB() == null) {
            return "INVALIDA";
        }

        boolean vivosA = this.getEquipeA().temVivo();
        boolean vivosB = this.getEquipeB().temVivo();

        if (vivosA && vivosB) {
            return "EM_ANDAMENTO";
        } else if (!vivosA && !vivosB) {
            return "EMPATE";
        } else if (vivosA) {
            return this.getEquipeA().getNome();
        } else {
            return this.getEquipeB().getNome();
        }
    }

    public Equipe getEquipeA() {
        return this.equipeA;
    }

    public Equipe getEquipeB() {
        return equipeB;
    }

    public boolean isTurnoA() {
        return turnoA;
    }
}