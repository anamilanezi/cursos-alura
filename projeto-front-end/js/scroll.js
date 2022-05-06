$('.scrollTo').click(function() {
    var linkElemento = $(this).attr('href');
    if ($(linkElemento).length) { // verifica se elemento existe
        var posicaoElemento = $(linkElemento).offset().top;
        $('html,body').animate({
            scrollTop: posicaoElemento
        }, 1000);
    }
    return false;
})