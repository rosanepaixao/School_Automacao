Feature:
  Scenario: Verificar presença do logotipo PHPTRAVELS
    Given que o usuário esteja na página inicial do site PHPTRAVELS
    Then o logotipo PHPTRAVELS Travel Tech Partner está visível
    And logotipo esta escrito PHPTRAVELS Travel Tech Partner

  Scenario: Acessar páginas de políticas do site
    Given que o usuário esteja no rodapé do site PHPTRAVELS
    When clica em Abuse Policy
    Then será redirecionado para a página de política de abuso

  Scenario: Acessar páginas de políticas do site
    Given que o usuário esteja no rodapé do site PHPTRAVELS
    When clica em Privacy Policy
    Then será redirecionado para a página de política de privacidade

  Scenario: Validar o direcionamento para pagina de precos
    Given que o usuário esteja no rodapé do site PHPTRAVELS
    When clica no botão Pricing
    Then Ele é redirecionado para a página de preços

  Scenario: Verificar links para redes sociais
    Given que o usuário esteja no rodapé do site PHPTRAVELS
    When clica no ícone do Facebook
    Then será redirecionado para a página do Facebook da empresa

