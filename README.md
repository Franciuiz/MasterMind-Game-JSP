# MasterMind-Game-JSP

Exercício da Cadeira Programação Servidor em Sistemas Web Ministrada por Aliandro Lima.

5º Periodo de ADS - de 02/2015 à 07/2015.

JSP + Apache Tomcat 8.0


Basicamente, a aplicação sorteia um número composto por quatro dígitos. O objetivo é acertar o numero sorteado atravez das respostas "Otimo, Bom e Ruim", sendo um dígito ótimo aquele que encontra-se na posição exata em relação ao número secreto e um dígito bom aquele que está presente no número secreto, mas não na posição correta e um dígito ruim aquele que não encontra-se presente no numero sorteado.
Ao realizar um palpite, o jogador recebe como resultado apenas a quantidade de números bons e ótimos, ou seja, o resultado do palpite não mostra quais são os números bons e ótimos de seu palpite.


Abaixo, seguem alguns exemplos de palpites e resultados para o número secreto "1234".


Palpite: 1 5 9 2; Avaliação da jogada: ( 1 Otimo - 1 Bom - 2 Ruins ).

Palpite: 0 8 9 6; Avaliação da jogada: ( 0 Otimo - 0 Bom - 4 Ruins ).

Palpite: 6 2 3 9; Avaliação da jogada: ( 2 Otimo - 0 Bom - 2 Ruins ).

Palpite: 9 8 4 2; Avaliação da jogada: ( 0 Otimo - 2 Bom - 2 Ruins ).

Palpite: 1 2 0 4; Avaliação da jogada: ( 3 Otimo - 0 Bom - 1 Ruim  ).

Palpite: 1 3 2 4; Avaliação da jogada: ( 2 Otimo - 2 Bom - 0 Ruim  ).

Palpite: 1 2 3 4; Avaliação da jogada: ( 4 Otimo - 0 Bom - 0 Ruim - Jogo Terminado).
