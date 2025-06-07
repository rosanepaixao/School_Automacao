Feature: DemoRequestForm

  Scenario: Usuário acessa a página de demonstração e verifica o título e o subtítulo
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When o usuário verifica o título
    And o subtítulo da página
    Then o usuário deve ver Demonstration no título
    And o usuário deve ver Test drive online the demo product available with complete features no subtítulo

  Scenario: Validar campos First Name obrigatorio
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When visualizar o campo First Name
    And não preenche o campo First Name
    And clicar no botão Submit
    Then o sistema exibirá uma mensagem que o campo first name e obrigatorio

  Scenario: : Validar um email inválido
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    And preenche o campo Email com email invalido
    When clica no botão Submit
    Then o sistema irá exibira uma mensagem de erro


  Scenario: Somar dois números corretamente
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When visualizar os números exibidos
    And inserir a soma dos dois números no campo de resultado
    Then o campo de resultado deve exibir o valor correto da soma

  Scenario:Enviar formulário de solicitação de demonstração
    Given que o usuário esteja na página de demonstração do PHPTRAVELS
    When preencher os campos First Name, Last Name, Select Country, Whatsapp Number, Business Name, Email e o resultado da soma apresentada na tela
    And clicar no botão Submit
    Then o sistema irá realizar o envio do formulário apresentando mensagem de sucesso
