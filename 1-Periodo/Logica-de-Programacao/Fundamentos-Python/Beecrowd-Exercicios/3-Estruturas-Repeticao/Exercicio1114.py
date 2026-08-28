# 1114 — Senha Fixa
# Uso de laço while indeterminado interrompido quando a condição é atendida.

while True:
    senha = input()
    if senha == "2002":
        print("Acesso Permitido")
        break
    print("Senha Invalida")