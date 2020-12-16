Feature: Alugar filme
  Como um usuario
  Eu quero cadastrar alugueis de vestidos
  Para controlar precos e datas de entrega

Scenario: Deve alugar um filme com sucesso
  Given um filme com estoque de 2 unidades
  And que o preco de aluguel seja R$ 3
  When alugar
  Then o preco do aluguel sera R$ 3
  And a data de entrega sera no dia seguinte
  And o estoque do filme sera 1 unidade

Scenario: Nao deve alugar um filme sem estoque
  Given um filme com estoque de 0 unidades
  When alugar
  Then nao sera possivel por falta de estoque
  And o estoque do filme sera 0 unidade
#
#Scenario: Deve dar condicoes especiais para categoria estendida
#  Given um filme com estoque de 2 unidades
#  And que o preco de aluguel seja R$ 4
#  And que o tipo de aluguel seja estendido
#  When alugar
#  Then o preco do aluguel sera R$ 8
#  And a data de entrega sera de 3 dias
#  And a pontuacao recebida sera de 2 pontos