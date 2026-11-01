const botaoMensagem = document.querySelector('.botao.mensagem');
const mensagem = document.querySelector('#mensagem');

botaoMensagem.addEventListener('click', () => {
    mensagem.textContent = 'Seja Bem-Vindo ao JavaScript! Gostou ?';
});

const botaoTexto = document.querySelector('.botao.texto');
const novoTexto = document.querySelector('#textoModificado');

botaoTexto.addEventListener('click', () => {
    novoTexto.textContent = 'Parabéns!! Você modificou esse texto com JavaScript!!!';
});

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
})

const botaoSaudacao = document.querySelector('.botao.saudar');
const inputNome = document.querySelector('#inputNome');
const mensagemSaudacao = document.querySelector('#saidaSaudacao');

botaoSaudacao.addEventListener('click', () => {
    const nome = inputNome.value.trim(); // Esse trim é igual ao strip do Python ?
    if (nome !== "") {
        mensagemSaudacao.textContent = `Olá, ${nome}! Seja muitpo bem-vindo(a) ao JavaScript.`
    } else {
        mensagemSaudacao.textContent = "Por favor, digite seu nome!"
    }
});

const corpoBody = document.body; // Isso recebe o que tem no body?
const cardClasse = document.querySelector('#cardClasse');
const botaoClasse = document.querySelector('.botao.classe');
const botaoTema = document.querySelector('.botao.tema');

botaoTema.addEventListener('click', () => {
    corpoBody.classList.toggle('temaEscuro') //O que seria esse toggle ?? Minha professora falou mais não estendi muito bem.

});

botaoClasse.addEventListener('click', () => {
    
    if (corpoBody.classList.contains('temaEscuro')) { // Esse contains seria para verificar o valor que tem dentro dele, certo ?
        cardClasse.classList.toggle('destaqueAtivoTema');
    } else {
        cardClasse.classList.toggle('destaqueAtivo');
    }

});



