print("--- 3. OPERADORES ARITMÉTICOS E LÓGICOS ---")
    
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
