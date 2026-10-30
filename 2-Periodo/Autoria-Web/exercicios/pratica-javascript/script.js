// Exemplo inicial: Mensagem de boas-vindas
const botaoMensagem = document.querySelector('.botao.mensagem');
const mensagem = document.querySelector('#mensagem');

botaoMensagem.addEventListener('click', () => {
    mensagem.textContent = 'Seja Bem-Vindo ao JavaScript! Gostou ?';
});

// Exemplo 1: Alterar texto da página
const botaoTexto = document.querySelector('.botao.texto');
const novoTexto = document.querySelector('#textoModificado');

botaoTexto.addEventListener('click', () => {
    novoTexto.textContent = 'Parabéns!! Você modificou esse texto com JavaScript!!!';
});

// Exemplo 2: Contador
const botaoSomar = document.querySelector('.botao.especial');
const botaoSubtrair = document.querySelector('.botao.subtrair.especial');
const botaoResetar = document.querySelector('.botao.resetar');
const contadorValor = document.querySelector('#contador');

let contador = 0;

botaoSomar.addEventListener('click', () => {
    contador++;
    contadorValor.textContent = contador;
});

botaoSubtrair.addEventListener('click', () => {
    contador--;
    if (contador < 0) {
        contador = 0;
    }
    contadorValor.textContent = contador;
});

botaoResetar.addEventListener('click', () => {
    contador = 0;
    contadorValor.textContent = contador;
});

// Exemplo 3: Entrada do usuário (Saudação)
const botaoSaudar = document.querySelector('.botao.saudar');
const inputNome = document.querySelector('#inputNome');
const mensagemSaudacao = document.querySelector('#mensagemSaudacao');

botaoSaudar.addEventListener('click', () => {
    const nome = inputNome.value.trim();
    if (nome !== "") {
        mensagemSaudacao.textContent = `Olá, ${nome}! Seja muito bem-vindo(a)!`;
    } else {
        mensagemSaudacao.textContent = "Por favor, digite seu nome primeiro!";
    }
});

// Exemplo 4: Manipulação de Classe CSS
const botaoClasse = document.querySelector('.botao.classe');
const cardClasse = document.querySelector('#cardClasse');

botaoClasse.addEventListener('click', () => {
    // Alterna (adiciona se não tiver, remove se já tiver) a classe de destaque no card
    cardClasse.classList.toggle('destaque-ativo');
});

// Funcionalidade: Alterar Tema (Dark Mode / Light Mode)
const botaoTema = document.querySelector('.botao.tema');
const corpoBody = document.body;

botaoTema.addEventListener('click', () => {
    // Alterna a classe 'tema-escuro' no body
    corpoBody.classList.toggle('tema-escuro');

    // Opcional: Mudar o texto do botão dependendo do tema atual
    if (corpoBody.classList.contains('tema-escuro')) {
        botaoTema.textContent = 'Tema Claro';
    } else {
        botaoTema.textContent = 'Alterar tema';
    }
});