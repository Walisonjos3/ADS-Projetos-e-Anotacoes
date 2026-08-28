# 1181 - Linha na Matriz

linha_alvo = int(input())
operacao = input().strip()

matriz = []
for _ in range(12):
    linha = [float(input()) for _ in range(12)]
    matriz.append(linha)

soma = sum(matriz[linha_alvo])
resultado = soma if operacao == 'S' else soma / 12.0

print(f"{resultado:.1f}")