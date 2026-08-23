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

demonstrar_tratamento_erros()
