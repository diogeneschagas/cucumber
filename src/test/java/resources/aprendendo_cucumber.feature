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