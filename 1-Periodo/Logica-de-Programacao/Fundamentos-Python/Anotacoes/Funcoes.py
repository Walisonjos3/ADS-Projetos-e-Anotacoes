def calcular_media(*notas: float) -> float:
    """Função utilitária que calcula a média de N notas recebidas."""
    soma = 0

    if not notas:
        return 0.0
    else:
        for nota in notas:
            soma += nota

        return soma / len(notas)


def demonstrar_funcoes():
    print("\n--- 7. FUNÇÕES ---")
    
    media_final = calcular_media(8.5, 9.0, 7.5)
    print(f"Média calculada via função: {media_final:.2f}")

demonstrar_funcoes()
