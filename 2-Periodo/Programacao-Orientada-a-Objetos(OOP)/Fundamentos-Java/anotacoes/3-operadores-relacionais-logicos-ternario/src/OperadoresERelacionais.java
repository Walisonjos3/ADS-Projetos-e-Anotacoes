public class OperadoresERelacionais {

    public static void main(String[] args) {
        // --- OPERADOR TERNÁRIO ---
        // Estrutura: expressão_condicional ? Valor_se_verdadeiro : valor_se_falso;
        int n1 = 3, n2 = 6;
        int maior = n1 > n2 ? n1 : n2;

        int n3 = 5, n4 = 10;
        int resultado = n3 > n4 ? n3 + n4 : n4 - n3;

        // --- OPERADORES RELACIONAIS ---
        /*
         >   Maior que
         <   Menor que
         >=  Maior ou igual a
         <=  Menor ou igual a
         ==  Igual a (utilizado para tipos primitivos)
         !=  Diferente de
        */

        // Comparação de Objetos e Strings (Utilizar sempre .equals()):
        String nome1 = "Walison";
        String nome3 = new String("Walison");
        String resultadoComparacao = nome1.equals(nome3) ? "Igual" : "Diferente";

        // --- OPERADORES LÓGICOS ---
        /*
         &&  AND  (E)           - Verdadeiro se TODAS as condições forem verdadeiras
         ||  OR   (OU)          - Verdadeiro se PELO MENOS UMA condição for verdadeira
         !   NOT  (NÃO)         - Inverte o estado lógico
         ^   XOR  (OU Exclusivo)- Verdadeiro se APENAS UMA condição for verdadeira, mas não ambas
        */
        int x = 4, y = 7, z = 10;
        boolean r1 = (x < y && y < z); // true
        boolean r2 = (x < y || y > z); // true
        boolean r3 = (x < y ^ y < z);   // false (ambas são verdadeiras)
    }
}