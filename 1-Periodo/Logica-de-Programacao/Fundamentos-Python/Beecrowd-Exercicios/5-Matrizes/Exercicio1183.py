# 1183 — Acima da Diagonal Principal
# Percorre a área triangular superior de uma matriz 12x12, onde o índice da coluna é estritamente maior que o da linha (j > i).

operacao = input().strip()

matriz = []
for _ in range(12):
    linha = [float(input()) for _ in range(12)]
    matriz.append(linha)

soma = 0.0
elementos = 0

for i in range(12):
    for j in range(12):
        if j > i:  # Elementos acima da diagonal principal
            soma += matriz[i][j]
            elementos += 1

resultado = soma if operacao == 'S' else soma / elementos
print(f"{resultado:.1f}")