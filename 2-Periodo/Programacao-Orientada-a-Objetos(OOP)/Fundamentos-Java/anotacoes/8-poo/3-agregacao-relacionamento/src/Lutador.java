public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso,
                   int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso); // Utiliza o setter para calcular automaticamente a categoria
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.peso < 55.0) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.0) {
            this.categoria = "Leve";
        } else if (this.peso <= 85.0) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.0) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public void ganharLuta() {
        this.vitorias++;
    }

    public void perderLuta() {
        this.derrotas++;
    }

    public void empatarLuta() {
        this.empates++;
    }

    public void apresentar() {
        System.out.println("----------------------------------");
        System.out.printf("Lutador: %s | Categoria: %s | Peso: %.2fKg%n", getNome(), getCategoria(), peso);
    }
}