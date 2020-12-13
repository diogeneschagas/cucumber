Feature: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar o Cucumber
  Para automatizar criterios de aceitacao

Scenario: Deve executar a especificacao
  Given que criei o arquivo corretamente
  When executar
  Then a especificacao deve finalizar com sucesso
  Then passo enxerido

Scenario: Deve incrementar contador
  Given que o valor do contador eh 15
  When eu incrementar em 3
  Then o valor do contador sera 18

Scenario: Deve incrementar contador
  Given que o valor do contador eh 200
  When eu incrementar em 50
  Then o valor do contador sera 250


Scenario: Deve calcular atraso na entrega
  Given que a entrega eh dia 05/10/2020
  When a atrasar em 2 dias
  Then a entrega sera efetuada em 07/04/2018