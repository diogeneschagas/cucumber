Feature: Subindo o nível das práticas
  Como um aluno
  Eu quero evoluir no uso do Cucumber
  Para automatizar criterios de aceitacao reaproveitando alguns cenarios

Scenario: Deve criar steps genericos para estes passos
  Given que o ticket eh "AF345"
  And que o valor da passagem eh R$ 230,45
  And que o nome do passageiro eh "Fulano da Silva"
  And que o telefone do passageiro eh 9999-9999
  When criar os steps
  Then o teste vai funcionar

Scenario: Deve reaproveitar os steps "Dado" do cenario anterior
  Given que o ticket eh "AB167"
#  Given que o ticket especial eh "AB167"
  Given que o valor da passagem eh R$ 1120,23
  Given que o nome do passageiro eh "Cicrano de Oliveira"
  Given que o telefone do passageiro eh 9888-8888

#Scenario: Deve negar todos os steps "Given" dos cenarios anteriores
#  Given que o ticket eh "CD123"
#  Given que o ticket eh "AG1234"
#  Given que o valor da passagem eh R$ 1.1345,56
#  Given que o nome do passageiro eh "Beltrano Souza Matos de Alcântara Azevedo"
#  Given que o telefone do passageiro eh 1234-5678
#  Given que o telefone do passageiro eh 999-2223