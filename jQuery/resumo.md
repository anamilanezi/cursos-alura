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

## Identificando eventos e texto inserido em um input

A função `on()` do jQuery, recebe como parâmetro dois argumentos: O primeiro sendo uma string com o nome do evento que ela vai passar a escutar e o segundo uma função, com a ação (função) que ela deve executar quando o evento acontecer. O nome do evento são os nomes do eventos comuns do Javascript, como de `click`, `input`, `focus`, `dblclick` entre outros. Se quisermos por exemplo, ao digitar em um campo de `<textarea>` identificar qual o texto inserido dentro dela, contar as palavras e caracteres, podemos:
- Após atribuir o campo de texto a uma variável utilizando sua classe, usar a função .on(), usar "input" para reconhecer o evento de digitar no campo, e chamar uma função;
- Dentro da função atribuímos `campo.val()` a uma variável que vai identificar o valor digitado;
- No exemplo ainda alteramos no HTML a contagem de palavras e caracteres de acordo com o que o usuário digita.
```swift
// HTML
<textarea class="campo-digitacao" id="" cols="30" rows="10"></textarea>
<ul>
    <li><span id="contador-caracteres">0</span> caracteres</li>
    <li><span id="contador-palavras">0</span> palavras</li>
</ul>
```

```swift
//SCRIPT
var campo = $(".campo-digitacao");

campo.on("input", function() {
    var conteudo = campo.val();
    var qtePalavras = conteudo.split(" ").length;
    $("#contador-palavras").text(qtePalavras);
    
    var qteCaracteres = conteudo.length;
    $('#contador-caracteres').text(qteCaracteres);
})
```

Ambas as funções `.val()` e `.text()` podem manipular os valores de texto dos elementos, mas a .val() funciona em elementos de `<input>` que são campos aonde o usuário do site insere dados , como os campos de `<input>` (todos os tipos), `<textarea>` e `<select>`.

Já a função `.text()` pega o conteúdo de texto de tags HTML que tem texto dentro, como as `<h1>`, `<span>` e `<p>`

Ambas as funções podem atribuir novos valores a determinados elementos, ou apenas pegar os valores deles.

## Função `.one()`

A função `.one`() funciona de modo semelhante a função `.on()`, ambas podem ser utilizadas em qualquer elemento, recebem qualquer evento como primeiro parâmetro e uma função anônima ou uma função nomeada como segundo parâmetro.

A diferença entre elas é na hora de escutar os eventos, a função .one() escuta o evento apenas uma única vez, diferentemente da função on(), que como já vimos fica escutando o evento em um elemento do HTML por tempo ilimitado.

## Função `.click()`

A função `.click()` é uma função de atalho para a função `.on("click", ...)` . Ela tem o mesmo comportamento, apenas sendo um jeito mais curto e rápido de escrever a função.

Os eventos mais comuns do jQuery possuem funções de atalho ( ou shorthand functions, como na documentação) , por exemplo as funções `.blur`, `.focus`, `.change`, `.dblclick` ...etc. Todos eles equivalem a chamada da função `on()` passando-os como parâmetro, e existem no jQuery apenas para facilitar a vida do desenvolvedor. As funções de atalho, assim como a função on devem receber uma função como parâmetro, que indica qual ação elas devem executar ao ouvirem o evento.

## Função `.attr()` e `.removeAttr()`

O método `.attr()` em jQuery é usado para definir ou retornar os atributos e valores dos elementos selecionados.

PARÂMETROS: 

**Atributo**: este parâmetro é usado para especificar o nome do atributo;

**Valor**: é usado para especificar o valor do atributo;

- Para retornar o valor de um atributo:
```swift
$(seletor).attr (atributo)
```
- Para definir o atributo e valor:
```swift
$(seletor).attr (atributo, valor)
```
- Para definir vários atributos e valores:
```swift
$(seletor).attr ({attribute: value, attribute: value, ...})
```

A função `.attr()` vai se comportar como uma outra função do jQuery, a `.removeAttr()`, que tem como objetivo remover atributos de elementos.

## Função .css(), .addClass(), removeClass() e toggleClass()

Podemos alterar o CSS de um elemento utilizando a função `.css()` do jQuery, passando por parâmetro a propriedade CSS queremos modificar e o seu valor, separados por vírgula. Também podemos obter o valor de uma propriedade específica utilizando somente ela como parâmetro.

```swift
// Retorna o valor da propriedade
$("p").css("background-color");

// Altera o valor da propriedade
$("p").css("background-color", "yellow");
$("p").css({"background-color": "yellow", "font-size": "200%"});
```

No entanto, sabemos que não é recomendado alterar as propriedades de estilo dentro de JavaScript, e sim no CSS. Por isso, uma forma melhor de realizar o mesmo processo, é adicionar uma classe ao elemento no HTML com `.addClass()`, e definir o estilo no arquivo  `.css` que será aplicado assim que a classe for adicionada. Da mesma forma, uma classe pode ser removida utilizando o `.removeClass()`

```swift
// CSS
.important {
  font-weight: bold;
  font-size: xx-large;
}

.blue {
  color: blue;
}

// JS
$("button").click(function(){
  $("h1, h2, p").addClass("blue");
  $("div").removeClass("important");
});
```

A função `.toggleClass()` por sua vez, faz a alternância entre adicionar e remover a classe especificada, dependendo do estado atual. Ela também pode receber um segundo parâmetro que define se quisermos adicionar (`true`) ou remover (`false`) a classe:

```swift
$("button").click(function(){
  $("div").toggleClass("blue");
  $("p").toggleClass("yellow", true);
});
```

## .find()

Quando queremos buscar filhos de um elemento, podemos utilizar a função `.find()` do jQuery, que funciona de modo semelhante a função seletora ($), porém fazendo a busca apenas do filho do elemento. A função recebe como parâmetro seletores CSS e busca em seus filhos algum elemento que atenda aquela busca. 

```swift
var corpoTabela = $(".nomeDaClasse").find("tbody");
```

## .append() e .prepend()

A função `.append()` insere o conteúdo, especificado pelo parâmetro, no final de cada elemento no conjunto de elementos correspondentes. Já `prepend()` insere o conteúdo especificado no início dos elementos selecionados.

```swift
// HTML ANTES

<h2>Greetings</h2>
<div class="container">
  <div class="inner">Hello</div>
  <div class="inner">Goodbye</div>
</div>
```
```Swift
// JS
$( ".inner" ).append( "<p>Test</p>" );

// HTML DEPOIS
<h2>Greetings</h2>
<div class="container">
  <div class="inner">
    Hello
    <p>Test</p>
  </div>
  <div class="inner">
    Goodbye
    <p>Test</p>
  </div>
</div>
```

## Criar um novo elemento HTML (DOM) pelo jQuery

Para criarmos elementos do DOM com jQuery, devemos utilizar a própria função jQuery ($) , mas em vez de passarmos um id, classe, ou nome de um elemento para ela buscar, devemos passar uma tag HTML completa( com os sinais < e >), deste modo:

```swift
var itemDaLista = $("<li>");
```