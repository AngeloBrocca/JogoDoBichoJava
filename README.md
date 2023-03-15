# JogoDoBichoJava

## Main
  O código acima é uma implementação simples do jogo "Jogo do Bicho" em Java. Neste jogo, os jogadores apostam em um animal e se o animal escolhido por eles coincidir com o animal que foi sorteado aleatoriamente de um conjunto de animais pré-definidos, eles ganham o jogo. Aqui está como o código funciona:
  
  -Primeiramente, o código importa as classes Scanner e Random.
  
  -Em seguida, um ArrayList de objetos "Bicho" é criado e inicializado com 25 animais, cada um com um nome e uma lista de números associados.
  
  -Depois, um número aleatório entre 0 e 99 é gerado para determinar o número vencedor do jogo.
  
  -O jogador é solicitado a digitar o nome do animal em que eles querem apostar.
  
  -O código itera por cada objeto "Bicho" no ArrayList e verifica se a sua lista associada de números contém o número vencedor. Se sim, o nome do "Bicho" é armazenado como o animal vencedor.
  
  -Finalmente, a aposta do jogador é comparada com o animal vencedor. Se eles coincidirem, o jogador ganha. Caso contrário, o jogador perde. O animal vencedor e o número vencedor são impressos no console.
  
  
## Bicho
O código apresenta a classe "Bicho", que contém um construtor para criar instâncias dessa classe com um nome e um índice. A classe também possui um método chamado "getDz" que retorna um ArrayList de inteiros que representam as dezenas associadas a esse bicho.

O método "getDz" usa o índice atribuído ao bicho para calcular as dezenas associadas a ele. O cálculo é feito multiplicando o índice por 4, e então subtraindo 3, 2, 1 e 0 do resultado para obter as quatro dezenas. Se o resultado do cálculo for igual a 100, então é adicionado o número 0 ao ArrayList, caso contrário é adicionado o próprio resultado do cálculo.

O código utiliza a classe ArrayList da biblioteca padrão do Java para armazenar as dezenas do bicho. A classe ArrayList é uma estrutura de dados que permite armazenar uma coleção de objetos em um único objeto. No caso desse código, a ArrayList é utilizada para armazenar um conjunto de inteiros que representam as dezenas do bicho.
