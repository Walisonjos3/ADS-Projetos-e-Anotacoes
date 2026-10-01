public class VariaveisETipos {

    public static void main(String[] args) {
        // --- TIPOS PRIMITIVOS ---
        // Inteiros: byte (1B), short (2B), int (4B), long (8B)
        byte idadeByte = 19;
        short ano = 2026;
        int quantidadeAlunos = 150;
        long populacaoMundial = 8000000000L; // Necessita do 'L' no final

        // Decimais / Ponto Flutuante: float (4B), double (8B)
        float nota = 8.5f; // Necessita do 'f' no final
        double peso = 80.2;

        // Caractere e Boolean
        char sexo = 'M'; // Aspas simples para único caractere
        boolean matriculado = true;

        // --- TIPO PARA TEXTO (Classe/Objeto) ---
        String nome = "Walison José"; // Aspas duplas para textos

        // --- TYPECASTING (Conversão de Tipos) ---
        // Implícito (menor para maior):
        double pesoConvertido = quantidadeAlunos;

        // Explícito (Casting - maior para menor):
        double valorPrecisao = 9.78;
        int valorInteiro = (int) valorPrecisao; // Trunca as casas decimais (resultado: 9)
    }
}