Feature: Registration


Scenario: Validar campos visíveis
    Given que o usuário esteja na página Registration
    When localizar o campo First Name
    And localizar o campo Last Name
    And localizar o campo Email
    And localizar o campo Password
    And localizar o campo Select Country
    And localizar o campo Whatsapp Number
    Then validar que todos estão visíveis

  Scenario: Validar que o botão Signup esteja com o nome correto
    Given que o usuário esteja na página Registration
    When localizar o botão Signup
    Then validar que o nome do botão esteja correto

  Scenario: Validar email já cadastrado da pagina Registration
    Given que o usuário esteja na página Registration
    When preencher os campos First Name, Last Name, Email, Password, Select Country, Whatsapp Number
    And seleciona a caixa Não sou um robô
    And clicar no botão Signup
    Then o sistema exibirá uma mensagem de email já existe

  Scenario: Enviar formulário de solicitação de registration sem preenchimento dos campos
    Given que o usuário esteja na página Registration
    And não preenche as informações de nenhum campo
    And seleciona a caixa Não sou um robô
    When clicar no botão Signup
    Then uma mensagem de erro deve ser exibida indicando que o campo First Name é obrigatório e os outros campos tambem

  Scenario: Validar o botão Back to Login
    Given que o usuário esteja na página Registration
    When clica no botão Back to Login
    Then ele será redirecionado para a página de Login Panel
