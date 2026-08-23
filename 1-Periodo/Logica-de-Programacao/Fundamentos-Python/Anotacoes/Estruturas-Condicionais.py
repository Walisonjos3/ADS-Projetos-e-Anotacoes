print("--- 4. ESTRUTURAS CONDICIONAIS ---")

nota = 7.5

print(f"Avaliando nota: {nota}")
if nota >= 7.0:
    status = "Aprovado(a) diretamente!"
elif nota >= 5.0:
    status = "Em recuperação."
else:
    status = "Reprovado(a)."
        
print(f"Resultado: {status}")
