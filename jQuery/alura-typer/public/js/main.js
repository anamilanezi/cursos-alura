// Função jQuery() = $()
var frase = $(".frase").text();

// Para contar as palavras:
// Split separa a string utilizando o espaçi " " como ponto de corte, criando um array com as palavras, e .length conta os elementos do array criado
var numeroDePalavras = frase.split(" ").length;


var tamanhoFrase = $("#tamanho-frase");
tamanhoFrase.text(numeroDePalavras);