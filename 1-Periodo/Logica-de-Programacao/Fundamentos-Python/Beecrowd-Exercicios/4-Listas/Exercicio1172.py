# 1172 — Substituição em Vetor I
# Lê 10 valores inteiros e substitui números nulos ou negativos por 1.

x = []

for i in range(10):
    valor = int(input())
    
    if valor <= 0:
        valor = 1
    x.append(valor)
    print(f"X[{i}] = {valor}")