Feature: LoginPanel
  Scenario: Validar o campo Email
    Given que o usuário esteja na página Login Panel
    When visualizar o campo Email
    Then digita seu email no campo Email

  Scenario: Validar o campo Password
    Given  que o usuário esteja na página Login Panel
    When visualizar o campo Password
    Then digita sua senha no campo Password

  Scenario: Clicar no botão Login
  Given que o usuário esteja na página Login Panel
  When clicar no botão Login
  Then o sistema exibirá uma mensagem Email is required to login na tela

  Scenario: Validar o Login com sucesso
    Given que o usuário esteja na página Login Panel
    When preencher o campo de Email
    And Password valido
    And clicar no botão Login
    Then o sistema exibirá uma mensagem de sucesso

  Scenario: Clicar no botão Remember Me
    Given que o usuário esteja na página Login Panel
    When visualizar o botão Remember Me
    And clicar no icone do Remember Me
    Then o icone será marcado com sucesso



