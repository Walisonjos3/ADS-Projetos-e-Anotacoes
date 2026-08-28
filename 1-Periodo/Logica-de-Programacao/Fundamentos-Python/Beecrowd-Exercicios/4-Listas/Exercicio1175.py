# 1175 — Troca em Vetor I
# Armazena 20 elementos em uma lista e inverte suas posições sem utilizar sort().

n = [int(input()) for _ in range(20)]
n.reverse()

for i in range(20):
    print(f"N[{i}] = {n[i]}")