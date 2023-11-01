# Index

### Exercício 1  [:file_folder:](https://github.com/beatrizopdd/UFF_ProgOrientada/tree/master/src/main/java/uff/ic/lleme/tcc00328/exercicios/BeatrizPiedade/Exercicio01)

1) Escreva uma função em Java para criar um arquivo com uma quantidade N de números aleatórios entre 0 e 99, onde N é um valor informado como parâmetro.
2) Escreva uma função em Java para calcular um histograma dos números gerados no item anterior
3) O programa principal deverá usar as duas funções acima

### Exercício 2  [:file_folder:](https://github.com/beatrizopdd/UFF_ProgOrientada/tree/master/src/main/java/uff/ic/lleme/tcc00328/exercicios/BeatrizPiedade/Exercicio02)

Muitas aplicações precisam organizar informações na forma de tabelas, e matrizes são naturalmente estruturas de dados adequadas para representação de tabelas.

Para exemplificar, vamos considerar uma tabela de um campeonato de futebol. Uma tabela deste tipo e ilustrada a seguir, onde cada linha armazena as informações de um determinado time do campeonato: número de pontos ganhos (PG), numero de jogos (J), numero de vitorias (V), saldo de gols (SG) e gols próprios (GP).

| Time   | PG | J | V | SG | GP |
| ------ | -- | - | - | -- | -- |
| Time 0 | 10 | 8 | 3 | -4 | 12 |
| Time 1 | 17 | 8 | 5 | 10 | 19 |
| Time 2 | 10 | 8 | 3 | -5 | 11 |
| Time 3 | 11 | 8 | 3 | -1 | 15 |
| Time 4 | 19 | 8 | 6 | 13 | 23 |

gerando a matriz

| | | | | |
| -- | - | - | -- | -- |
| 10 | 8 | 3 | -4 | 12 |
| 17 | 8 | 5 | 10 | 19 |
| 10 | 8 | 3 | -5 | 11 |
| 11 | 8 | 3 | -1 | 15 |
| 19 | 8 | 6 | 13 | 23 |

Para o código ficar mais legível, podemos definir constantes simbólicas como: PG= 0; J = 1; V = 2; SG = 3; GC = 4

Um critério normalmente utilizado para classificação dos times é: número de pontos ganhos, número de vitórias, saldo de gols e, finalmente, número de gols próprios. Assim, o líder do campeonato é o time que tem o maior número de pontos; se dois times tem o mesmo número de pontos, usa-se o maior número de vitórias como critério de desempate; se o número de vitórias também for igual, usa-se o saldo de gols; por fim, usa-se o número de gols próprios.

> Escreva um programa Java que retorne o número do time que é líder. Deverá haver uma função que recebe como parâmetros o número de times e a matriz representando a tabela do campeonato e retorna o número do time que é líder.

### Exercício 3  [:file_folder:](https://github.com/beatrizopdd/UFF_ProgOrientada/tree/master/src/main/java/uff/ic/lleme/tcc00328/exercicios/BeatrizPiedade/Exercicio03)

> Escreva um programa em Java que simule um jogo de dados.

Lançamento inicial:
- Se o lançador tirar um 7 ou 11 no primeiro lançamento, vence o jogo.
- Se os dados somarem 2, 3 ou 12, o jogador perde o jogo.
- Qualquer outro número que saia no lançamento inicial (4, 5, 6, 8, 9, ou 10) se torna o seu “Ponto”.

Os lançamentos continuam até que:
- O Ponto sair antes de um 7, e assim o jogador vence.
- O 7 sair antes do Ponto, e assim o jogador perde.

### Exercício 4  [:file_folder:](https://github.com/beatrizopdd/UFF_ProgOrientada/tree/master/src/main/java/uff/ic/lleme/tcc00328/exercicios/BeatrizPiedade/Exercicio04)

> Refazer o jogo de dados orientado a objetos

### Exercício 5  [:file_folder:](https://github.com/beatrizopdd/UFF_ProgOrientada/tree/master/src/main/java/uff/ic/lleme/tcc00328/exercicios/BeatrizPiedade/Exercicio05)

> Implementação do blog

- Um blog tem um título e uma data de criação e além disso é um conjunto de conteúdos.
- Estes conteúdos (mensagens) podem ser notas ou comentários sobre as notas. Tanto notas quanto comentários têm características comuns como o texto e a data de sua criação.
- Todo usuário possui: E-mail (deve ser único, ou seja, não há mais de um usuário com o mesmo e-mail)
- Permitir a criação de blogs
- Permitir a utilização de blogs: qualquer usuário pode ler conteúdos; somente o dono do blog pode criar notas; somente usuários que marcam o Blog como favorito pode criar comentários; para criar um comentário o usuários precisa ler as notas; somente o dono do blog pode remover conteúdos; para remover um conteúdo ele precisará ler o conteúdo; caso ele remova um comentário, o autor do comentário deve ser notificado por e-mail.
