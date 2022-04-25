// Função jQuery() = $()
var frase = $(".frase").text();

// Para contar as palavras:
// Split separa a string utilizando o espaçi " " como ponto de corte, criando um array com as palavras, e .length conta os elementos do array criado
var numeroDePalavras = frase.split(" ").length;

var tamanhoFrase = $("#tamanho-frase");
tamanhoFrase.text(numeroDePalavras);

// Para identificar um evento de clique, utilizamos .on(evento, ação)
var campo = $(".campo-digitacao");

campo.on("input", function() {
    var conteudo = campo.val();
    var qtePalavras = conteudo.split(/\S+/).length - 1;
    $("#contador-palavras").text(qtePalavras);
    
    var qteCaracteres = conteudo.length;
    $('#contador-caracteres').text(qteCaracteres);
})

// conteudo.split(/\S+/).length - 1 utiliza expressão regular no lugar de " " para buscar espaços vazios, corrigindo o erro de contagem de palavras