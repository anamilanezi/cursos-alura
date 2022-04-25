# Curso jQuery: domine a biblioteca mais popular do mercado.

<p align="justify">O JavaScript é utilizado para intermediar a interatividade entre o usuário e a estrutura de HTML e CSS, no entanto, nem todo script funciona com todos os navegadores/dispostivos disponíveis. Isso se dá em função de diferenças internas dos browsers, como API do DOM, como ele trabalha com eventos, qual o interpretador de JS dele.</p>

O jQuery é uma biblioteca de funções JavaScript que funciona como um "tradutor", que recebe o código JS e o adapta para ter suporte todos os navegadores. Além de ajudar com a **compatibilidade**, ele ajuda na **produtividade** do desenvolvimento. Exemplo:

```swift
// Código JS:
var paragrafos = document.querySelectorAll('p');
for(var i = 0; i < paragrafos.length; i++) {
    paragrafos[i].textContext = "novo texto";
}

// Código jQ:
$('p').text('novo texto');

```

Existem disponíveis as versões de **produção** e de **desenvolvimento** do jQuery. A versão de produção tem um tamanho reduzido através da remoção de comentários, nomes de variáveis menores, dentre outras técnicas que fazem com que ela tenha 30% do peso da versão de desenvolvimento. Por esse motivo, essa é a versão disponibilizada na versão final para o usuário. No desenvolvimento deve-se priorizar a outra versão,  pois podemos ver como uma determinada função do jQuery foi implementada e fica mais fácil debuggar em caso de necessidade.

A biblioteca jQuery deve ser inserida dentro da pasta do projeto e referenciada no HTML **antes** do script que será desenvolvido para nossa página. É possível verificar se o arquivo foi corretamente importando utilizando DevTools na aba "Sources"

```swift
// Ordem de importação
<script src="js/jquery.js"></script>
<script src="js/main.js"></script>
```

### ✅ Selecionando um elemento do HTML utilizando jQuery

 A função seletora do jQuery, que leva o próprio nome da framework, é responsável por selecionar no mundo jQuery. Dentro dessa função, passamos um seletor CSS - sinal gráfico `.` - que retorna o `objeto` desejado. Por exemplo, se queremos o elemento que contém a classe `frase`, podemos salvar essa função em uma variável que chamaremos de frase e depois verificá-la utilizando `console.log(frase)`.

```swift
// HTML
<p class="frase">Essa frase tem cinco palavras.</p>
var frase = jQuery(".frase");
console.log(frase);

// [p.frase, prevObject:  jQuery.fn.init[1]]
// Retorna um objeto jQuery que contém o conteúdo com frase
```

O símbolo `$` pode ser utilizado como um atalho para a função jQuery, sendo a forma mais utilizada. Para então selecionar o texto contido na classe `frase` do HTML, utiliza-se a função `.text()` do jQuery:
 ```swift
var frase = $(".frase").text();
console.log(frase);
```

Para selecionar uma porção específica dentro do texto, no HTML pode-se usar uma tag `<span>` envolvendo por exemplo, a palavra de interesse, com um id que será utilizado na função jQuery. Além disso, o conteúdo dessa span pode ser alterado diretamente como parâmetro em `.text()`. A função `.text()` tem esta dupla função, nos _retornar_ o valor textual do elemento caso seja chamada sem parâmetro ou _alterar_ o valor de texto do elemento caso seja chamada com uma string como parâmetro.

```swift
// HTML:
<p> Total de palavras: <span id="tamanho-frase">5</span> palavras </p>

// script:
var numeroDePalavras = frase.split(" ").length;
var tamanhoFrase = $('#tamanho-frase');
tamanhoFrase.text(numeroDePalavras);
```