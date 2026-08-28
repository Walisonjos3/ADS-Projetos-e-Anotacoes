# 1182 — Coluna na Matriz
# Realiza a soma ou média dos elementos pertencentes a uma coluna específica de uma matriz 12x12.

coluna_alvo = int(input())
operacao = input().strip()

matriz = []
for _ in range(12):
    linha = [float(input()) for _ in range(12)]
    matriz.append(linha)

soma = sum(matriz[i][coluna_alvo] for i in range(12))
resultado = soma if operacao == 'S' else soma / 12.0

print(f"{resultado:.1f}")