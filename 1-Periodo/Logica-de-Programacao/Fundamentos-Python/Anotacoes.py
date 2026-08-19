"""
====================================================================
 🐍 FUNDAMENTOS DE PYTHON: DO ZERO AO TRATAMENTO DE ERROS
====================================================================
 Repositório: Análise e Desenvolvimento de Sistemas (ADS)
 Descrição:   Script prático contendo revisão completa da sintaxe básica,
              estruturas de controle, coleções, funções e exceções.
====================================================================
"""

def demonstrar_print_e_input():
    print("\n--- 1. PRIMEIROS PASSOS E ENTRADA/SAÍDA ---")
    
    # Exibição simples
    print("Olá, mundo! Este é um exemplo de saída simples.")
    
    # Formatação moderna com f-strings
    nome_curso = "Análise e Desenvolvimento de Sistemas"
    periodo = 2
    print(f"Curso: {nome_curso} | Período: {periodo}º")
    
    # Conversão de tipos (Casting) na leitura de dados
    # Descomente as linhas abaixo caso queira testar a entrada via terminal:
    # idade = int(input("Digite sua idade: "))
    # print(f"Você tem {idade} anos.")


def demonstrar_variaveis_e_tipos():
    print("\n--- 2. VARIÁVEIS E TIPOS PRIMITIVOS ---")
    
    # Declarando variáveis
    nome: str = "Walison"      # String
    idade: int = 18            # Inteiro
    coeficiente: float = 8.75  # Decimal (Float)
    matriculado: bool = True   # Booleano
    
    # Verificando tipos com a função type()
    print(f"Variável 'nome' ({nome}): {type(nome)}")
    print(f"Variável 'idade' ({idade}): {type(idade)}")
    print(f"Variável 'coeficiente' ({coeficiente}): {type(coeficiente)}")
    print(f"Variável 'matriculado' ({matriculado}): {type(matriculado)}")


def demonstrar_operadores():
    print("\n--- 3. OPERADORES ARITMÉTICOS E LÓGICOS ---")
    
    a, b = 10, 3
    print(f"Operações com a={a} e b={b}:")
    print(f"  • Soma (a + b): {a + b}")
    print(f"  • Subtração (a - b): {a - b}")
    print(f"  • Multiplicação (a * b): {a * b}")
    print(f"  • Divisão Float (a / b): {a / b:.2f}")
    print(f"  • Divisão Inteira (a // b): {a // b}")
    print(f"  • Módulo / Resto (a % b): {a % b}")
    print(f"  • Potenciação (a ** b): {a ** b}")
    
    # Operadores Lógicos e Comparação
    print("\nLógica booleana:")
    print(f"  • {a} é maior que {b}? {a > b}")
    print(f"  • ({a} > 5) e ({b} < 2)? {(a > 5) and (b < 2)}")
    print(f"  • ({a} > 5) ou ({b} < 2)? {(a > 5) or (b < 2)}")


def demonstrar_condicionais(nota: float = 7.5):
    print("\n--- 4. ESTRUTURAS CONDICIONAIS ---")
    
    print(f"Avaliando nota: {nota}")
    if nota >= 7.0:
        status = "Aprovado(a) diretamente!"
    elif nota >= 5.0:
        status = "Em recuperação."
    else:
        status = "Reprovado(a)."
        
    print(f"Resultado: {status}")


def demonstrar_lacos_repeticao():
    print("\n--- 5. ESTRUTURAS DE REPETIÇÃO ---")
    
    # Laço FOR com range
    print("Contagem com 'for' (range 1 a 4):")
    for i in range(1, 5):
        print(f"  -> Passo {i}")
        
    # Laço WHILE
    print("\nContagem regressiva com 'while':")
    contador = 3
    while contador > 0:
        print(f"  -> {contador}...")
        contador -= 1
    print("  -> Decolar! 🚀")


def demonstrar_colecoes():
    print("\n--- 6. COLEÇÕES (ESTRUTURAS DE DADOS) ---")
    
    # Lista (Mutável)
    linguagens = ["Python", "C", "Java"]
    linguagens.append("SQL")
    print(f"Lista de Linguagens: {linguagens}")
    print(f"Primeiro elemento: {linguagens[0]}")
    
    # Tupla (Imutável)
    coordenadas = (-6.98, -37.27)
    print(f"Tupla de Coordenadas: {coordenadas}")
    
    # Dicionário (Chave-Valor)
    aluno = {
        "nome": "Walison",
        "curso": "ADS",
        "semestre": 2
    }
    print(f"Dicionário Aluno: {aluno}")
    print(f"Valor da chave 'curso': {aluno['curso']}")


def calcular_media(*notas: float) -> float:
    """Função utilitária que calcula a média de N notas recebidas."""
    if not notas:
        return 0.0
    return sum(notas) / len(notas)


def demonstrar_funcoes():
    print("\n--- 7. FUNÇÕES ---")
    
    media_final = calcular_media(8.5, 9.0, 7.5)
    print(f"Média calculada via função: {media_final:.2f}")


def demonstrar_tratamento_erros():
    print("\n--- 8. TRATAMENTO DE ERROS (TRY / EXCEPT) ---")
    
    def dividir_numeros(x: float, y: float):
        try:
            resultado = x / y
        except ZeroDivisionError:
            print(f"  [ERRO] Impossível dividir {x} por zero!")
        except TypeError as err:
            print(f"  [ERRO] Tipo de dado inválido fornecido: {err}")
        else:
            print(f"  [SUCESSO] {x} / {y} = {resultado}")
        finally:
            print("  [FINALLY] Operação finalizada com segurança.")

    print("Teste 1 (Divisão Válida):")
    dividir_numeros(10, 2)
    
    print("\nTeste 2 (Divisão por Zero):")
    dividir_numeros(10, 0)


def main():
    """Função principal que orquestra a execução de todos os módulos."""
    print("=" * 60)
    print("   REVISÃO DE PYTHON - ANÁLISE E DESENVOLVIMENTO DE SISTEMAS")
    print("=" * 60)
    
    demonstrar_print_e_input()
    demonstrar_variaveis_e_tipos()
    demonstrar_operadores()
    demonstrar_condicionais(nota=8.2)
    demonstrar_lacos_repeticao()
    demonstrar_colecoes()
    demonstrar_funcoes()
    demonstrar_tratamento_erros()
    
    print("\n" + "=" * 60)
    print("   FIM DA DEMONSTRAÇÃO - CÓDIGO PRONTO PARA O GITHUB! 🚀")
    print("=" * 60)


if __name__ == "__main__":
    main()
